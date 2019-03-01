package com.liulei.study.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ExampleBusinessObject {
    private final Logger logger = LoggerFactory.getLogger(ExampleBusinessObject.class);
    public void doIt(){
        logger.info("ExampleBusinessObject: "+new Date());
    }
}
