/**
 * Created by Richie on 12/9/2016.
 */
public class Cat extends Animal {

    public Cat() {
    }

    public String makeSound(){
        return "Meow";
    }

    public static void main(String[] args) {

        Animal fido = new Dog();
        Animal luna = new Cat();

        Animal[] theAnimals = new Animal[10];

        theAnimals[0] = fido;
        theAnimals[1] = luna;

        System.out.println("Fido says " + theAnimals[0].makeSound());
        System.out.println("Luna says " + theAnimals[1].makeSound());

        speakAnimal(luna);
    }
}
