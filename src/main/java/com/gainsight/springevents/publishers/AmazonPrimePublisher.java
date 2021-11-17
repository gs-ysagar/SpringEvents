package com.gainsight.springevents.publishers;

import com.gainsight.springevents.events.TheFamilyManEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AmazonPrimePublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void broadcastTheFamilyMan(Integer epNo) {

        System.out.println("Amazon Prime: Starting The Family Man " + epNo);
        applicationEventPublisher.publishEvent(new TheFamilyManEvent(epNo));

    }
}
