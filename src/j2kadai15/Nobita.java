package j2kadai15;

public class Nobita extends Handler {
    public Nobita() {
        super("のび太");
        System.out.println("のび太がスタンバイしました！");
    }

    @Override
    public boolean resolve(int n) {
        if (n < 20) {
            System.out.println("のび太：私が対応します！");
            return true;
        } else {
            System.out.println("のび太：専門外です・・・");
            return false;
        }
    }
}

//    public boolean handle(int n) {
//        if (n < 20) {
//            System.out.println("のび太：私が対応します！");
//            return true;
//        } else {
//            System.out.println("のび太：専門外です・・・");
//            return false;
//        }
//    }
