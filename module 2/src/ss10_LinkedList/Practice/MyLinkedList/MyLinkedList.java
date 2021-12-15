package ss10_LinkedList.Practice.MyLinkedList;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;

        public Node (Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    // cai dat phuong thuc add, them phan tu vao vi tri index
    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i< index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    // cai dat phuong thuc addFirst(), theem phan tu vaof vi tri dau tien trong danh sacj
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    // phuong thuc get, lay phan tu o vi tri index tu danh sach
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    // phuong thuc printList, hien thij cac phan tu trong danh sach
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
