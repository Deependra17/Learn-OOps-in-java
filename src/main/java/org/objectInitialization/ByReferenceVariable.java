package org.objectInitialization;

public class ByReferenceVariable {
    String color;
    int age;
    public static void main(String[] args) {

        ByReferenceVariable obj= new ByReferenceVariable();
        obj.color= "White";
        obj.age=10;
        System.out.println("Color of animal is:"+" "+ obj.color);
        System.out.println("Age of the animal:"+" "+obj.age);
    }
}