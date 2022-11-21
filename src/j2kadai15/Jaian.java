package j2kadai15;

import java.util.logging.LogRecord;

public class Jaian extends Handler {
    public Jaian() {
        super("ジャイアン");
        System.out.println("ジャイアンがスタンバイしました！");
    }

    @Override
    public boolean resolve(int n) {
            if ((int) (Math.random() * 4) == 0) {
                System.out.println("ジャイアン：私が対応します！");
                return true;
            } else {
                System.out.println("ジャイアン：専門外です・・・");
                return false;
            }

    }
}

//    public boolean handle(int n) {
//        if ((int)(Math.random() * 4) == 0) {
//            System.out.println("ジャイアン：私が対応します！");
//            return true;
//        } else {
//            System.out.println("ジャイアン：専門外です・・・");
//            return false;
//        }
//    }
