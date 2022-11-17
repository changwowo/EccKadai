package test;

import java.util.Scanner;

public class J2Test13_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");
        while(true) {
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
            int n = in.nextInt();
            if (n < 0) break;
            IFairy fairy;
            switch(n) {
                default:
                case 0: fairy = new Light(); break;
                case 1: fairy = new Darkness(); break;
                case 2: fairy = new Fire(); break;
            }
            fairy.intro();
            System.out.println();
        }
    }
}
