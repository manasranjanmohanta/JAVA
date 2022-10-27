package linkedlist.circular_linked_list.deletion;

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

// For deleting elements at first
    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;
        tail.next = head;
        size--;
        return value;
    }

// For deleting elements at last
    public int deleteAtLast(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int value = tail.value;
        temp.next = tail.next;
        size--;
        return value;
    }

// For deleting elment at certain position
    public int deleteAtPos(int pos){
        pos--;
        Node temp1 = head, temp2 = null;
        while(pos > 0){
            temp2 = temp1;
            temp1 = temp1.next;
            pos--;
        }
        int value = temp1.value;
        temp2.next = temp1.next;
        return value;
    }



    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.display();

// Deleting first element
        System.out.print("The deleted element is : ");
        System.out.println(list.deleteAtFirst());
        list.display();

// Deleting last element
        System.out.print("The deleted element is : ");
        System.out.println(list.deleteAtLast());
        list.display();

// Deleting a certain element
        System.out.println("The deleted element is : ");
        System.out.println(list.deleteAtPos(3));
        list.display();
    }
}
