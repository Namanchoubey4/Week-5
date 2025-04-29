class InventoryNode{
    String itemName;
    String itemId;
    int itemQty;
    int price;
    InventoryNode next;

    InventoryNode(String itemName , String itemId ,int itemQty,int price){
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQty = itemQty;
        this.price = price;
        this.next = null;
    }
}
class InventorySystem{
    InventoryNode head;

    public void addLast(String itemName , String itemId , int itemQty , int price){
        InventoryNode newNode =  new InventoryNode(itemName,itemId,itemQty,price);

        if(head == null){
            head = newNode;
        }
        InventoryNode current = head ;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertAt(String itemName , String itemId , String itemQty , int price , int position){
        InventoryNode newNode = new InventoryNode(itemName,itemId,itemQty,price);

        if(position == 0){
            newNode.next = head;
            head = newNode;
        }
    InventoryNode current = head;
    int count = 0;

    while(current != && count < position-1){
        current = current.next;
        count++;
    }
    if(current == null ){
        System.out.println("Position out of bound");
    }
    newNode.next = current.next;
    current.next = newNode;
    
}