package ru.volkov.datageneratormicroservice.service;

import ru.volkov.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
