package linkedlist.single_linked_list.insertion;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = size;
    }

//    Method for displaying the LinkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

//    Method for inserting element at first
    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

//    Method for inserting element at last
    public void insertAtLast(int value){
        if(head == null){
            insertAtFirst(value);
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }


//    Method for inserting element at certaion position
    public void insertAtPos(int value, int pos){
        if(pos == 0){
            insertAtFirst(value);
        }
        if(pos == size){
            insertAtLast(value);
        }
        Node temp = head;
        pos--;
        while(pos > 1){
            temp = temp.next;
            pos--;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }


    // Method for inserting element at a particular index using recursion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

//    Creation of Node
    public class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
