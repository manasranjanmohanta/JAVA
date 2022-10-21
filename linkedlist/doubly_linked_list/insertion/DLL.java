package linkedlist.doubly_linked_list.insertion;

public class DLL {
    private Node head;
    private Node tail;
    private int size;
    public DLL(){
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value){
        if(tail == null){
            insertAtFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtPos(int value, int pos){
        Node temp = head;
        pos--;
        while(pos > 1){
            temp = temp.next;
            pos--;
        }
        Node node = new Node(value);
        node.next = temp.next;
        if(temp.next != null){
            node.next.prev = node;
        }
        temp.next = node;
        node.prev = temp;
        size++;

    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
