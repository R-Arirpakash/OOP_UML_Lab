package mypackage;

public class Product {
    private int id;
    private String name;
    private LockingType lockingType;
    private Rehost rehost;
    private String description;

    public Product(int id, String name, LockingType lockingType, Rehost rehost, String description) {
        this.id = id;
        this.name = name;
        this.lockingType = lockingType;
        this.rehost = rehost;
        this.description = description;
    }
}
