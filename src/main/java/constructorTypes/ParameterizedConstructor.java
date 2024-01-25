package constructorTypes;

public class ParameterizedConstructor {
    String name;
    int age;
    ParameterizedConstructor(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj= new ParameterizedConstructor("Deepen",25);
        ParameterizedConstructor obj2= new ParameterizedConstructor("Bi-mal",24);

//        System.out.println(obj.name+": "+obj.age);
//        System.out.println(obj2.name+": "+obj2.age);
        obj.display();
        obj2.display();
    }

}

//a constructor is a special method that is used to initialize an object.
// When you create an object using the new keyword,the constructor is called automatically to perform the necessary initialization tasks.


