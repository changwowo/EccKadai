package j2kadai03;

public class Monster {
    private String name = "피카츄";
    private int hp = 20 ;


    public void setName(String name){//hpのセッター。引数hpが0以下のときは「せめてHP、1はちょうだい!」と 表示して、1 を設定する。
        if(name == "ゲレゲレ"){
            System.out.println("ゲレゲレなんていやだ~");
        }else{
            this.name = name;
        }

    }

    public void setHp(int hp){
        if(hp <= 0){
            System.out.println("せめてHP、1はちょうだい!");
            this.hp =1;
        }else {
            this.hp = hp;
        }

    }

    public void showData(){

        System.out.println("ぼくの名前は "+name+"、HP は "+hp+" だよ!");
    }
}

/*
ぼくの名前はピカチュウ、HP は 20 だよ! ゲレゲレなんて名前はいやだ~
せめて HP、1 はちょうだい! ぼくの名前はピカチュウ、HP は 1 だよ!
 */

