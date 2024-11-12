package com.example.Microservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Subscription {
    private String plan;
    private String status;
    private String payment_method;
    private String term;
}
