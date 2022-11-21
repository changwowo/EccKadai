package j2kadai15;

public abstract class Handler {
    String name;

    public Handler(String name){
        this.name = name;

    }

    public boolean handle(int n){
        return resolve(n);
    }

    @Override
    public String toString(){
        return name;
    }

    public abstract boolean resolve(int n);
}
