



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
