package j2kadai05;

public class SwimMonster extends Monster{
    public SwimMonster(){
        System.out.println("FlyMonsterクラスのコンストラクタが呼び出されました!");
    }
    void swim(){
        if(OHp(hp)) System.out.println("疲れて泳げないよ~");
        else{
            System.out.println(name+"が泳ぐよ!ぶくぶく・・・");
            hp --;
        }

    }

    @Override
    public void walk() {
        System.out.println("尾びれだと歩けないよ~");
    }

    @Override
    public void intro() {
        super.intro();
        System.out.println("泳ぎも得意さ!");
    }

    boolean OHp(int hp){
        if(hp == 0 ) return true;
        return false;
    }
}
