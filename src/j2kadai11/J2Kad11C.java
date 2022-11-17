package j2kadai11;/*
	課題名：J2Kad11C「ラッパークラス」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;
import java.util.Random;

public class J2Kad11C {
    public static void main(String[] args) {

        Random ran = new Random();
        ArrayList<Integer> interg = new ArrayList();


        // データの格納
        System.out.println("データを格納します！");
        for(int i = 0 ; i < 5 ; i++){
            interg.add(ran.nextInt(100));
            System.out.println("add : "+interg.get(i));
        }

        // データの表示
        System.out.println("データを表示します！");
        for(int i:interg){
            System.out.println("get : "+interg);

        }


    }
}
