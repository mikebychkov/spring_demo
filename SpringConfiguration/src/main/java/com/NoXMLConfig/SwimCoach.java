package com.NoXMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SwimCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(SwimCoach.class);

    private FortuneService fortune;

    public SwimCoach(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim workout!";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
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
