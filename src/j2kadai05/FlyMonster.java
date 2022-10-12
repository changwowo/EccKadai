package j2kadai05;

public class FlyMonster extends Monster {
    public FlyMonster() {
        System.out.println("FlyMonster のコンストラクタが呼び出されました!");
    }
    void fly(){
        if(OHp(hp)) System.out.println("疲れて飛べないよ~");
        else {
            System.out.println(getName()+"が飛ぶよ!びゅ~ん!!");
            hp --;
        }

    }
    boolean OHp(int hp){
        if(hp == 0 ) return true;
        return false;
    }
}
