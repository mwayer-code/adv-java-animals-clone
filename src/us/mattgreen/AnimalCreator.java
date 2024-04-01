package us.mattgreen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalCreator {
    public Talkable createAnimal(){
        Scanner scanner = new Scanner(System.in);

        try {System.out.println("What type of pet do you want to create?");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            String animalType = scanner.nextLine();

            switch (animalType.toLowerCase()){
                case "1":
                    System.out.println("Enter the dog's name:");
                    String dogName = scanner.nextLine();
                    System.out.println("Is the dog friendly? (true/false)");
                    boolean isFriendly = scanner.nextBoolean();
                    return new Dog(isFriendly, dogName);

                case "2":
                    System.out.println("Enter the cat's name:");
                    String catName = scanner.nextLine();
                    System.out.println("How many Mice has the Cat killed?");
                    int miceKilled = scanner.nextInt();
                    return new Cat(miceKilled, catName);

                default:
                    System.out.println("Invalid pet type.");
                    return null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            return null;
        } finally {
            scanner.close();
        }
    }
}
