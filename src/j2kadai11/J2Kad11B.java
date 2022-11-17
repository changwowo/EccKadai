package j2kadai11;/*
	課題名：J2Kad11B「HashMap」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.ArrayList;
import java.util.HashMap;

public class J2Kad11B {
    public static void main(String[] args) {

        HashMap<String , Integer> hashMap = new HashMap<>();

        System.out.println("ECCバーガーへようこそ！");
        // メニューの作成
        hashMap.put("ビッグマック",150);
        hashMap.put("チーズバーガー",180);
        hashMap.put("ハンバーガー",410);

//        String[] keySet = {"ビッグマック", "チーズバーガー", "ハンバーガー"} == hashMap.keySet();


        // メニューの表示
        System.out.println("メニューを表示します！");



        for(String key : hashMap.keySet()){
            System.out.println(key + ":"+hashMap.get(key));
        }

    }
}
