package j2kadai06;

public class Canvas {
    private boolean[][] pixel;

    public Canvas(int width, int height) {
        pixel = new boolean[height][width];
        for (int y = 0; y < pixel.length; y++) {
            for (int x = 0; x < pixel[y].length; x++) {
                pixel[y][x] = false;
            }
        }
    }
    public void show() {
        for (int y = 0; y < pixel.length; y++) {
            for (int x = 0; x < pixel[y].length; x++) {
                System.out.print("　" + ((pixel[y][x])? "○": "・"));
            }
            System.out.println();
        }
    }
    private boolean inBound(int x, int y) {
        if ((y < 0) || (pixel.length <= y)) return false;
        if ((x < 0) || (pixel[y].length <= x)) return false;
        return true;
    }
    public void set(int x, int y) {
        if (inBound(x, y)) pixel[y][x] = true;
    }
    public void reset(int x, int y) {
        if (inBound(x, y)) pixel[y][x] = false;
    }
    // 直線描画
    public void drawLine(int x1, int y1, int x2, int y2) {



    }
}
