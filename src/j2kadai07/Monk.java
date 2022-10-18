package j2kadai07;

public class Monk extends RPGCharacter{
    public void attack() {
        System.out.println("素手で戦います!");
    }
    public void defend() {
        System.out.println("素手で防御します!");
    }

    @Override
    public void steal() {

    }
}
