package com.rs.springframework.demoCustomAutoConfig.custom.config;

import com.rs.springframework.demoCustomAutoConfig.custom.service.GreetingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rs on 1/22/2018.
 */

@Configuration
@ConditionalOnClass(GreetingService.class)
public class CustomAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GreetingService customService() {
      return new GreetingService(){
            @Override
            public String getGreeting() {
                return "Returing-default";
            }
        };
    }
}
