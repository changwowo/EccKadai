package j2kadai07;/*
	課題名：J2Kad07C「抽象メソッドと抽象クラス」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad07C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        RPGCharacter[] rpgCharacters = { new Fighter() , new Mage() , new Monk()};

        while(true) {
            System.out.print("ジョブを選んでください（0：戦士、1：魔法使い、 2:モンク ,-1：終了）＞");
            int job = in.nextInt();
            if (job < 0) break;
            rpgCharacters[job].run();
            System.out.println();
        }
    }



}
