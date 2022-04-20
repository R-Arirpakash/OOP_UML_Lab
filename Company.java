package mypackage;

public class Company extends Customer{
    private String name;
    private String phone;
    private String fax;

    public Company(int CRM_ID, CustomerType type, String description, String name, String phone, String fax) {
        super(CRM_ID, type, description);
        this.name = name;
        this.phone = phone;
        this.fax = fax;
    }
}
