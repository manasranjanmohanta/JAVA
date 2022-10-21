package linkedlist.insertion;

import linkedlist.insertion.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(69);
        list.insertAtFirst(281);
        list.insertAtFirst(27);
        list.insertAtFirst(250);
        list.insertAtFirst(25);
        list.display();

        list.insertAtLast(90);
        list.display();

        list.insertAtPos(34, 3);
        list.display();
    }
}
