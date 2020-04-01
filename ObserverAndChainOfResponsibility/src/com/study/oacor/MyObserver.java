package com.study.oacor;


public interface MyObserver {

    public void attach(Subscriber subscriber);

    public void update(int num);
}
