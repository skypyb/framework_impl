package com.skypyb.config;


import com.skypyb.core.ann.EnableSkypyb;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.skypyb")
@EnableSkypyb("com.skypyb.dao")
@Configuration
public class MainConfig {

}
