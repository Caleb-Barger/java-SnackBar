package snackbar;

public class Main {

    private static void keepItClean() {

        // Object instantiaion
        //-------------------------------------------------------------

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

        // Now process things...
        //-------------------------------------------------------------

        // Jane
        snk4.buySnack(3, cust1.getName(), vendMach1.getName());
        cust1.buySnacks(snk4.totalCostFor(3));
        System.out.println(cust1.toString());
        System.out.println(snk4.toString());

        snk3.buySnack(1, cust1.getName(), vendMach1.getName());
        cust1.buySnacks(snk3.totalCostFor(1));
        System.out.println(cust1.toString());
        System.out.println(snk3.toString());

        // Bob
        snk4.buySnack(2, cust2.getName(), vendMach2.getName());
        cust2.buySnacks(snk4.totalCostFor(2));
        System.out.println(cust2.toString());
        System.out.println(snk4.toString());

        // More Jane action
        cust1.addCashOnHand(10.00);
        System.out.println(cust1.toString());
        snk2.buySnack(1, cust1.getName(), vendMach1.getName());
        cust1.buySnacks(snk2.totalCostFor(1));
        System.out.println(cust1.toString());
        System.out.println(snk2.toString());

        // Restock
        snk3.addQuantity(12);
        System.out.println(snk3.toString());
        snk3.buySnack(3, cust2.getName(), vendMach1.getName());
        cust2.buySnacks(snk3.totalCostFor(3));
        System.out.println(cust2.toString());
        System.out.println(snk3.toString());
    }

    public static void main(String[] args) {
        keepItClean();
    }
}