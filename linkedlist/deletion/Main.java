package linkedlist.deletion;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtFirst(69);
        list.insertAtFirst(281);
        list.insertAtFirst(27);
        list.insertAtFirst(250);
        list.insertAtFirst(25);
        list.display();

        System.out.println("\nDeletion of node at first:");
        System.out.println("Deleted node is : " + list.deleteAtFirst());
        list.display();

        System.out.println("\nDeletion of node at Last:");
        System.out.println("Deleted node is : " + list.deleteAtLast());
        list.display();

        System.out.println("\nDeletion of node at certain postion:");
        System.out.println("Deleted node is: " + list.deleteAtPos(3));
        list.display();
    }
}
