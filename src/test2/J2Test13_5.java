package test2;

import java.util.Scanner;

public class J2Test13_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("�N���������܂����H�i0�F���̗d���A1�F�ł̗d���A2�F���̗d���A-1�F��߂�j��");
            int n = in.nextInt();
            if (n < 0) break;
            ///// �Ȍ��� ////////
//            switch(n) {
//                default:
//                case 0:
//                    Light light = new Light();
//                    light.intro();
//                    break;
//                case 1:
//                    Darkness dark = new Darkness();
//                    dark.intro();
//                    break;
//                case 2:
//                    Fire fire = new Fire();
//                    fire.intro();
//                    break;
//            }
            ///// �Ȍ��� ////////
            System.out.println();
        }
        in.close();
    }
}
