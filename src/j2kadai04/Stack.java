package j2kadai04;

public class Stack {
    private Monster[] container;
    private int sp;

    public Stack(int size) {
        container = new Monster[size];
        sp = 0;
    }
    public void push(Monster data) {
            container[sp++] = data;

    }
    public Monster pop() {

//        for(int i = 0 ; i < size()-1 ; i++){
//            container[i] = container[i+1];
//        }
        Monster popMonster = container[0];
        for(int i = 0 ; i < size()-1 ; i++){
            container[i] = container[i+1];
        }
        sp--;
        return popMonster;
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
