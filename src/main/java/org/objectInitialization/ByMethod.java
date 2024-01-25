package org.objectInitialization;

public class ByMethod {
    String color;
    int age;

    void initObj(String c, int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println("color is:"+" "+color);
        System.out.println("Age is :"+" "+age);
    }

    public static void main(String[] args) {
        ByMethod call= new ByMethod();
        call.initObj("Red",10);
        call.display();
    }
}
