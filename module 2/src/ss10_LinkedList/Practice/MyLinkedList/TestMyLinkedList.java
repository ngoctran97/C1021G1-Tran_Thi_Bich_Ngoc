package ss10_LinkedList.Practice.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(12);

        ll.add(4,9);
        ll.add(4, 9);
        ll.printList();
        ll.get(2);
    }
}
