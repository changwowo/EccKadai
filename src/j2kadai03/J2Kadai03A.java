package j2kadai03;

import j2kadai02.Account;

import java.util.Scanner;

public class J2Kadai03A {

    static Scanner sc = new Scanner(System.in);
    public static void gotoECCBank(j2kadai03.Account account) {
        int cho;
        account.showData();
        System.out.println("どうしますか（1：預ける、2：引き出す、-1：帰る）＞");
        cho = sc.nextInt();
        if(cho == 1) deposit(account);
        else if(cho == 2) withdraw(account);
        else if(cho == -1) ;

    }

    public static void deposit(j2kadai03.Account account) {
        int MoneyInPut;
        System.out.print("いくら預けますか？＞");
        MoneyInPut = sc.nextInt();
        account.addMoney(MoneyInPut);
        gotoECCBank(account);

    }
    public static void withdraw(j2kadai03.Account account) {
        int Password;
        int MoneyOut;
        System.out.print("暗証番号を入力してください＞");
        Password = sc.nextInt();
        if(account.checkSecretNumber(Password)) {
            System.out.print("いくら引き出しますか？＞");
            MoneyOut = sc.nextInt();
            if(account.subMoney(MoneyOut)) {
                gotoECCBank(account);
            }else {
                System.out.println("残高不足です！");
                gotoECCBank(account);
            }

        }else {
            System.out.println("番号が違います！");
            gotoECCBank(account);
        }

    }
    public static void main(String[] args) {
        int cho;
        j2kadai03.Account a1 = new j2kadai03.Account("nobota",1787234,9999,1234);
        j2kadai03.Account a2 = new j2kadai03.Account("bisiri",3982142,8888,1324);

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