package test;

public class Monster {
    protected String name;            // 名前
    public Monster(){
        System.out.println("Monsterクラスのコンストラクタが呼ばれました。");
    }
    public Monster(String name) {
        this.name = name;
        System.out.println("Monster！");
    }
    public void intro() {
        System.out.println("ぼくの名前は" + name + "。");
    }
}