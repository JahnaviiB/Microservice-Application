package com.example.Microservice.service;

import com.example.Microservice.models.Photographers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Microservice.service.JsonReaderFromFile;

import java.io.IOException;
import java.util.List;

@Service
public class PhotographerService {

    @Autowired
    private JsonReaderFromFile jsonReaderFromFile;

    public static List<Photographers> getAllPhotographers() throws IOException {
        JsonReaderFromFile jsonreaderFromFile = new JsonReaderFromFile();
        return jsonreaderFromFile.readJsonFile();
    }
}