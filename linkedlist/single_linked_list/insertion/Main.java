package linkedlist.single_linked_list.insertion;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(69);
        list.insertAtFirst(281);
        list.insertAtFirst(27);
        list.insertAtFirst(250);
        list.insertAtFirst(25);
        System.out.println("Inserting element at first : ");
        list.display();

        System.out.println("\nInserting element at last : ");
        list.insertAtLast(90);
        list.display();

        System.out.println("\nInserting element at certain position : ");
        list.insertAtPos(34, 3);
        list.display();

        System.out.println("\nInserting element at certain index using recursion : ");
        list.insertRec(7, 3);
        list.display();
    }
}
