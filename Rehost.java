package mypackage;

public enum Rehost {
    Enable ("Enable"),
    Disable ("Disable"),
    Leave_as_it_is ("Leave_as_it_is"),
    Specify_at_entitlement_time ("Specify_at_entitlement_time");
    private String name = "";

    Rehost(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rehost{" +
                "name='" + name + '\'' +
                '}';
    }
}
