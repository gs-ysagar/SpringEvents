package com.gainsight.springevents.listeners;

import com.gainsight.springevents.events.TheFamilyManEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener3 {

    public void watchingTheFamilyMan(Integer epNo) {
        System.out.println("Listener 3: Started Watching The Family Man Show");
        System.out.println("Listener 3: Playing The Family Man Show Episode - " + epNo);
    }

    @EventListener
    public void watchingShowEvent(TheFamilyManEvent event) {
        watchingTheFamilyMan(event.getEpisode());
    }
}
