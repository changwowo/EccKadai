package j2kadai08;

public class Queue implements IContainer{
    private Monster[] container;
    private int start;          // 先頭ポジション
    private int used;          // データ数

    public Queue(int size) {
        container = new Monster[size];
        start = 0;
        used = 0;
        System.out.println("待ち行列を作りました！");
    }

    @Override
    public void push(Monster monster) {
        container[(start + used) % container.length] = monster;
        used++;

    }

    @Override
    public Monster pop() {
        Monster m = container[start];
        start = (start + 1) % container.length;
        used--;
        return m;
    }

    @Override
    public Monster getData(int i) {
        return container[(start + i) % container.length];
    }

    @Override
    public int size() {
        return used;
    }

    @Override
    public boolean empty() {
        return (used <= 0);
    }

    @Override
    public boolean full() {
        return (used >= container.length);
    }
}

/*
public void push(Monster data) {
        container[(start + used) % container.length] = data;
        used++;
    }
    public Monster pop() {
        Monster m = container[start];
        start = (start + 1) % container.length;
        used--;
        return m;
    }
    @Override
    public Monster getData(int i) { return container[(start + i) % container.length]; }
    @Override
    public int size() { return used; }
    @Override
    public boolean empty() { return (used <= 0); }
    @Override
    public boolean full() { return (used >= container.length); }
 */
