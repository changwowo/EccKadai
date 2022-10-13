package j2kadai05;

public class CompPlayer extends BasePlayer{
    public CompPlayer(){
        System.out.println("CompPlayer のコンストラクタが呼び出されました!");
        name = "HAL";
    }

    @Override
    public void intro() {
        System.out.println("名前:"+name+"・・・少し強いです。");
    }

    @Override
    int takeStone(int stone) {
        int ran;
        if(stone == 1) return 1;
        else if (stone >= 2 && stone <=4) return stone-1;
        else if (stone >= 6 && stone <=8) return stone-5;
        else {
            return ran = r.nextInt(3)+1;
        }
    }
}
