package com.XMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrackCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(TrackCoach.class);

    private FortuneService fortune;

    public TrackCoach(FortuneService fortune) {
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

    @Override
    public void initMethod() {
        logger.debug("initMethod");
    }

    @Override
    public void destroyMethod() {
        logger.debug("destroyMethod");
    }
}
