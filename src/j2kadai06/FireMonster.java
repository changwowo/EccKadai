package j2kadai06;

public class FireMonster extends  Monster{
    public FireMonster(String name){
        super(name);
    }


    @Override
    public void intro() {
        System.out.println("おいらの名前は" + name + "。");
        System.out.println("趣味は散歩。特技はどこでも眠れることだよ。");
        System.out.println("炎も出せるよ!");

    }
    void fire(){
        System.out.println(name+"は炎をはいた!ゴオ~!!");
    }
}
