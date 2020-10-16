package com.company;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(11);

        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));
        hashTable.insert(new Obj(10));

        hashTable.show();
    }
}
