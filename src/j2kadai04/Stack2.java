package j2kadai04;

public class Stack2 {
    private Monster[] container;
    private int sp;



    public Stack2(int size) {
        container = new Monster[size];
        sp = 0;
    }
    public void push(Monster data) {
        container[sp++] = data;

    }
    public Monster pop() {
        return container[--sp];
    }
    public Monster getData(int i) {
        return container[i];
    }
    public int size() {
        return sp;
    }
    public boolean empty() {
        return (sp <= 0);
    }
    public boolean full() {
        return (sp >= container.length);
    }

}