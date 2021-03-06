package com.AnnotationsConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScan.xml");

        // COACH

        Coach coach = context.getBean("myCoach2", Coach.class);

        logger.info(coach.getDailyWorkout());
        logger.info(coach.getDailyFortune());

        // CRICKET COACH

        CricketCoach cricketCoach = context.getBean(CricketCoach.class);

        logger.info(cricketCoach.getDailyWorkout());
        logger.info(cricketCoach.getDailyFortune());

        logger.info(cricketCoach.getEmailAddress());
        logger.info(cricketCoach.getTeam());

        //

        context.close();
    }
}
