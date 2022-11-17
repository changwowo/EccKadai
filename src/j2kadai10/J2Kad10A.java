package j2kadai10;

/*
	課題名：J2Kad10A「メゾンECC、再び！」
	作成日：2022/10/31
	作成者：田中太郎
*/
public class J2Kad10A {
    public static void main(String[] args) {
        // 住人の募集
        System.out.println("メゾンECCの住人を募集します！");
        Sheep[][] maison = new Sheep[3][];

        maison[0] = new Sheep[3];
        maison[1] = new Sheep[2];
        maison[2] = new Sheep[1];
        for(int i = 0; i < maison.length ; i++ ){
            for(int j = 0 ; j+i < maison.length ; j++) {
                maison[i][j] = new Sheep();
            }
            System.out.println("");
        }
        for(Sheep[] sheeps : maison){
            for(Sheep t: sheeps) {
                t.intro();

            }
            System.out.println();

        }


        // 住人の自己紹介
        System.out.println("メゾンECCの住人に自己紹介させます！");


    }
}
