package j2kadai03;

public class Stack {
    public String[] st;
    public int i = 0;

    public String indent(int j){
        String indent = "\t";
        for(int k =0; k<j;k++){
            indent += "\t";
        }
        return indent;
    }


    public void createStack(int size){
        this.st = new String[size];
    }
    public void push(String data){
        st[i] = indent(i)+data;
        getData(++i);
    }
    public int pop(){
        return i -= 1;
    }
    public String getData(int i){
        return st[i-1];
    }
    public int size(){
        return st.length;
    }
    public boolean isEmpty(){
        if(i <= 0) return true;
        else return false;
    }
    public boolean isFull(){
        if(i >= size()) return true;
        else return false;

    }
}
