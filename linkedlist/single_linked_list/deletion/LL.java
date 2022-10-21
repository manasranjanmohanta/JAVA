package linkedlist.single_linked_list.deletion;

public class LL {
        private Node head;
        private Node tail;
        private int size;
        public LL(){
            this.size = size;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }
        public void insertAtFirst(int value){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            if(tail == null){
                tail = head;
            }
            size++;
        }

        public int deleteAtFirst(){
            if(head == null){
                System.out.println("Nothing to be deleted, insert first then delete.");
            }
            int value = head.value;
            head = head.next;
            if(head == null){
                tail = head;
            }
            return value;
        }

        public int deleteAtLast(){
            Node temp1 = head, temp2 = null;
            while(temp1.next != null){
                temp2 = temp1;
                temp1 = temp1.next;
            }
            int value = temp1.value;  // int value = tail.value;
            temp2.next = null;
            tail = temp2;
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

            return value;

        }

        private class Node{
             int value;
             Node next;
            public Node(int value) {
                this.value = value;
            }
            public Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
        }
//        public class Node{
//            private int value;
//            private Node next;
//            public Node(int value) {
//                this.value = value;
//            }
//            public Node(int value, Node next){
//                this.value = value;
//                this.next = next;
//            }
//        }

    }
