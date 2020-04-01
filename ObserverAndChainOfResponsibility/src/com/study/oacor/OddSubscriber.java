package com.study.oacor;

public class OddSubscriber extends Subscriber {

    public OddSubscriber(String name) {
        super(name);
    }

    @Override
    public void resolve(int num) {
        if (num % 2 != 0) {
            System.out.println(num + "은 홀수입니다.");
        }
    }
}
