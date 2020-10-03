package com.AnnotationsConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCoach2")
public class BaseballCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(BaseballCoach.class);

    private FortuneService fortune;

    @Autowired
    public BaseballCoach(@Qualifier("badFortune") FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball workout!";
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
