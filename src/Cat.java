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

        //print original string
        System.out.println("Original String:  " + str);

        //reverse words in the string.
        for(int i = strArray.length - 1; i >= 0; i--)
            System.out.print(strArray[i] + " ");
        System.out.println("\nThe words in the string above were reversed\nThe words in the next example will be the original " +
                "string with the correct words\nprinted in order, but with the letters reversed in each.");
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < strArray.length; i++){
            sbf.append(strArray[i]);
            System.out.print(sbf.reverse() + " ");
            sbf.delete(0, sbf.length());
        }


        Animal[] theAnimals = new Animal[10];

        theAnimals[0] = fido;
        theAnimals[1] = luna;

        System.out.println("Fido says " + theAnimals[0].makeSound());
        System.out.println("Luna says " + theAnimals[1].makeSound());

        speakAnimal(luna);


    }
}
