package linkedlist.doubly_linked_list.Deletion;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtFirst(69);
        list.insertAtFirst(281);
        list.insertAtFirst(15);
        list.insertAtFirst(11);
        list.insertAtFirst(81);
        list.insertAtFirst(96);
        list.display();

        System.out.println("Deletion node at First : ");
        System.out.println("The Deleted node is : " + list.deleteAtFirst());
        list.display();

        System.out.println("Deletion node at Last : ");
        System.out.println("The Deleted node is : " + list.deleteAtLast());
        list.display();

        System.out.println("Deletion node at certain position : ");
        System.out.println("The Deleted node is : " + list.deleteAtPos(3));
        list.display();

    }
}
