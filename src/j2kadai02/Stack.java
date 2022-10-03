package j2kadai02;

public class Stack {
    public int[] st;
    public int i = 0;


    public void createStack(int size){
        this.st = new int[size];
    }
    public void push(int data){
        st[i] = data;
        i ++;
    }
    public int pop(){
        return i -= 1;
    }
    public int getData(int i){
        return st[i-0];
    }
    public int size(){
        return st.length;
    }
    public boolean isEmpty(){
        if(i <= 0) return true;
        else return false;
    }
    public boolean isFull(){
        if(i > 9) return true;
        else return false;

    }
}
