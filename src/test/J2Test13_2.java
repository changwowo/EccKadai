package test;

import java.util.Scanner;

public class J2Test13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("(while)0より大きい整数を入力してください＞");
        int n = in.nextInt();

        //while文の問題
        int cnt = 0;
        while(n>0){
            n /= 10;
            cnt++;
        }
        System.out.println(cnt + "桁です！！\n");

        //for文の問題
        System.out.print("(for)0より大きい整数を入力してください＞");
        n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1から" + n + "までの合計は" + sum + "です！！\n");

        //if else文の問題
        System.out.print("(if else)0より大きい整数を入力してください＞");
        n = in.nextInt();
        if( (n % 5) == 0){
            System.out.println("5で割り切れます！！\n");
        }else{
            System.out.println("5で割り切れません！！\n");
        }

        //switch文の問題
        System.out.print("(switch)0より大きい整数を入力してください＞");
        n = in.nextInt();
        switch (n%5){
            case 0:
                System.out.println("5で割り切れます！！\n");
                break;
            default:
                System.out.println("5で割り切れません！！\n");
        }

        in.close();
    }
}
