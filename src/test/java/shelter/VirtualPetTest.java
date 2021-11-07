package shelter;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet();
    @Test
    public void ThatSizeReturnOneAfterAdopted(){
       VirtualPet pet1 = new VirtualPet();
              int check1 = pet1.getAdmit();
       assertEquals(0, check1);


    @Test
    public void ThatPetsHungerReturnZeroAfterFeeding(5){
        VirtualPet pet = new VirtualPet();
        int check2 = pet.getHunger();
        assertEquals(0, check1);

    }

    @Test
    public void ThatPetsThirstReturnZeroAfterFeeding(){
        VirtualPet pet = new VirtualPet();
        int check2 = pet.getThirst();
        assertEquals(0, check1);

    }

    private void assertEquals(int i, int check1) {
    }


}

    private void assertEquals(int i, int check1) {
    }
