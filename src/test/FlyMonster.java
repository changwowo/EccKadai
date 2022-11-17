package test;

public class FlyMonster extends Monster {
    public FlyMonster(String name) {
        this.name = name;
        System.out.println("FlyMonster！");
    }
    public void intro() {
        super.intro();			// Monsterのinro
        System.out.println("空をとべるよ！");
    }

}