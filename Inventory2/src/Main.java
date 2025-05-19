



// Main class to run the inventory system
public class Main {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        // Add items
        inventory.addLast("Apple", "A101", 50, 20);
        inventory.addLast("Banana", "B202", 100, 10);

        // Insert item at position 1
        inventory.insertAt("Orange", "O303", 70, 15, 1);

        // Display current inventory
        inventory.displayInventory();
    }
}
