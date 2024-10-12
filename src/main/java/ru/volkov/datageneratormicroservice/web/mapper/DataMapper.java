package ru.volkov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.volkov.datageneratormicroservice.model.Data;
import ru.volkov.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
