package snackbar;

public class Main {

    private static void keepItClean() {

        // Customers
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        // Vending machines
        VendingMachine vendMach1 = new VendingMachine("Food");
        VendingMachine vendMach2 = new VendingMachine("Drink");
        VendingMachine vendMach3 = new VendingMachine("Office");

        // Snacks
            // Food
        Snack snk1 = new Snack("Chips", 36, 1.75, vendMach1.getId());
        Snack snk2 = new Snack("Choclate Bar", 36, 1.00, vendMach1.getId());
        Snack snk3 = new Snack("Pretzel", 30, 2.00, vendMach1.getId());
            // Drink
        Snack snk4 = new Snack("Soda", 24, 2.50, vendMach2.getId());
        Snack snk5 = new Snack("Water", 20, 2.75, vendMach2.getId());
        
    }
    public static void main(String[] args) {
        keepItClean();
    }
}