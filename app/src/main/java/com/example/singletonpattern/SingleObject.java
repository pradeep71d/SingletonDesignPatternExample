package com.example.singletonpattern;

public class SingleObject {
    private  static  SingleObject singleObject=new SingleObject();//creating a object of class SingleObject
    private SingleObject(){ //making private constructor so that it can not be instanisiated.
    }
    public static SingleObject getInstance(){
        return singleObject;
    }
    public void show(){
        System.out.println("this is singleton pattern example");
    }
}
