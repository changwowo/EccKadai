package j2kadai06;/*
	課題名：J2Kad06S「石取りゲーム完成！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad06S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 説明の表示
        System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
        System.out.println("最後の1つを取った方が負けです。");
        System.out.println();
        // 初期設定
        int	stone = 20;			// 石の数

        BasePlayer[] basePlayers = {new BasePlayer(), new BasePlayer() , new CompPlayer() , new MasterPlayer()};
        ArrayList<BasePlayer> basePlayers1 = new ArrayList<>();

        System.out.println();
        System.out.println("先手を選んでください(0:Base、1:User、2:Comp、3:Master)>");
        int cho = in.nextInt();if(cho == 1) basePlayers1.add(new UserPlayer());
        else basePlayers1.add(basePlayers[cho]);

        System.out.print("後手を選んでください(0:Base、1:User、2:Comp、3:Master)>");
        int cho2 = in.nextInt();if(cho2 == 1) basePlayers1.add(new UserPlayer());
        else basePlayers1.add(basePlayers[cho2]);

        // 自己紹介
        basePlayers1.get(0).intro();
        basePlayers1.get(1).intro();
        System.out.println();
        int take;   // 取る石の数
        int i = 0;   //先頭と後手確認するやつ

        while(true) {
            // 先手の手番
            showStone(stone);
            System.out.println((i==0)?"先手：" + basePlayers1.get(i).toString() + "の番です。":"後手:" + basePlayers1.get(i).toString() + "の番です。");
            take = basePlayers1.get(i).takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(basePlayers1.get(i).toString() + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
            if(i == 0) i ++; else i--; // 先、後交代

        }
    }
    public static void showStone(int stone) {
        System.out.print("残り" + stone + "個：");
        while(stone > 0) {
            System.out.print("●");
            stone--;
        }
        System.out.println();
    }
}
