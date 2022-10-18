package j2kadai07;

public class Yuzu extends HotDrink{
    @Override
    public void makeDrink() {
        System.out.println("ゆずジャムを入れる");
    }

    @Override
    public void hatsu() {
        System.out.println("はちみつを加える");
    }
}
