package j2kadai06;

public class RockMonster extends  Monster{
    public RockMonster(String name){
        super(name);
    }

    @Override
    public void intro() {
        System.out.println("おいらの名前は" + name + "。");
        System.out.println("趣味は散歩。特技はどこでも眠れることだよ。");
        System.out.println("とても硬いぜ!");

    }

    public void defend(){
        System.out.println(name+"は防御している!ダメージを与えられない!!");
    }
}
