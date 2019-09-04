package com.example.demo.config;
//
import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceEnglishImpl;
import com.example.demo.services.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("default | english")
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return  new HelloWorldSpanishImpl();
    }
}
