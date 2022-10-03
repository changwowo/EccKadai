package j2kadai04;

public class J2Kad04D {
    public static void main(String[] args){
        Student st = new Student("のび太","IE");
        Student st2 = new Student("しずか","SK");
        Student st3 = new Student("スネ夫","SE");
        Student st4 = new Student("ジャイアン","オレさまのコース");

        System.out.println(st.getName()+"がやってきた！");
        System.out.println(st2.getName()+"がやってきた！");
        System.out.println(st3.getName()+"がやってきた！");
        System.out.println(st4.getName()+"がやってきた！");
        System.out.println("それぞれのデータを表示します！");

        st.showDate();
        st2.showDate();
        st3.showDate();
        st4.showDate();

    }

}
