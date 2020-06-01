package snackbar;

public class VendingMachine{
    private static int maxId = 0;

    private int id;
    private String name;

    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}