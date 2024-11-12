package com.example.Microservice.service;

import com.example.Microservice.models.Photographers;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class JsonReaderFromFile {
    public static final String JSON_PATH = "src/main/resources/photographers.json";

    public List<Photographers> readJsonFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonContent = new String(Files.readAllBytes(Paths.get(JSON_PATH)));
        return mapper.readValue(jsonContent, new TypeReference<List<Photographers>>() {
        });

    }
}
