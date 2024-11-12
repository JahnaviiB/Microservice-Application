package com.example.Microservice.controller;

import com.example.Microservice.models.Photographers;
import com.example.Microservice.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/photographers")
public class PhotographerController {

    @Autowired
    public PhotographerService photographerService;

        // Get all photographers
        @GetMapping("/allphotogrpahers")
        public List<Photographers> getAllPhotographers() throws IOException {
            return PhotographerService.getAllPhotographers();
        }

        // Get photographers by id
        @GetMapping("/photogrpaherbyid/{id}")
        public Photographers getPhotographerbyID(@PathVariable int id) throws IOException {
            return PhotographerService.getAllPhotographers().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        }
        // Get photographer by event_type
        @GetMapping("/photogrpaherbyeventtype/{event_type}")
        public List<Photographers> getPhotographerbyeventtype(@PathVariable String event_type) throws IOException {
            return PhotographerService.getAllPhotographers().stream().filter(p -> p.getEvent_type()!=null && p.getEvent_type().getType().contains(event_type)).collect(Collectors.toList());
        }
    }
