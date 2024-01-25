package constructorTypes;

public class DefaultConstructor {
    int i;
    String s;
    public static void main(String[] args) {
        DefaultConstructor obj= new DefaultConstructor();
        System.out.println(obj.i+" "+obj.s);
    }
}
//here the output will be zero and null because compiler will create a default constructor
// and default constructor it will create a default value for these objects.

