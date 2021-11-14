package shelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {


    VirtualPet underTest = new VirtualPet("Bob","Dragon", 5,5,5,5);

    @Test
    public void shouldFeedPet(){
        underTest.feedPet();
        assertEquals(0,underTest.getHunger());
    }

    @Test
    public void shouldGiveWater() {
        underTest.giveWater();
        assertEquals(0,underTest.getThirst());

    }

    @Test
    public void shouldPetToSleep() {
        underTest.sleep();
        assertEquals(0,underTest.getFatigue());


    }
    @Test void shouldPlayWithAPet() {
        underTest. playWith();
        assertEquals(0,underTest.getBoredom());

    }
//    @Test
//    public void shouldAddAPet() {
//        underTest.admitPet();
//        assertEquals(1,underTest.getAdmit());

        }
//    }






