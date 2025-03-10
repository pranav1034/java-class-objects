public class FoodDeliveryApp {
    private String name;
    private String location;
    private String[] foodItems;

    public FoodDeliveryApp(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }
    public void displayDetails() {
        System.out.println("Restaurant name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items: ");
        for (String item : foodItems) {
            System.out.println("-" + item);
        }
    }
    public boolean isFoodAvailable(String food) {
        for (String item : foodItems) {
            if (item.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] foodItems1 = {"Pizza","Pasta","Burger"};
        String[] foodItems2 = {"Sushi","Ramen","Tempura"};

        FoodDeliveryApp restaurant1 = new FoodDeliveryApp("Italian Delight","Downtown",foodItems1);
        FoodDeliveryApp restaurant2 = new FoodDeliveryApp("Tokyo Treats","Uptown",foodItems2);

        System.out.println("=== Restaurant 1 ===");
        restaurant1.displayDetails();
        System.out.println("\n=== Restaurant 2 ===");
        restaurant2.displayDetails();

        System.out.println("\nChecking Food Availability: ");
        System.out.println("Is Pasta available in Italian Delight? "+ restaurant1.isFoodAvailable("Pasta"));
        System.out.println("Is Sushi available in Italian Delight? "+ restaurant1.isFoodAvailable("Sushi"));
    }
}


