package j2kadai07;

public abstract class HotDrink {


    public abstract  void makeDrink();
    public void honey(){}


    // 全てのmethodで使う文字列なのでここでMethodをで異議して無駄を消す
    public final void boilWater(){
        System.out.println("お湯を沸かしました！");
    }

    public final void pourInCup(){
        System.out.println("カップに注ぎました！");
    }


    public final void execute(){
        boilWater();
        makeDrink();
        pourInCup();
        honey();
    }

}

/*
 public void boilWater() { System.out.println("お湯を沸かしました！"); }
    public void makeDrink() { System.out.println("コーヒーをドリップしました！"); }
    public void pourInCup() { System.out.println("カップに注ぎました！"); }
 */


