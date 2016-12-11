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

    static Scanner userInput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    //example of method overloading
    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;
        //random number generator and example of type casting.
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
        System.out.println("Unique ID set to: " + this.uniqueID);

        /*
        more examples of type casting. Long to string.
        String stringNumber = Long.toString(maxNumber);
        int numberString = Integer.parseInt(stringNumber);
        */
    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar() {
        //Generating a random letter character
        int randomNumber = (int) (Math.random() * 126 + 1);
        this.favoriteChar = (char) randomNumber;

        //if else example
        if(randomNumber == 32){
            System.out.println(" Favorite character set to Space");
        } else if (randomNumber == 10){
            System.out.println(" Favorite character set to Newline");
        } else {
            System.out.println(" Favorite character set to " + this.favoriteChar);
        }

        //logical operator examples
        if((randomNumber > 97) && (randomNumber < 122)){
            System.out.println("Favorite character is a lowercase letter");
        }
        if(((randomNumber > 97) && (randomNumber < 122))) || (((randomNumber > 64) && (randomNumber < 91))){
            System.out.println("Favorite character is a letter");
        }

        //ternary operator ex. if num is < 50, then which is bigger will = 50,
        //else randomNumber will get assigned to which is bigger.
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        //switch statement example with ternary operator.
        switch (randomNumber){
            case 8:
                System.out.println("Favorite character set to backspace");
                break;
            //each case below will result in the same output.
            case 10:
            case 11:
            case 12:
                System.out.println("Favorite character set to backspace");
                break;


        }


    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Animal() {
        numberOfAnimals++;

        //basic mathematical operations
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

        //user prompt
        System.out.print("Enter the name : \n");

        //user input example
        if(userInput.hasNextLine()){

            this.setName(userInput.nextLine());
        }

        this.setFavoriteChar();
        this.setUniqueID();
    }

    public static void main(String[] args){
        Animal theAnimal  = new Animal();
    }
}
