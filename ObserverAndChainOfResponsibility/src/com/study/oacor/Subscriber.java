package com.study.oacor;


import java.util.ArrayList;

public abstract class Subscriber {
    public String name;
    private Subscriber next = null;
    private ArrayList<Integer> answerNumber = new ArrayList<>();


    public Subscriber(String name) {
        this.name = name;
    }

    public Subscriber setNext(Subscriber next) {
        this.next = next;
        return next;
    }

    public final void support(int number) {
        if (resolve(number)) {
            answerNumber.add(number);
        }
        else if(next != null) {
            next.support(number);
        }
    }

    public final void result() {
        String anw = name + " result : ";
        for (int i : answerNumber) {
            anw += i + ", ";
        }
        anw = anw.substring(0, anw.length() - 2);
        System.out.println(anw);

        if(next != null) {
            next.result();
        }
    }

    public abstract boolean resolve(int number);

}
