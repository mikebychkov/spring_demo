package com.AnnotationsConfig;

import org.springframework.stereotype.Component;

@Component("badFortune")
public class BadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "That's a bad, bad result!";
    }
}
