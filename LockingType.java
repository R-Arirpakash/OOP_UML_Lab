package mypackage;

public enum LockingType {
    HL ("HL"),
    SL_AdminMode ("SL_AdminMode"),
    SL_UserMode ("SL_UserMode"),
    HL_or_SEL_AdminMode ("HL_or_SEL_AdminMode"),
    HL_or_SEL_AdminMode_or_SL_UserMode ("HL_or_SEL_AdminMode_or_SL_UserMode");

    private String name = "";

    LockingType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LockingType{" +
                "name='" + name + '\'' +
                '}';
    }
}
