


    public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();

        list.getSize();
        System.out.println("Size of the linked list is : "+list.getSize());
        list.addLast(50);
        list.display();
        System.out.println("Size of the linked list is : "+list.getSize());
    }
}
		
