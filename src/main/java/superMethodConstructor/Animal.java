package superMethodConstructor;

public class Animal {  //superclass
final String name;
public Animal(String AnimalName)
{
    this.name= AnimalName;
     System.out.println("Name of the animal is"+": "+AnimalName);
     }
}
     class Breed extends Animal{
     final String size;
     public Breed(String name,String AnimalSize)
     {
          super(name);
          this.size=AnimalSize;
          System.out.println("Color of the animal is"+": "+AnimalSize);
     }
}



