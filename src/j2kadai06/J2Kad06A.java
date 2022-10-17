package j2kadai06;/*
	課題名：J2Kad06A「妖精の召喚」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad06A {
    public static void main(String[] args) {
        Fairy[] fairies = new Fairy[3];
        ArrayList<Fairy> fairyArrayList= new ArrayList<>();
        Fairy f0;
        Fairy f2;
        Fairy f1;
        fairyArrayList.add(f0 = new Light());
        fairyArrayList.add(f1 = new Darkness());
        fairyArrayList.add(f2 = new Fire());


//        fairies[0] = f0;
//        fairies[1] = f1;
//        fairies[2] = f2;
        int cho;
        Scanner sc = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");
        while(true){
            System.out.print("誰を召喚しますか?(0:光の妖精、1:闇の妖精、2:炎の妖精、-1:やめる)>");
            cho = sc.nextInt();
            if(cho<0) break;
            fairyArrayList.get(cho).intro();

        }



    }
}
