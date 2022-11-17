package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num%5){
            case 0 :
                System.out.println("wari");break;
            default:
                System.out.println("nowari");
        }
    }
}
