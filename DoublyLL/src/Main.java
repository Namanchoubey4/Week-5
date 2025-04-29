public class Main{
    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();

        list.addAtBeginning(15);
        list.addAtBeginning(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.displayForward();
        list.displayBackward();
    }
}