package ru.volkov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.volkov.datageneratormicroservice.model.DataTestOptions;
import ru.volkov.datageneratormicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
