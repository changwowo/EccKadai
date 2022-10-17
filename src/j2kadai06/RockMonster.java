package j2kadai06;

public class RockMonster extends Monster{
    public RockMonster(String name){
        super(name);
    }

    @Override
    public void intro() {
        super.intro();
        System.out.println("とても硬いぜ!");

    }

    public void defend(){
        System.out.println(name+"は防御している!ダメージを与えられない!!");
    }
}
