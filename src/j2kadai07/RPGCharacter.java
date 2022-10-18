package j2kadai07;

public abstract class RPGCharacter {

    public abstract void attack();

    public abstract void defend();

    public abstract void steal();

    public void userItem(){
        System.out.println("何かのアイテムを使います!");
    }
    public final void run(){
        attack();
        defend();
        userItem();
        steal();

    }
}