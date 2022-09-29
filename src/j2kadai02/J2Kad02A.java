package j2kadai02;

import java.util.Random;
import java.util.Scanner;

public class J2Kad02A {
    static Scanner sc = new Scanner(System.in);
    public static void useMonster(Monster m){
        int cho;
        m.showData();
        System.out.print("どうしますか？（1：散歩する、2：眠る、-1：やめる）＞1");
        cho = sc.nextInt();
        if(cho == 1) {
            m.walk();
            useMonster(m);
        }
        else if(cho ==2 ){
            m.sleep();
            useMonster(m);
        }
        else{
            System.out.println("");
        }


    }
    public static void main(String[] args){
        Random r = new Random();
        int ran;
        int cho;
        Monster m = new Monster();
        Monster m2 = new Monster();
        m.setData("ピカチュウ",ran = r.nextInt(19));
        m.showData();
        m2.setData("イワンこ",ran = r.nextInt(19));
        m2.showData();
        while(true){
            System.out.print("どのモンスターを使いますか？（1：ピカチュウ、2：イワンコ、-1：やめる）＞");
            cho = sc.nextInt();
            if(cho == 1) useMonster(m);
            else if(cho == 2) useMonster(m2);
            else if( cho == -1)break;

        }
    }
}
