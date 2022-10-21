package linkedlist.single_linked_list.searching;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.insertAtFirst(69);
        list.insertAtFirst(96);
        list.insertAtFirst(15);
        list.insertAtFirst(6);
        list.insertAtFirst(12);
        list.display();

        int value = 78;
        boolean ans = list.searchAnElement(value);
        if(ans){
            System.out.print(value + " is present in linked list : ");
            list.display();
        }
        else{
            System.out.print(value + " is not present in linked list :");
            list.display();
        }


    }
}
