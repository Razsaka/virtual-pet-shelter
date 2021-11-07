package shelter;

public class VirtualPet {

    private String petName;
    private String petType;
    private static int hunger;
    private int thirst;
    private int fatigue;
    private int admit;


    public VirtualPet() {

        this.petName=petName;
        this.petType=petType;
        this.hunger=hunger;
        this.thirst= thirst;
        this.fatigue= fatigue;
        this.admit= admit;
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

    public int getAdmit() {
        return admit;
    }

    public void tick() {
        hunger++;
        thirst++;
        fatigue++;
    }

    public void feedPet() {
        hunger = hunger -10;
        thirst++;
        fatigue++;
    }
    public void giveWater(){
        thirst= thirst - 6;
        hunger++;
        fatigue++;
    }
    public void sleep() {
        fatigue = fatigue -15;
        hunger++;
        fatigue++;
    }

    public void setAdmit() {
        admit= admit -2;
        hunger++;
        fatigue++;
    }




}
