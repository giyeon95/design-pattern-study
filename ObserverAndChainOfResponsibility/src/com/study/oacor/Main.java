package com.study.oacor;

public class Main {

    public static void main(String[] args) {
        Subscriber oddSubscriber = new OddSubscriber("Odd!");
        Subscriber evenSubscriber = new EvenSubscriber("Even!");

        oddSubscriber.setNext(evenSubscriber);

        SubscriberOb subscriberOb1 = new SubscriberOb();
        SubscriberOb subscriberOb2 = new SubscriberOb();



        for (int i = 0 ; i< 20 ; i++) {
            oddSubscriber.support(i);
        }
        oddSubscriber.result();
    }
}
