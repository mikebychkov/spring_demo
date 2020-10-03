package com.AnnotationsConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCoach")
public class TrackCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(TrackCoach.class);

    private FortuneService fortune;

    @Autowired
    public TrackCoach(@Qualifier("happyFortune") FortuneService fortune) {
        logger.debug("Constructor");
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Track workout!";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it : " + fortune.getFortune();
    }

    @PostConstruct
    @Override
    public void initMethod() {
        logger.debug("initMethod");
    }

    @PreDestroy
    @Override
    public void destroyMethod() {
        logger.debug("destroyMethod");
    }
}
