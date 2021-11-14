package shelter;

public class VirtualPet {

    private String petName;
    private String petType;
    private int hunger;
    private int thirst;
    private int fatigue;
    private int boredom;


    public VirtualPet(String petName, String petType, int hunger, int thirst, int fatigue, int boredom) {

        this.petName = petName;
        this.petType = petType;
        this.hunger = hunger;
        this.thirst = thirst;
        this.fatigue = fatigue;
        this.boredom = boredom;

    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getBoredom() {
        return boredom;
    }


    public void tick() {
        hunger++;
        thirst++;
        fatigue++;
        boredom++;
    }

    public void feedPet() {
        hunger = hunger - hunger;
        thirst++;
        fatigue++;
    }

    public void giveWater() {
        thirst = thirst - thirst;
        hunger++;
        fatigue++;
    }

    public void sleep() {
        fatigue = fatigue - fatigue;
        hunger++;
        thirst++;
        boredom++;
    }


    public void playWith() {
        boredom=boredom-boredom;
        hunger++;
        thirst++;
    }
}