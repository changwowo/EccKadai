package j2kadai07;

public class Fighter extends RPGCharacter{
    public void attack() { System.out.println("武器で攻撃します！"); }
    public void defend() { System.out.println("盾で防御します！"); }

    @Override
    public void steal() {

    }
    // public void useItem() { System.out.println("何かのアイテムを使います！"); }
}
