package j2kadai07;

public class Mage extends RPGCharacter{
    public void attack() { System.out.println("攻撃の魔法を唱えます！"); }
    public void defend() { System.out.println("防御の魔法を唱えます！"); }

    @Override
    public void steal() {

    }
    //public void useItem() { System.out.println("何かのアイテムを使います！"); }
}
