package j2kadai08;

public class Square extends Rectangle implements IShape{
    public Square(int left, int top, int width, int height) {
        super(left, top, width, height);
    }

    @Override
    public void draw(Canvas c) {
        super.draw(c);
    }
}
