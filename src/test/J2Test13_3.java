package test;

public class J2Test13_3 {
    public static void main(String[] args) {
        Sheep.showCounter();		// 羊の数を表示
        Sheep s1 = new Sheep();		// s1に羊を1匹生成
        Sheep.showCounter();		// 羊の数を表示

        Sheep[] sn = new Sheep[3];	// snに羊の配列（3匹分）を生成
        for (int i = 0; i < sn.length; i++) {
            sn[i] = new Sheep();	// 配列に羊を生成
        }
        Sheep.showCounter();        // 羊の数を表示
    }
}
