package com.rs.springframework.demoCustomAutoConfig.config;

import com.rs.springframework.demoCustomAutoConfig.custom.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rs on 1/22/2018.
 */
//@Configuration
public class AppConfig {

    @Bean
    public GreetingService getOverriddenService(){
        return new GreetingService(){
            @Override
            public String getGreeting() {
                return "Overridden service";
            }
        };
    }
}
