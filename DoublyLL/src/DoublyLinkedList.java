public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    void addAtBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void addAtEnd(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    void displayForward(){
        Node current = head;
        System.out.println("Forward: ");
        while(current!=null){
            System.out.print(current.data+"<->");
            current = current.next;
        }
        System.out.println("null");
    }
    void displayBackward(){
        Node current = tail;
        System.out.println("Backward");
        while(current!=null){
            System.out.print(current.data+"<->");
            current = current.prev;
        }
        System.out.println("null");
    }
}
