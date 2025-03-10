class Item {
    final private int itemCode;
    final private String itemName;
    final private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 750.00);
        System.out.println("Item Details:");
        item1.displayItemDetails();
        System.out.println("Total Cost for 3 units: $" + item1.calculateTotalCost(3));
    }
}
