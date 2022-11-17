package test2;//import java.util.Scanner;
//
//public class J2Test13_7 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(true) {
//            System.out.println("���Ɋi�[���܂����H");
//            System.out.print("�i0�F�X�^�b�N�A1�F�L���[�A-1�F�I���j��");
//            int n = in.nextInt();
//            if (n < 0) break;
//
//            IContainer c = (n == 0)? new Stack(): new Queue();
//            System.out.println("�f�[�^���i�[���܂��I");
//            for (int i = 0; i < 3; i++) {
//                int data = (int)(Math.random() * 100);
//                c.push(data);
//                System.out.println("push�F" + data);
//            }
//
//            System.out.println("�f�[�^�����o���܂��I");
//            while(!c.empty()) {
//                int data = c.pop();
//                System.out.println("pop�F" + data);
//            }
//            System.out.println();
//        }
//    }
