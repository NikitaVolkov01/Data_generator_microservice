package ru.volkov.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.volkov.datageneratormicroservice.model.Data;
import ru.volkov.datageneratormicroservice.model.DataTestOptions;
import ru.volkov.datageneratormicroservice.service.KafkaDataService;
import ru.volkov.datageneratormicroservice.service.TestDataService;
import ru.volkov.datageneratormicroservice.web.dto.DataDto;
import ru.volkov.datageneratormicroservice.web.dto.DataTestOptionsDto;
import ru.volkov.datageneratormicroservice.web.mapper.DataMapper;
import ru.volkov.datageneratormicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }

}
