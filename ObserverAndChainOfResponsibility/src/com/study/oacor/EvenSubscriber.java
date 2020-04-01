package com.study.oacor;

public class EvenSubscriber extends Subscriber {
    public EvenSubscriber(String name) {
        super(name);
    }

    @Override
    public void resolve(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수 입니다.");
        }
    }
}
