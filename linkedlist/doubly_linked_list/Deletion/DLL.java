package linkedlist.doubly_linked_list.Deletion;

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

    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int deleteAtLast(){
        int value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteAtPos(int pos){
        Node temp1 = head, temp2 = null;
        while(pos > 1){
            temp2 = temp1;
            temp1 = temp1.next;
            pos--;
        }
        int value = temp1.value;
        temp2.next = temp1.next;
        temp1.next.prev = temp1;
        size--;
        return value;

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
