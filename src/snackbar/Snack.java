package snackbar;

public class Snack{

    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {

        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    // Other cool methods :)
    public void addQuantity(int quantity) {
        System.out.println("\n" + "Added " + 
        quantity + " " + name + "'s");
        this.quantity += quantity;
    }

    public void buySnack(int quantity, String customerName, String machineName) {

        double costToPurchaseAll = (this.quantity * cost);

        System.out.println("\n" + customerName + 
        " buys " + quantity + 
        " things of " + name + " from " + machineName);
        System.out.println("Old Stock: " + this.quantity 
        + "\n" + "Total for all Stock: $" + costToPurchaseAll);

        this.quantity -= quantity;
    }

    public double totalCostFor(int quantity) {
        return (quantity * cost);
    }

    @Override
    public String toString() {
        String returnValue = "Item Name: " + name + 
        "\n" + "New Quantity: " 
        + quantity + "\n";
        return returnValue;
    }
}