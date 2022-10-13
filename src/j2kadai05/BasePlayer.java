package j2kadai05;

import java.util.Random;

public class BasePlayer {
    protected Random r = new Random();

    protected String name;

    public BasePlayer(){
        System.out.println("BasePlayer のコンストラクタが呼び出されました!");
        this.name = "CPU";

    }
    public void intro(){
        System.out.println("名前:"+name+"・・・取る石の数を乱数で決めます。");
    }
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }
    int takeStone(int stone){
        int st;
        st = r.nextInt(3)+1;

        return st ;
    }
}
