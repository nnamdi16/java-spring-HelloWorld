package com.example.demo.services;

public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;
        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "ge":
                service = new HelloWorldServiceGermanImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }
        return service;
    }
}

