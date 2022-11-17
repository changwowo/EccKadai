package j2kadai10;/*
	課題名：J2Kad10C「列挙型①」
	作成日：2022/10/31
	作成者：田中太郎
*/
import java.util.Scanner;

//import static j2kadai10.Janken.Result.WIN;

//import static j2kadai10.Janken.Result.*;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Janken.Hand[] hands = {Janken.Hand.GU, Janken.Hand.CHOKI, Janken.Hand.PA};
        Janken.Hand[] hands = Janken.Hand.values();
        System.out.println("じゃんけんをします！");
        // 手の紹介
        for(Janken.Hand h : hands){
            System.out.println(h.name+":"+h.feature);
        }
        System.out.println();

        while(true) {
            // 手の選択
            System.out.print("何をだしますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);
            // 手の表示
            String[] strHands = {"グー", "チョキ", "パー"};
            System.out.println("あなたは" + hands[user].name + "を出した！");
            System.out.println("コンピュータは" + hands[comp].name + "を出した！");

            System.out.println(Janken.resultTbl[user][comp].msg);




            System.out.println();
        }
    }
}