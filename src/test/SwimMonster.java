package test;

public class SwimMonster extends Monster {
    public SwimMonster(String name) {
        this.name = name;
        System.out.println("SwimMonster！");
    }
    public void intro() {
        super.intro();			// Monsterのintro
        System.out.println("泳ぎが得意さ！");
    }

}