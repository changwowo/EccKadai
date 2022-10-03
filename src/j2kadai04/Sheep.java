package j2kadai04;

public class Sheep {
    private static int count;

    Sheep(){
        System.out.println("羊がやってきた!");
        count ++;
    }

    static void countSheep(){
        System.out.println("羊を数えます!");
        if(count == 0 ){
            System.out.println("まだ羊はいません!");
        }else{
            for(int i = 1 ; i <= count ; i++){
                System.out.println("羊が"+i+"匹");
            }
        }
    }


}
