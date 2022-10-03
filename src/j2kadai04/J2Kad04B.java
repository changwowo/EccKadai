package j2kadai04;

import java.util.Random;
import java.util.Scanner;

public class J2Kad04B {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int cho , count;
        System.out.println("ピクミンを探します!");
        while(true){
            count = r.nextInt(4);
            Pikmin.showCount();
            System.out.print("どうしますか?(0:探す、-1:やめる)>");
            cho = sc.nextInt();
            if(cho == -1) break;
            else if(cho == 0){
                if(count == 0 ){
                    System.out.println("見つからなかった!\n\n");
                }else{
                    for(int i = 0 ; i < count ; i++){
                        Pikmin p = new Pikmin();
                    }
                    System.out.println(count+"匹見つけた!\n\n");
                }

            }

        }
    }
}
