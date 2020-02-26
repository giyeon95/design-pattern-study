package com.study.oacor;

import java.util.ArrayList;

public class Publisher implements Subject{
    private ArrayList<MyObserver> observers;
    private ArrayList<Integer> arr;

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(MyObserver o: observers) {
            o.update(arr);
        }
    }
    public void changed() {
        notifyObservers();
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arr = arrayList;
        changed();
    }
}
