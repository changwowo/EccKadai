package j2kadai07;

public class Thief extends RPGCharacter{
    @Override
    public void attack() {
        System.out.println("素早く背後にまわって不意打ちします!");
    }

    @Override
    public void defend() {
        System.out.println("素早く攻撃をかわします!");
    }

    public void steal(){
        System.out.println("何かを盗みます!"); //  ThiefのMeyhod
    }
}
