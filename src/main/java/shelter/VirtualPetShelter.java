package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> shelter = new HashMap<>();

    public void addPet(VirtualPet pet1) {
        shelter.put(pet1.getPetName(), pet1);
    }

    public void adoptPet(VirtualPet pet) {
        shelter.remove(pet.getPetName(), pet);
    }

    public void playWith(VirtualPet pet) {
//        shelter.
    }

    public Collection<VirtualPet> getAllPets() {
        return shelter.values();
    }

    public void allPetStatus() {
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet.getPetName() + "'s hunger level is " + pet.getHunger());
            System.out.println(pet.getPetName() + "'s thirst level is " + pet.getThirst());
            System.out.println(pet.getPetName() + "'s fatigue level is " + pet.getFatigue());
            System.out.println(pet.getPetName() + "'s fatigue level is " + pet.getBoredom());

        }

    }

    public void waterAllPets() {
        for (VirtualPet pet : shelter.values()) {
            pet.giveWater();
        }
    }

    public void feedAllPets() {
        for (VirtualPet pet : shelter.values()) {
            pet.feedPet();
        }
    }

    public boolean petsAreAlive() {
        for (VirtualPet pet : shelter.values()) {
            if (pet.getHunger() >= 10 || pet.getThirst() >= 8) {
                return false;
            }
        }
        return true;
    }

    public void sleep() {
        for (VirtualPet pet : shelter.values()) {
            pet.sleep();
        }

    }

    public void petName() {
        System.out.println("Choose a pet:");
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet.getPetName());
        }
    }

    public void groupTick() {
        for (VirtualPet pet : shelter.values()) {
            pet.tick();
        }
    }

    public void playWith(String x) {
        shelter.get(x).playWith();
    }


}



