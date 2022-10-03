package j2kadai02;

public class Monster {
    public String name = "何もないよ〜";
    public int hp = 1;


    public void setData(String n , int h){
        this.name = n;
        this.hp = h;
        System.out.println(name+"が現れた！");

    }
    public void showData(){

        System.out.println("ぼくの名前は"+name+"！HP は"+hp+" だよ！」");
    }
    public void walk(){


        if(hp<=0){
            System.out.println("「つかれて歩けないよ～」");
        }else{
            hp -= 1;
            System.out.println("てくてく。。。。");
        }

    }
    public void sleep(){
        hp += 1;
        System.out.println("ぐうぐう。。。");

    }

}
