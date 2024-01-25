package superMethodConstructor;

public class SuperInConstructor {  //superclass
    final String name;

    public SuperInConstructor(String DogName) {    //constructor of superclass
        this.name = DogName;
        System.out.println("Name of the dog" + ": " + DogName);
    }
}
     class DogType extends SuperInConstructor {  //subclass
         final String breed;

         public DogType(String name, String DogBreed) {  //constructor of subclass
             super(name);
             this.breed = DogBreed;
             System.out.println("Breed of the dog is" + ": " + DogBreed);
         }
     }



