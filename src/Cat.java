/**
 * Created by Richie on 12/9/2016.
 */
public class Cat extends Animal {

    public Cat() {
    }

    //overloading a method Cat will Meow when a Cat type of animal class is called.
    public String makeSound(){
        return "Meow";
    }

    public static void main(String[] args) {

        Animal fido = new Dog();
        Animal luna = new Cat();
        String str = "The real Slim Shady";

        String[] strArray = str.split(" ");

        for(int i = strArray.length - 1; i >= 0; i--)
            System.out.print(strArray[i] + " ");
        System.out.println();

        Animal[] theAnimals = new Animal[10];

        theAnimals[0] = fido;
        theAnimals[1] = luna;

        System.out.println("Fido says " + theAnimals[0].makeSound());
        System.out.println("Luna says " + theAnimals[1].makeSound());

        speakAnimal(luna);


    }
}
