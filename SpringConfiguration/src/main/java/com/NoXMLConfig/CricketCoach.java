package com.NoXMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(CricketCoach.class);

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortune;

    private String emailAddress;
    private String team;

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Value("${foo.email}")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Value("${foo.team}")
    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket workout!";
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
