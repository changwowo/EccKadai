package j2kadai10;

public class Choki extends Hand {
    public Choki() { super("チョキ"); }

    @Override
    public Janken.Result vsHand(Hand other) {
        return null;
    }

    // vsHandを追加

}
