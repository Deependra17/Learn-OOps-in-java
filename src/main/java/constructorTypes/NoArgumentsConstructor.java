package constructorTypes;

public class NoArgumentsConstructor {
    String name;
    int age;
    NoArgumentsConstructor()
    {
    this.name="Deepen";
    this.age=25;
    }

    public static void main(String[] args) {
        NoArgumentsConstructor obj= new NoArgumentsConstructor();
        System.out.println(obj.name+" "+obj.age);
    }
}

//When we create an object then it will automatically call the constructor
