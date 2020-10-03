package com.NoXMLConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.NoXMLConfig")
@PropertySource("classpath:sport.properties")
public class SportConfigScan {

}
