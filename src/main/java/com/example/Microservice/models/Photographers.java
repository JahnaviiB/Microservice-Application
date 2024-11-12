package com.example.Microservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Photographers {
    private int id;
    private String uid;
    private String password;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    private String phone_number;
    private String social_insurance_number;
    private String date_of_birth;
    private Eventtype event_type;
    private Address address;
    private Map<String,String> credit_card;
    private Map<String,String> subscription;

}