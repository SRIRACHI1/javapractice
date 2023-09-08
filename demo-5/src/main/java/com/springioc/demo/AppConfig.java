package com.springioc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public MessageService emailService() {
        return new EmailService();
    }
    
    @Bean
    public MessageClient messageClient() {
        return new MessageClient(emailService());
    }
}