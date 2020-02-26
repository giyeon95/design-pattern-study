package com.study.oacor;

import java.util.ArrayList;

public class SubscriberOb implements MyObserver {
    private ArrayList<Integer> arr;

    @Override
    public void update(ArrayList<Integer> arr) {
        this.arr = arr;
    }
}
