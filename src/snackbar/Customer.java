package snackbar;

public class Customer {

    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Other fun methods :)
    public void addCashOnHand(double cashOnHand) {
        this.cashOnHand += cashOnHand;
    }

    public void buySnacks(double totalCost) {
        this.cashOnHand -= totalCost;
    }
}