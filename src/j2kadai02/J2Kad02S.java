package j2kadai02;

import java.util.Scanner;

public class J2Kad02S {

    static Scanner sc = new Scanner(System.in);
    public static void gotoECCBank(Account account) {
        int cho;
        account.showData();
        System.out.println("どうしますか（1：預ける、2：引き出す、-1：帰る）＞");
        cho = sc.nextInt();
        if(cho == 1) deposit(account);
        else if(cho == 2) withdraw(account);
        else if(cho == -1) ;

    }

    public static void deposit(Account account) {
        int MoneyInPut;
        System.out.print("いくら預けますか？＞");
        MoneyInPut = sc.nextInt();
        account.money += MoneyInPut;
        gotoECCBank(account);

    }
    public static void withdraw(Account account) {
        int Password;
        int MoneyOut;
        System.out.print("暗証番号を入力してください＞");
        Password = sc.nextInt();
        if(Password == account.secretNumber) {
            System.out.print("いくら引き出しますか？＞");
            MoneyOut = sc.nextInt();
            if(account.money < MoneyOut) {
                System.out.println("残高不足です！");
                gotoECCBank(account);
            }else {
                account.money -= MoneyOut;
                gotoECCBank(account);
            }

        }else {
            System.out.println("番号が違います！");
            gotoECCBank(account);
        }

    }
    public static void main(String[] args) {
        int cho;
        Account a1 = new Account();
        Account a2 = new Account();
        a1.setData("nobota", 1787293, 99999999, 1234);
        a2.setData("bisiri", 8739123, 100000000, 5678);
        System.out.println("そうだ！銀行へ行こう！！");
        while (true) {
            System.out.println("誰が行きますか？（1：のび太、2：スネ夫、-1：誰もいかない）＞");
            cho = sc.nextInt();
            if (cho == 1) {
                gotoECCBank(a1);
            } else if (cho == 2) {
                gotoECCBank(a2);
            } else {
                System.out.println("");
                break;
            }
        }
    }

}
