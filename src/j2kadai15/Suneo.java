package j2kadai15;

public class Suneo extends Handler {
    public Suneo() {
        super("スネ夫");
        System.out.println("スネ夫がスタンバイしました！");
    }

    @Override
    public boolean resolve(int n) {
            if ((n % 3) == 0) {
                System.out.println("スネ夫：私が対応します！");
                return true;
            } else {
                System.out.println("スネ夫：専門外です・・・");
                return false;
            }
        }



}

//    public boolean handle(int n) {
//        if ((n % 3) == 0) {
//            System.out.println("スネ夫：私が対応します！");
//            return true;
//        } else {
//            System.out.println("スネ夫：専門外です・・・");
//            return false;
//        }
//    }
