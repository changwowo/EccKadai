package j2kadai03;

public class J2Kad03B {

    public static void main(String[] args){
        Profile p = new Profile("ドラえもん",129.3,129.3);
        Profile p2 = new Profile("ドラミちゃん",100.0,91.0);

        System.out.println(p.getName()+"のプロフィールです!");
        System.out.println("身長:"+p.getHeight());
        System.out.println("体重:"+p.getWeight());
        System.out.println(p2.getName()+"のプロフィールです!");
        System.out.println("身長:"+p2.getHeight());
        System.out.println("体重:"+p2.getWeight());


    }

}

/*
ドラえもんのプロフィールです! 身長:129.3
体重:129.3 ドラミちゃんのプロフィールです! 身長:100.0
体重:91.0
 */
