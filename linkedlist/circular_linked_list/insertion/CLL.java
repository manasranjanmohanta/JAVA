package linkedlist.circular_linked_list.insertion;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    private class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

//  For displaying circular linked list
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
        }
        else {
            System.out.println("Linked list is null");
        }
    }
// For inserting node in linked list

    public void insertAtLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(head == null){
            insertAtLast(value);
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
        size++;
    }

    public void insertAtPos(int value, int pos){
        Node node = new Node(value);
        Node temp = head;
        pos--;
        while(pos > 1){
            temp = temp.next;
            pos--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

    }


    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.display();

// Inserting elements first
//        list.insertAtFirst(6);
//        list.display();
// Inserting elements at certain position

        list.insertAtPos(7,3);
        list.display();
    }


}
