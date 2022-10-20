package j2kadai07;

public abstract class RPGCharacter { //  抽象クラスを作る

    public abstract void attack(); // 抽象Methodを宣言

    public abstract void defend();

    public void steal(){} // Thiefだけ使うからこれだけただのclassにする

    public void userItem(){
        System.out.println("何かのアイテムを使います!");
    }
    public final void run(){ //Templeate Method シナリオ
        attack();
        defend();
        userItem();
        steal();

    }
}