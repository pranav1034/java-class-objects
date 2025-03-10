import java.util.ArrayList;
import java.util.List;

class CartItem {
    final private String itemName;
    final private double price;
    final private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    final private List<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        cartItems.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        System.out.println("Cart Summary:");
        for (CartItem item : cartItems) {
            System.out.println(item.getQuantity() + " x " + item.getItemName() + " - " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 10000.00, 1);
        cart.addItem("Mobile", 2500.00, 2);
        cart.displayTotalCost();

        cart.removeItem("Laptop");
        cart.displayTotalCost();
    }
}
