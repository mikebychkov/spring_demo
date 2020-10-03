package com.NoXMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    private static final Logger logger = LogManager.getLogger(com.AnnotationsConfig.MyApp.class);

    public static void main(String[] args) {

        // SWIM COACH

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean(SwimCoach.class);

        logger.info(swimCoach.getDailyWorkout());
        logger.info(swimCoach.getDailyFortune());

        context.close();
    }
}
