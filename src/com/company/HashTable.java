package com.company;

public class HashTable {
    private Obj hash[];
    private int _count = 0;

    HashTable(int size) {
        hash = new Obj[size];
    }

    private int index(short key) {
        return key % hash.length;
    }

    private boolean isFull() {
        return _count == hash.length - 1;
    }

    void insert(Obj obj){
        if (isFull()) return;

        int i = index(obj.key);
        if (hash[i] == null){
            hash[i] = obj;
            _count++;
        }
        else{
            for (int j = i; j < hash.length; j++){
                if (hash[j] == null){
                    hash[j] = obj;
                    break;
                }
                if (j == hash.length - 1){
                    for (int k = 0; k < i; k++){
                        if (hash[k] == null){
                            hash[k] = obj;
                            break;
                        }
                    }
                }
            }
        }
    }

    void show(){
        for (int i = 0; i < hash.length; i++){
            if (hash[i] != null) System.out.println(i + " " + hash[i].key + " " + hash[i].data + "\n");
        }
    }
}
