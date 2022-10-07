package j2kadai04;

public class J2Kad04C {
    public static void main(String[] args){
        Sheep.countSheep();

        //Sheep型の変数を1つ宣言し、羊の数を数える。

        Sheep count;

        Sheep hi = new Sheep();
        Sheep hi2 = new Sheep();
        Sheep.countSheep();

        // Sheepのインスタンスを1つ生成し、2の変数に設定、羊の数を数える。
        count = new Sheep();
        Sheep.countSheep();
        Sheep[] count2 = new Sheep[3];
        Sheep.countSheep();


        // 配列の各要素にSheepのインスタンスを設定し、羊の数を数える
        count2[0] = new Sheep();
        count2[1] = new Sheep();
        count2[2] = new Sheep();
        Sheep.countSheep(); // 실행하게 되면 모든 인스턴트를 불러오게된다 왜 static 이니까
        //Sheep.countSheep를 부른순간 지금까지 생성되었던 모든 인스턴스를 부르게 되기때문에
        //위에서 만든 count도 결국 하나의 인스턴스이기때문에 표시될떄는 전부 불러온다
    }
}
