package com.Main;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.meth());
    }
   public static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}