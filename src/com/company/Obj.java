package com.company;

public class Obj {
    int data;
    short key;

    Obj(int value) {
        key = (short)(Math.random()*10);
        data = value;
    }

    public boolean equals(Object other) {
        if ((this.data == ((Obj) other).data) && (this.key == ((Obj) other).key)) return true;
        else return false;
    }
}
