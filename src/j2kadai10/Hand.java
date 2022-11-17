package j2kadai10;

public abstract class Hand {
    private String name;
    public Hand(String name) { this.name = name; }
    public String toString() { return name; }

    // vsHandを追加
   public abstract Janken.Result vsHand(Hand other);

}
