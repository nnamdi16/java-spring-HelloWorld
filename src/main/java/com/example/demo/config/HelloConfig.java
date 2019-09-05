package com.example.demo.config;
//
import com.example.demo.services.HelloWorldFactory;
import com.example.demo.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

//    @Bean
//
//    public HelloWorldFactory helloWorldFactory() {
//        return new HelloWorldFactory();
//    }

//    @Bean
//    @Profile("default | english")
//    @Primary
//    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("en");
//    }

//    @Bean
//    @Profile("spanish")
//    @Primary
//    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("es");
//    }

//    @Bean(name = "french")
////    @Profile("french")
//    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("fr");
//    }

//    @Bean
////    @Profile("french")
//    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("ge");
//    }

}
