package j2kadai08;

public class Stack implements IContainer {
    private Monster[] container;
    private int sp;

    public Stack(int size) {
        container = new Monster[size];
        sp = 0;
        System.out.println("スタックを作りました！");
    }

    @Override
    public void push(Monster monster) {
        container[sp++] = monster;

    }

    @Override
    public Monster pop() {
        return container[--sp];
    }

    @Override
    public Monster getData(int i) {
        return container[i];
    }

    @Override
    public int size() {
        return sp;
    }

    @Override
    public boolean empty() {
        return (sp <= 0);
    }

    @Override
    public boolean full() {
        return (sp >= container.length);
    }
}

/*
public void push(Monster data) { container[sp++] = data; }
    public Monster pop() { return container[--sp]; }
    public Monster getData(int i) { return container[i]; }
    public int size() { return sp; }
    public boolean empty() { return (sp <= 0); }
    public boolean full() { return (sp >= container.length); }
 */