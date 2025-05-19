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