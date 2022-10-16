package j2kadai06;/*
	課題名：J2Kad06S「石取りゲーム完成！」
	作成日：2022/10/17
	作成者：田中太郎
*/
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

//        UserPlayer user = new UserPlayer();
//        CompPlayer comp = new CompPlayer();
        BasePlayer[] basePlayers = new BasePlayer[4];
        BasePlayer basePlayer ;
        BasePlayer userPlayer ;
        BasePlayer masterPlayer ;
        BasePlayer compPlayer;



        System.out.println();
        System.out.println("先手を選んでください(0:Base、1:User、2:Comp、3:Master)>");
        int cho = in.nextInt();
        switch (cho){
            case 0 : basePlayers[0] = new BasePlayer();break;
            case 1 : basePlayers[1] = new UserPlayer();break;
            case 2 : basePlayers[2] = new CompPlayer();break;
            case 3 : basePlayers[3] = new MasterPlayer();break;
        }
        System.out.print("後手を選んでください(0:Base、1:User、2:Comp、3:Master)>");
        int cho2 = in.nextInt();
        switch (cho2){
            case 0 : basePlayers[0] = new BasePlayer();break;
            case 1 : basePlayers[1] = new UserPlayer();break;
            case 2 : basePlayers[2] = new CompPlayer();break;
            case 3 : basePlayers[3] = new MasterPlayer();break;
        }

        // 自己紹介
//        user.intro();
//        comp.intro();
        basePlayers[cho].intro();
        basePlayers[cho2].intro();
        System.out.println();

        int take;				// 取る石の数
        while(true) {
            // 先手の手番
            showStone(stone);
            System.out.println("先手：" + basePlayers[cho].toString() + "の番です。");
            take = basePlayers[cho].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(basePlayers[cho].toString() + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();

            // 後手の手番
            showStone(stone);
            System.out.println("後手：" + basePlayers[cho2].toString() + "の番です。");
            take = basePlayers[cho2].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(basePlayers[cho2].toString()+ "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
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
