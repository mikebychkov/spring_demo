package com.NoXMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppScan {

    private static final Logger logger = LogManager.getLogger(com.AnnotationsConfig.MyApp.class);

    public static void main(String[] args) {

        // CRICKET COACH

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigScan.class);

        CricketCoach cricketCoach = context.getBean(CricketCoach.class);

        logger.info(cricketCoach.getDailyWorkout());
        logger.info(cricketCoach.getDailyFortune());

        logger.info(cricketCoach.getEmailAddress());
        logger.info(cricketCoach.getTeam());

        context.close();
    }
}
