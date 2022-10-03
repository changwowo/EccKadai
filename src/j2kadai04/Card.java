package j2kadai04;

import java.util.Random;

public class Card {
    static Random r = new Random();

    static int[] number = {0,1,2,3,4,5,6,7,8,9};
    static boolean[] t = new boolean[10];
    static int i = 0;

    public Card(){
        while(true) {
            int num = r.nextInt(10);
            number[i] = num;
            if (t[number[i]]){
                continue;
            }
                t[number[i]] = true;
            break;
        }

        System.out.println("カードの番号は"+getNumber()+"です!");
        i ++;

    }
    int getNumber(){
        return number[i];
    }

}


/*
                int tmp = cards[dst];
				cards[dst] = cards[src];
				cards[src] = tmp;
				System.out.println(dst + "番目と" + src + "番目を入れ替えました!");
				dst++;
 */
