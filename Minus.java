package com.scan;

public class Minus {
   private int a;
   private int b;

   public Minus(int a, int b){
       this.a = a;
       this.b = b;
   }

    public void subs(){
        System.out.println("Ответ: " + (this.a - this.b));
    }
}
