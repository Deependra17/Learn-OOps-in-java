package org.objectInitialization;

public class UsingConstructor {
    String emp_name;
    int emp_id;
    UsingConstructor(String emp_name, int emp_id){
        this.emp_name=emp_name;
        this.emp_id= emp_id;
    }

    public static void main(String[] args) {
        UsingConstructor e1= new UsingConstructor("Deepen",101);
        UsingConstructor e2= new UsingConstructor("Bi-mal",102);
        System.out.println(e1.emp_name+" "+e1.emp_id);
        System.out.println(e2.emp_name+" "+e2.emp_id);
    }
}
