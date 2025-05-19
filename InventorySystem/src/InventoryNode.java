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