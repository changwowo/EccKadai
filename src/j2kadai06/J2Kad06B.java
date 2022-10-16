package j2kadai06;/*
	課題名：J2Kad06B「モンスターを探せ！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad06B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("モンスターを探します！");
        Monster[] m = new Monster[3];
        Monster m0 = new Monster("ピカチュウ");
        Monster m1 = new FireMonster("ヒトカゲ");
        Monster m2 = new RockMonster("カブト");
        m[0] = m0;
        m[1] = m1;
        m[2] = m2;

        while(true) {
            System.out.print("どうしますか？（0：探す、-1：やめる）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            // Monsterの自己紹介

            m[(int) (Math.random()*3)].intro();




            System.out.println();
        }
    }
}
