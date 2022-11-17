package test;

public class J2Test13_4 {
    public static void main(String[] args) {
        Monster m = new Monster("ピカチュウ");
        m.intro();

        System.out.println();

        FlyMonster fm = new FlyMonster("ムックル");
        fm.intro();

        System.out.println();

        SwimMonster sm = new SwimMonster("コイキング");
        sm.intro();
    }
}
