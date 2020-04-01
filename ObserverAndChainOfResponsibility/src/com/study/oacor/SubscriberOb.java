package com.study.oacor;

import java.util.ArrayList;
import java.util.List;


public class SubscriberOb implements MyObserver {
    private int myNum;
    private List<Subscriber> subscribers;

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void update(int num) {
        if(myNum != num) {
            subscribers.forEach( observer -> {
                observer.result();
            });
        }

    }

    public int getMyNum() {
        return myNum;
    }
}
