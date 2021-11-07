package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

    private static VirtualPetShelter petShelter = new VirtualPetShelter();

    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet();
        VirtualPet pet2 = new VirtualPet();

        petShelter.addPet(pet1);
        petShelter.addPet(pet2);

        Collection<VirtualPet> petCollection = petShelter.getAllPets();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Noah's Ark Sanctuary");


        Scanner input;
        while (pet1.getFatigue() > 0 && pet1.getHunger() > 0 && pet1.getThirst() > 0) {
            System.out.println("What would you like to do?");
            System.out.println("1. Fed All Pets");
            System.out.println("2. Water All Pets");
            System.out.println("3. Pet a pet to sleep");
            System.out.println("4. Welcome a new pet");
            System.out.println("5. Gives up a pet for adoption");
            System.out.println("6. Give up");

            int option = userInput.nextInt();

            if (option == 1) {
                System.out.println("You Fed all the pets");
                pet1.feedPet();
            } else if (option == 2) {
                System.out.println("Watered all Pets");
            } else if (option == 3) {
                pet1.giveWater();
                System.out.println("Pet a pet to sleep");
                pet1.sleep();
            } else if (option == 4) {

                System.out.println("You admit a new pet");
                pet1.setAdmit();
            } else {
                System.out.println("Give up");
                break;
            }
            pet1.tick();

        }
        System.out.println("Game Over!");


        userInput.close();
    }
}
