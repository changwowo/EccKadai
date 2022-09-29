package j2kadai02;

public class J2Kad02C {
    public static void main(String[] args){
        Monster mon = new Monster();
        Monster mon2 = new Monster();
        mon.setData("diaruga",1000);
        mon.showData();
        mon2.setData("coinking",1);
        mon2.showData();
        System.out.println(mon.name+"を散歩させます");
        mon.walk();
        mon.walk();
        mon.walk();
        mon.showData();
        System.out.println(mon2.name+"を散歩させます");
        mon2.walk();
        mon2.walk();
        mon2.walk();
        mon2.showData();

    }
}
