package j2kadai11;/*
	課題名：J2Kad11D「ArrayList」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;

public class J2Kad11D {
    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<>();


        // データの格納
        System.out.println("データを格納します！");
        for(int i = 0 ; i < 5 ; i++){
            Monster mon = new Monster();
            monsters.add(mon);
            System.out.println("add : " + mon);
        }


        // データの表示
        System.out.println("データを表示します！");
        for(Monster mon : monsters){
            System.out.println("get :"+mon);
        }


    }
}
