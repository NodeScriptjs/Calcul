package com.scan;

public class Plus {
    private int a;
    private int b;

    public Plus(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void add() {
        System.out.println("Ответ: " + (this.a + this.b));
    }
}
