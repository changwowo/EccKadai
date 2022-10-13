package j2kadai05;

public class MasterPlayer extends BasePlayer{
    public MasterPlayer(){
        name = "HAL";

    }

    @Override
    public void intro() {
        System.out.println("名前:"+name+"・・・少し強いです。");

    }

    @Override
    int takeStone(int stone) {
        int ra;
        switch (stone){
            case 8 : return 3;
            case 7 : return 2;
            case 6 : return 1;
            case 4 : return 3;
            case 3 : return 2;
            case 2 : return 1;

            default: return ra = r.nextInt(3)+1;
        }

    }
}
