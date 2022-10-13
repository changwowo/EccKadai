package j2kadai05;

import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    private Scanner sc = new Scanner(System.in);


    public UserPlayer(){
        System.out.println("UserPlayerのコンストラクタが呼び出されました!");
        System.out.print("あなたの名前を入力してください>");
        name = sc.next();
    }

    @Override
    public void intro() {

        System.out.println("名前:"+name+"・・・あなたが操作するプレイヤーです。");
    }

    @Override
    int takeStone(int stone) {
        int st;
        st = sc.nextInt();
        return st;
    }
}
