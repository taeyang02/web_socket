package com.example.websocket_springboot.config;

import com.example.websocket_springboot.ws.DataHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDataHandler {
    @Bean
    DataHandler dataHandler() {
        return new DataHandler();
    }
}
