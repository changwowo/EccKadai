package j2kadai03;

/*
リスト 1 を入力して実行すると、ピカチュウの名前が「ゲレゲレ」に、
HP が「-1」になる。他のクラス(ここでは J2Kad03C クラス)から勝手にピカチュウの名前や HP を変更できないようにせよ。
 */

public class J2Kad03C {
    public static void main(String[] args){
        Monster mon = new Monster();
        mon.showData();
        mon.setName("ゲレゲレ");
        mon.setHp(0);
        mon.showData();
    }

}
