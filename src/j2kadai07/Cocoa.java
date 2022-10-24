package j2kadai07;

public class Cocoa extends HotDrink{
    @Override
    public void makeDrink() {
        System.out.println("ココアパウダーを入れる");
    }
    @Override
    public  void boilWater(){
        System.out.println("牛乳を温めました");
    }
}
