package j2kadai08;/*
	課題名：J2Kad08B「激安スーパーECC3号店」
	作成日：2022/10/24
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad08B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IContainer iContainer = null;
        System.out.println("いらっしゃい！激安スーパーECC3号店です！！");
        System.out.println("レジ待ち行列をスタック形式と待ち行列形式から選べます！");
        System.out.print("どちらにしますか？（0：スタック、それ以外：待ち行列）＞");
        int n = in.nextInt();

        // キューの生成
        switch(n){
            case 0 : iContainer = new Stack(5);break;
            default: iContainer = new Queue(5);
        }

        while(true) {
            // データの表示
            if (!iContainer.empty()) {
                System.out.println("現在のレジ待ち行列です！");
                for (int i = 0; i < iContainer.size(); i++) {
                    System.out.println(i + "：" + iContainer.getData(i));
                }
                System.out.println();
            }

            // コマンド選択
            System.out.print("何をしますか？（0：客を呼び込む、1：レジを打つ、-1：店をたたむ）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;

            switch (cmd) {
                case 0:			// 客を呼び込む
                    for (int i = 1 + (int)(Math.random() * 3); i > 0; i--) {
                        Monster m = new Monster();
                        System.out.print(m + "がやってきた！");
                        if (iContainer.full()) {
                            System.out.println("もう店に入れない！残念！！");
                        }
                        else {
                            System.out.println();
                            iContainer.push(m);
                        }
                    }
                    break;
                case 1:			// レジを打つ
                    if (iContainer.empty()) {
                        System.out.println("お客さんがいない！！");
                    }
                    else {
                        Monster m = iContainer.pop();
                        System.out.println(m + "は帰っていった！！");
                    }
                    break;
            }
            System.out.println();
        }
        System.out.println();
    }
}
