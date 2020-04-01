package com.study.oacor;



public abstract class Subscriber {
    public String name;
    private Subscriber next = null;
    private int answerNumber;


    public Subscriber(String name) {
        this.name = name;
    }

    public Subscriber setNext(Subscriber next) {
        this.next = next;
        return next;
    }
//
//    public final void support(int number) {
//        if (resolve(number)) {
//            answerNumber.add(number);
//        }
//        else if(next != null) {
//            next.support(number);
//        }
//    }
//
//    public final void result() {
//        String anw = name + " result : ";
//        for (int i : answerNumber) {
//            anw += i + ", ";
//        }
//        anw = anw.substring(0, anw.length() - 2);
//        System.out.println(anw);
//
//        if(next != null) {
//            next.result();
//        }
//    }

    public abstract boolean resolve(int number);

}
