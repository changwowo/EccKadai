package j2kadai04;

public class Pikmin {

    private static int count;

    Pikmin(){
        System.out.println("ピクミンがやってきた!");
        this.count ++;
    }

    static void showCount(){
        System.out.println("これまでに見つけたピクミンは"+count+"匹です!");
    }
}
