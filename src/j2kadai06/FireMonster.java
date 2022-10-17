package j2kadai06;

public class FireMonster extends  Monster{
    public FireMonster(String name){
        super(name);
    }


    @Override
    public void intro() {
        super.intro();
        System.out.println("炎も出せるよ!");

    }
    void fire(){
        System.out.println(name+"は炎をはいた!ゴオ~!!");
    }
}
