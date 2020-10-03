package com.NoXMLConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService() {
        FortuneService fs = new HappyFortuneService();
        return fs;
    }

    @Bean
    public Coach swimCoach() {
        Coach coach = new SwimCoach(happyFortuneService());
        return coach;
    }
}
