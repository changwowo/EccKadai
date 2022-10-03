package j2kadai03;

import java.util.Scanner;

public class J2Kad03X {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Stack stack = new Stack();
        String basyo[] = {"ECC コーヒー","ECC バーガー","ECC ドーナツ"};
        int cho;
        stack.createStack(5);
        System.out.println("のび太がおつかいに行きます!");
        System.out.print("のび太の家です。どこへ行きますか?(0:ECC コーヒー、1:ECC バーガー、2:ECC ドーナツ、-1:戻る)>");
        cho = sc.nextInt();
        stack.push(basyo[cho]);
        while(true){
            System.out.print(stack.getData(stack.i)+"です。どこへ行きますか?(0:ECC コーヒー、1:ECC バーガー、2:ECC ドーナツ、-1:戻る)>");
            cho = sc.nextInt();
            if(cho == -1){
                System.out.println(stack.indent(stack.i-1)+"もと来た道を戻ります!");
                for(int i = stack.i; i > 0; i--){
                    System.out.println(stack.getData(i)+"に戻ってきた!");
                    stack.pop();
                }
                break;
            } else if(stack.isFull()) {
                System.out.println(stack.indent(stack.i-1)+"これ以上進むと帰れないよ~");
            } else{
                stack.push(basyo[cho]);
            }
        }
        System.out.println("のび太の家に戻ってきた!");
    }
}
