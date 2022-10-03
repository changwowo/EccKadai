package j2kadai02;

import java.util.Random;
import java.util.Scanner;

public class J2Kad02X {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void showData(Stack s) {
        System.out.print("stack :");
        for(int j = 0 ; j < s.i; j++) {
            System.out.print(s.st[j]+" ");
        }
        System.out.println("\n\n");

    }
    public static void pushData(Stack s) {
        int push[] = new int[3];
        for(int i = 0; i < push.length ;i++) {
            if(s.i == 10) break;
            push[i] = r.nextInt(100);
            s.push(push[i]);
        }
        if(s.isFull()){
            System.out.println("スタックがいっぱいです！");
        }
        showData(s);

    }
    public static void popData(Stack s) {
        if(!(s.isEmpty())){
            System.out.println(s.st[s.i-1]+"を取り出しました！");
            s.pop();
            showData(s);
        }else{
            System.out.println("データがありません！");
            showData(s);
        }

    }

    public static void main(String[] args){
        Stack classStack = new Stack();
       // int InputStack;
        classStack.createStack(10);
        int cho;
        System.out.println("スタック操作をします！");
        while(true){
            System.out.println("どうしますか？（1：push、2：pop、-1：終了）＞");
            cho = sc.nextInt();
            if(cho == 1) {
                pushData(classStack);

            }else if(cho ==2){
                popData(classStack);
            }else if(cho== -1){
                break;
            }
        }
    }
}
