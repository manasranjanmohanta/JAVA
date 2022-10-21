package linkedlist.doubly_linked_list.insertion;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtFirst(69);
        list.insertAtFirst(15);
        list.insertAtFirst(60);
        list.insertAtFirst(13);
        list.insertAtFirst(281);
        list.display();

        System.out.println("Insertion at last : ");
        list.insertAtLast(45);
        list.display();

        System.out.println("Insert At Certain Position : ");
        list.insertAtPos(34, 3);
        list.display();

    }

}
