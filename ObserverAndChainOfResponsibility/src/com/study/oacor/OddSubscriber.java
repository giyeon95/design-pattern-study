package com.study.oacor;

public class OddSubscriber extends Subscriber {

    public OddSubscriber(String name) {
        super(name);
    }

    @Override
    public boolean resolve(int number) {
        return number % 2 != 0;
    }
}
