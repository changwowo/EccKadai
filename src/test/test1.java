package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 0;
        while(true){
            num /= 10;
            num2 ++;
            if(num <= 0 )break;
        }
        System.out.println(num2);
    }
}
