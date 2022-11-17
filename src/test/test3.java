package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%5 == 0){
            System.out.println("5わり");
        }else{
            System.out.println("5noわり");
        }
    }
}
