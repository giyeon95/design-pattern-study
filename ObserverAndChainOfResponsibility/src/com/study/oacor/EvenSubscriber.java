package com.study.oacor;

public class EvenSubscriber extends Subscriber {
    public EvenSubscriber(String name) {
        super(name);
    }

    @Override
    public boolean resolve(int number) {
        return number % 2 == 0;
    }
}
