package com.XMLConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CricketCoach implements Coach {

    private static final Logger logger = LogManager.getLogger(CricketCoach.class);

    private FortuneService fortune;

    private String emailAddress;
    private String team;

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

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

    @Override
    public void initMethod() {

    }

    @Override
    public void destroyMethod() {

    }
}
