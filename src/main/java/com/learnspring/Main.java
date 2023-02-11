package com.learnspring;

import com.learnspring.service.SpeakerService;
import com.learnspring.service.SpeakerServiceImpl;

public class Main {
    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());

        System.out.println("Hello world!");
    }
}