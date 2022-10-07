package j2kadai04;

import java.util.Scanner;

public class J2Kad04S {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int cho;
        Stack stack2 = new Stack(5);


        System.out.println("いらっしゃい!激安スーパーECC です!!");
        while(true){
            System.out.println("何をしますか?(0:客を呼び込む、1:レジを打つ、-1:店をたたむ)>");
            cho = sc.nextInt();
            if(cho == 0 ){
                for(int i = 0 ; i < 3 ; i++) {
                    Monster m = new Monster();
                    if (stack2.full()) {
                        System.out.println(m.toString() + "やってきた!もう店に入れない!残念!!");
                        break;
                    }
                    stack2.push(m);
                    System.out.println(m.toString());
                }
            }else if(cho ==1){
                if(stack2.empty()) {
                    System.out.println("誰もいないよ〜");
                    continue;
                }

//                System.out.println(stack2.getData(0)+"は帰っていった!!");
//                stack2.pop();
                System.out.println(stack2.pop().toString()+"は帰っていった!!");

            }else{
                break;
            }
            System.out.println("\n現在のレジ待ち行列です!");
            for(int i = 0 ; i < stack2.size() ; i++){
                System.out.println(i+": "+stack2.getData(i));
            }
        }
    }
}
