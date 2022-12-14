package j2kadai07;/*
	課題名：J2Kad07D「RPGキャラクター」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad07D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RPGCharacter[] rpgCharacters = { new Fighter() , new Mage()}; // インスタンスを保管

        while(true) {
            System.out.print("ジョブを選んでください（0：戦士、1：魔法使い、-1：終了）＞");
            int job = in.nextInt();
            if (job < 0) break;
            rpgCharacters[job].run(); // インスタンスを呼ぶ
            System.out.println();
        }
    }
}
