package j2kadai15;/*
	課題名：J2Kad15A「例外処理①まとめ」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Random;
import java.util.Scanner;

public class J2Kad15A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int arr[] = new int[5];

        // 作成すること
        while(true) {
            try {
                System.out.print("割られる数を入力してください>");
                int n = Integer.parseInt(in.next());
                int ran = r.nextInt(10);
                int ran2 = r.nextInt(10);
                System.out.println(ran + "で割ります!");
                System.out.println("計算結果は " + n / 10 + "です!");
                System.out.println("配列の "+ran2+" 番目に格納します!");
                arr[ran2] = n/ran;
                System.out.println("処理が正常に行われました!");

            } catch (ArithmeticException e) {

                System.out.println("0 除算が発生しました!");
                break;
            }catch(NumberFormatException e){

                System.out.println("int 型でない値が入力されました!");
                System.out.println();
            }catch(ArrayIndexOutOfBoundsException e){

                System.out.println("配列に格納できません!");
                System.out.println();
            }finally {
                System.out.println("finally ブロックの処理です!");
                System.out.println();
            }
        }


       System.out.println("終了します！");
    }
}
