class LinkedList {

    Node head;
    int size = 0;


    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
        }
        size--;
        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("This is list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void display() {
        Node current = head;

        System.out.println("Linked List :");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}