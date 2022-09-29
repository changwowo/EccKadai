package j2kadai02;

public class Yadon {

    public static String name = "ヤドン";
    public static int hp = 30;

    public static void showData(){
        System.out.println("ぼくの名前は"+name+"！HP は"+hp+" だよ！");
    }

    public static void walk(){
        hp -= 1;
        System.out.println("てくてく。。。。");
    }

    public static void sleep(){
        hp += 1;
        System.out.println("ぐうぐう。。。。");

    }

    public static void main(String[] args){
        System.out.println("ヤドンが現れた！");
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }
}
