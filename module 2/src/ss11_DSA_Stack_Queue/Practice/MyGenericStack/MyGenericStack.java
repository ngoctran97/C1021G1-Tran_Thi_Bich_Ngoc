package ss11_DSA_Stack_Queue.Practice.MyGenericStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    // phuong thuc push
    public void push(T element){
        stack.addFirst(element);
    }
    // phuong thuc pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    // phuong thuc size()
    public int size() {
        return stack.size();
    }
    //phuong thuc isEmpty
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

}


