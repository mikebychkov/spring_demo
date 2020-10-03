package com.XMLConfig;

public class BaseballCoach implements Coach {

    private FortuneService fortune;

    public BaseballCoach(FortuneService fortune) {
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

    @Override
    public void initMethod() {

    }

    @Override
    public void destroyMethod() {

    }
}
