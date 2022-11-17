package j2kadai11;

import java.util.ArrayList;

/*
	課題名：J2Kad11A「MyArray」
	作成日：2022/11/07
	作成者：田中太郎
*/
public class J2Kad11A {
    public static void main(String[] args) {


        MyArray myArray = new MyArray();


        // データの格納
        System.out.println("データを格納します！");
        for (int i = 0; i < 5; i++) {
            myArray.add(new Monster());
            System.out.println("add : " + myArray.get(i));
        }


        // データの表示
        System.out.println("データを表示します！");
        for (int i = 0; i < 5; i++) {
            myArray.add(new Monster());
            System.out.println("get : " + myArray.get(i));
        }

    }


}
