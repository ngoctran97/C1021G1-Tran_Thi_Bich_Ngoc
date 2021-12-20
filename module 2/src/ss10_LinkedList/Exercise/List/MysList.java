package ss10_LinkedList.Exercise.List;

public class MysList {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MysList() {
    }

    public MysList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }
}
