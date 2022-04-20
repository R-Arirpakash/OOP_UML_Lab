package mypackage;

public enum CustomerType {
    Individual ("Individual"),
    Company ("Company");
    private String name = "";
    CustomerType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "name='" + name + '\'' +
                '}';
    }
}
