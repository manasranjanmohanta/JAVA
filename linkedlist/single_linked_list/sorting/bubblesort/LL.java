package linkedlist.single_linked_list.sorting.bubblesort;

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
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

// Bubble Sort
        public void bubbleSort(){
            bubbleSort(size - 1, 0);
        }

    private void bubbleSort(int row, int col) {
        if(row == 0){
            return;
        }
        if(col < row) {
            Node first = get(col);
            Node second = get(col + 1);
            if (first.value > second.value) {
                if (first == head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    private Node get(int value) {
        if(value == 0){
            return head;
        }
        Node temp = head;
        while(value > 0){
            temp = temp.next;
            value--;
        }
        return temp;
    }

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

    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 6; i > 0; i--) {
            list.insertAtLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
