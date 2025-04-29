class InventoryNode {
    String itemName;
    String itemId;
    int itemQty;
    int price;
    InventoryNode next;

    InventoryNode(String itemName, String itemId, int itemQty, int price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQty = itemQty;
        this.price = price;
        this.next = null;
    }
}

class InventorySystem {
    InventoryNode head;

    public void addLast(String itemName, String itemId, int itemQty, int price) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, itemQty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        InventoryNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(String itemName, String itemId, int itemQty, int price, int position) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, itemQty, price);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        InventoryNode current = head;
        int count = 0;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void addFirst(String itemName, String itemId, int itemQty, int price) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, itemQty, price);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("No item in the inventory");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        InventoryNode secondLast = head;
        InventoryNode lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void display() {
        InventoryNode current = head;
        System.out.println("Inventory Management System:");

        while (current != null) {
            System.out.println("Item Name: " + current.itemName +
                    ", Item ID: " + current.itemId +
                    ", Quantity: " + current.itemQty +
                    ", Price: " + current.price + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        InventorySystem item = new InventorySystem();

        item.addFirst("Bucket", "BK001", 2, 256);
        item.addFirst("Cookies", "CK002", 5, 100);
        item.addFirst("Mattress", "NP001", 1, 500);
        item.addFirst("Bag", "NC001", 1, 1000);
        item.addLast("Chairs", "MP001", 4, 1500);
        item.insertAt("Table", "TB001", 2, 800, 3);

        item.display();

        item.insertAt("Soap", "SP001", 4, 100, 2);
        item.display();

        item.deleteFirst();
        item.display();

        item.deleteLast();
        item.display();
    }
}
