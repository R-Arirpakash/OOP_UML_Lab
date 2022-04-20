package mypackage;

public enum EntitlementType {
    Buy ("Buy"),
    Rent ("Rent");

    private String name = "";

    EntitlementType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntitlementType{" +
                "name='" + name + '\'' +
                '}';
    }
}
