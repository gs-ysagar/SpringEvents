package com.gainsight.springevents;

import com.gainsight.springevents.config.AppConfig;
import com.gainsight.springevents.publishers.AmazonPrimePublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventsApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AmazonPrimePublisher bean = context.getBean("amazonPrimePublisher", AmazonPrimePublisher.class);
		bean.broadcastTheFamilyMan(1);

	}

}
