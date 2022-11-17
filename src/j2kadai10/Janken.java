package j2kadai10;

public class Janken {


    enum Result {
        WIN("あなたの勝ちです!"), LOSE("あなたの負けです!"), DROW("引き分けです!");
        public String msg;

        Result(String msg) {
            this.msg = msg;
        }
    }

    enum Hand {
        GU("グー", "チョキに勝って、パーに負けます!"),
        CHOKI("チョキ", "パー勝って、グーに負けます!"),
        PA("パー", "グーに勝って、チョキに負けます!");
        public String name;
        public String feature;
        Hand(String name , String feature){
            this.name = name;
            this.feature = feature;
        }
    }
    public static Result[][] resultTbl = {
            {Result.DROW ,Result.WIN ,Result.LOSE},
            {Result.LOSE,Result.DROW,Result.WIN},
            {Result.WIN,Result.LOSE,Result.DROW}
    };
}

////勝ち負け、ドローをenumで定義
//
//enum Result{
//    WIN , LOSE , DROW
//
//}
//
//    //２次元配列で結果を定義
//
//    public static Result[][] resultTbl = {
//            {Result.DROW ,Result.WIN ,Result.LOSE},
//            {Result.LOSE,Result.DROW,Result.WIN},
//            {Result.WIN,Result.LOSE,Result.DROW}
//    };
