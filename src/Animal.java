import java.util.Scanner;

/**
 * Created by Richie on 12/9/2016.
 */

public class Animal {

    public static final double FAVNUMBER = 1.2150;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userinput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 3 + 1;
        System.out.println("3 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 3 - 1;
        System.out.println("3 - 1 = " + diffOfNumbers);

        int multOfNumbers = 3 * 1;
        System.out.println("3 * 1 = " + multOfNumbers);

        int divOfNumbers = 3 / 1;
        System.out.println("3 / 1 = " + divOfNumbers);

        int modOfNumbers = 3 % 1;
        System.out.println("3 % 1 = " + modOfNumbers);
    }

    public static void main(String[] args){
        Animal theAnimal  = new Animal();
    }
}
