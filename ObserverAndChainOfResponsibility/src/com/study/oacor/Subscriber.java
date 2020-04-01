package com.study.oacor;


public abstract class Subscriber {
    public String name;
    private Subscriber next = null;


    public Subscriber(String name) {
        this.name = name;
    }

    public Subscriber setNext(Subscriber next) {
        this.next = next;
        return next;
    }

    public void support(int num) {
        resolve(num);

        if (next != null) {
            next.support(num);
        }
    }


    public abstract void resolve(int num);

}
