class InventorySystem {
    InventoryNode head;

    // Add item at the end of the list
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

    // Insert at a specific position (0-based indexing)
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

    // Display the inventory list
    public void displayInventory() {
        InventoryNode current = head;
        if (current == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("Current Inventory:");
        while (current != null) {
            System.out.println("Item Name: " + current.itemName +
                    ", ID: " + current.itemId +
                    ", Qty: " + current.itemQty +
                    ", Price: " + current.price);
            current = current.next;
        }
    }
}