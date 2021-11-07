package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class
VirtualPetShelter<pets> {

    Map<String, VirtualPet> shelter = new HashMap<>();

    public void addPet(VirtualPet pet1) {
        shelter.put(pet1.getPetName(), pet1);
    }

    public void adoptPet(VirtualPet pet) {
        shelter.remove(pet.getPetName(), pet);
    }

    public Collection<VirtualPet> getAllPets() {
        return shelter.values();
    }


    public void allPetStatus(Collection<VirtualPet> petCollection) {

    }

    public void waterAllPets() {
        for (VirtualPet pet : shelter.values()) {
            pet.giveWater();
        }

        public void feedAllPets() {
            for (VirtualPet pet : shelter.values()) {
                pet.feedPet();
            }

            public void groupTick() {
                for (VirtualPet pet : pets()) {
                    pet.tick();
                }
            }
        }


        }
    }







