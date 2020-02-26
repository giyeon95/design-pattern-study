package com.study.oacor;

public interface Subject {
    public void registerObserver(MyObserver o);
    public void notifyObservers();
}
