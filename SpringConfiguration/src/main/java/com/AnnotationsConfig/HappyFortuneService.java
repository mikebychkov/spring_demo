package com.AnnotationsConfig;

import org.springframework.stereotype.Component;

@Component("happyFortune")
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
