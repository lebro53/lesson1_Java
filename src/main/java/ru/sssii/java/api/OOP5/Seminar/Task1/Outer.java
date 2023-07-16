package ru.sssii.java.api.OOP5.Seminar.Task1;

public class Outer {


    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    class Inner{
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }
        
        public void innerMethod(){
            System.out.println("outerValue = " + outerValue);
            System.out.println("innerValue = " + innerValue);
            outerMethod();

        }
    }

    int outerValue;
    public void outerMethod(){

    }
}
