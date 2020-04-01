package com.study.oacor;

public class Main {

    public static void main(String[] args) {
        Subscriber oddSubscriber = new OddSubscriber("Odd!");
        Subscriber evenSubscriber = new EvenSubscriber("Even!");

        oddSubscriber.setNext(evenSubscriber);

        MyObserver observer = new SubscriberOb();
        observer.attach(oddSubscriber);


        for (int i = 0; i < 20; i++) {
            observer.update(i);
        }

    }
}
