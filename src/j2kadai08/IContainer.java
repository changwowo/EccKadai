package j2kadai08;

public interface IContainer {
    public void push(Monster monster);

    public Monster pop();

    public Monster getData(int i);

    public int size();

    public boolean empty();

    public boolean full();
}

/*
push(data : Monster) :void
pop() : Monster
getData(I : int) : Monster
size() : int
empty() : boolean
full() : boolean()
 */
