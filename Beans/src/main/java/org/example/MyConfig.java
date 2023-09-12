package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    public Pet petBean(){
        return new Cat();
    }
}
