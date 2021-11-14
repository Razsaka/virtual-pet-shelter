package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class VirtualPetShelterTest {

@Test
public void shouldAddPet() {
    VirtualPet newPet = new VirtualPet("Sam","dog",5,4,6,5);
    VirtualPetShelter shelter = new VirtualPetShelter();
    shelter.addPet(newPet);
    assertTrue(shelter.getAllPets().contains(newPet));
}
@Test
public void shouldFeedAllPets() {
    VirtualPet newPet2 = new VirtualPet("Gaf","cat",5,3,7,5);
    VirtualPetShelter shelter = new VirtualPetShelter();
    shelter.addPet(newPet2);
    shelter.feedAllPets();
    assertEquals(0, newPet2.getHunger());

}
@Test
public void shouldWaterAllPets() {
    VirtualPet newPet2 = new VirtualPet("Gaf","cat",5,3,7,5);
    VirtualPetShelter shelter = new VirtualPetShelter();
    shelter.addPet(newPet2);
    shelter.waterAllPets();
    assertEquals(0, newPet2.getThirst());
}

@Test
    public void petsAreAlive() {
    VirtualPet newPet2 = new VirtualPet("Gaf","cat",20,25,7,5);
    VirtualPetShelter shelter = new VirtualPetShelter();
    shelter.addPet(newPet2);
    assertFalse(shelter.petsAreAlive());
}

@Test
public void shouldSleepAllPets() {
    VirtualPet newPet2 = new VirtualPet("Gaf","cat",5,3,7,5);
    VirtualPetShelter shelter = new VirtualPetShelter();
    shelter.addPet(newPet2);
    shelter.sleep();
    assertEquals(0, newPet2.getFatigue());
}
}



