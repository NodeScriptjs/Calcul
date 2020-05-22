package com.scan;

public class Div {
    private int a;
    private int b;

    public Div(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void div(){
        System.out.println("Ответ: " + (this.a / this.b));
    }
}
