package com.study.oacor;

import java.util.ArrayList;
import java.util.List;


public class SubscriberOb implements MyObserver {
    private List<Subscriber> subscribers = new ArrayList<>();


    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void update(int num) {
        subscribers.forEach(subscriber -> subscriber.support(num));
    }
}
