package com.liulei.study.example;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

public class ExampleJob extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(ExampleJob.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("ExampleJob: "+new Date());
    }
}
