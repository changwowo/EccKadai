package j2kadai06;

import java.util.ArrayList;

/*
	課題名：J2Kad06C「ポリモーフィズム」
	作成日：2022/10/17
	作成者：田中太郎
*/
public class J2Kad06C {
    public static void main(String[] args) {
//        ArrayList<Monster> m = new ArrayList<>();
//        Monster m0 = new Monster("ピカチュウ");
//        Monster m1 = new FireMonster("ヒトカゲ");
//        Monster m2 = new RockMonster("カブト");
//
//        m.add(m0);
//        m.add(m1);
//        m.add(m2);

        Monster[] m = new Monster[3];
        Monster m0 = new Monster("ピカチュウ");
        Monster m1 = new FireMonster("ヒトカゲ");
        Monster m2 = new RockMonster("カブト");
        m[0] = m0;
        m[1] = m1;
        m[2] = m2;


        for(Monster monster : m){
            monster.intro();
            System.out.println("");
        }




    }
}
