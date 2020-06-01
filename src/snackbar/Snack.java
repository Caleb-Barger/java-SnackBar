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
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        // Buy the quantity given?
    }

    public void totalCostFor(int quantity) {
        // how much for all them SNACKS!!
    }




}