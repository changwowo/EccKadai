package j2kadai11;

public class MyArray {
    private Monster[] array;

    public MyArray() {
        array = null;
    }

    public void add(Monster data) {
        Monster[] oldArray = array;
        array = new Monster[size() + 1];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = oldArray[i];
        }
        array[size()-1] = data;

    }

    public Monster get(int i) {
        return array[i];
    }

    public int size() {
         if (array == null) {
            return 0;
        } else {
            return array.length;
        }

    }
}
