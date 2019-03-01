package com.liulei.study;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-quartz.xml");
        //applicationContext.start();
    }
}
