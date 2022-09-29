package j2kadai02;

public class J2Kad02B {
    public static void addInt(int x){
        x+=5;
        System.out.println("x に5 を加算しました！");
    }
    public static void addArray(int[] b){
        for(int i =0 ; i < b.length ; i++){

            System.out.println("b["+b[i]+"]に５を加算しました");
            b[i] +=5;
        }
    }
    public static void addHp(Monster m){
        m.hp +=5;
    }

    public static void main(String[] args){
        int x = 10;
        addInt(x);
        System.out.println("x:"+x);

        int[] a = {0 , 1 , 2};
        addArray(a);
            System.out.println("a: "+a[0]+" "+a[1]+" "+a[2]);
            Monster m = new Monster();
            m.setData("ピカチュウ",20);
            addHp(m);
        System.out.println(m.hp);
        m.showData();

    }
}
