package ru.volkov.datageneratormicroservice.service;

import ru.volkov.datageneratormicroservice.model.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions dataTestOptions);
}
