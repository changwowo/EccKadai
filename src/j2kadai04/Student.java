package j2kadai04;

public class Student {
    private String name;
    static String coures = "オレさまのコース";

    public Student(String name , String coures){
        this.name = name;
        this.coures = coures;

    }

    public void showDate(){
        System.out.println("名前："+getName()+" コース："+getCoures());
    }

    public String getName() {
        return name;
    }

    public String getCoures() {
        return coures;
    }
}
