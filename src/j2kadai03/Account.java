package j2kadai03;

public class Account {
    private String name;
    private int accountNumber;
    private int money;
    private int secretNumber;

    public Account(String name,int accountNumber, int money, int secretNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
        this.secretNumber = secretNumber;

    }

    public String getName(){
        return this.name;

    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int money(){
        return this.money;
    }

    public void addMoney(int money){
        this.money += money;
    }

    public boolean subMoney(int money){
        if(this.money < money) return false;
        else {
            this.money -= money;
            return true;
        }
    }

    public boolean checkSecretNumber(int secretNumber){
        if(this.secretNumber == secretNumber) return true;
        else return false;
    }

    public void showData(){
        System.out.println("口座名義："+name);
        System.out.println("口座番号："+accountNumber);
        System.out.println("預金残高："+money+"円");

    }
}
