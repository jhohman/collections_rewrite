package com.collections;

public class ArrayList implements List {
    private Object[] objects;

    public ArrayList() {
        objects = new Object[10];
    }

    public int size() {
        int count = 0;
        for(Object obj : objects) {
            if(obj != null) count++;
        }
        return count;
    }

    public void add(Object object) {
        objects[0] = object;
    }
}

