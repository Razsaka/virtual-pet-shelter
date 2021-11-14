package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {



    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
       VirtualPet pet1 = new VirtualPet("Kidd","bird",5,4,6,5);
        VirtualPet pet2 = new VirtualPet("Sam","cat",3,5,3,6);

        petShelter.addPet(pet1);
        petShelter.addPet(pet2);

        System.out.println( "Pet 1 hunger level is "  + pet1.getHunger());
        System.out.println( "Pet 1 boredom level is "  + pet1.getBoredom());


        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Noah's Ark Sanctuary");


        while (petShelter.petsAreAlive()) {
            System.out.println("What would you like to do?");
            System.out.println("1. Fed All Pets");
            System.out.println("2. Water All Pets");
            System.out.println("3. Pet a pet to sleep");
            System.out.println("4. Welcome a new pet");
            System.out.println("5. Adopt a new pet");
            System.out.println("5. Play with a pet");
            System.out.println("6. Give up");

           int option = userInput.nextInt();

            if (option == 1) {
               petShelter.feedAllPets();
               petShelter.allPetStatus();
                System.out.println("Fed all the pets in the shelter");
            } else if (option == 2) {
                petShelter.waterAllPets();
                petShelter.allPetStatus();
                System.out.println("Watered all the Pets");
           } else if (option == 3) {
                petShelter.sleep();
                petShelter.allPetStatus();

                System.out.println(" Pet pet to sleep");

                pet1.sleep();
           } else if (option == 4) {
                Scanner x = new Scanner(System.in);

                System.out.println("Please provide the name of the new pet");
                String petName=x.nextLine();

               System.out.println("Please provide the type of the new pet");
                String petType=x.nextLine();

                System.out.println( "You are now a member of the pet family" );

            } else if (option == 5) {
                Scanner x = new Scanner(System.in);
                petShelter.petName();
                String playWith =x.nextLine();
                petShelter.playWith(playWith);
                System.out.println( "Thank you playing with " +  playWith);

            } else {
               System.out.println("Give up");
               break;
           }
            petShelter.groupTick();

        }
        System.out.println("Game Over!");


        userInput.close();
    }
}
