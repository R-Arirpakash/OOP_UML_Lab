package mypackage;

public class Individual extends Customer{
    private String firstname;
    private String lastname;
    private String middlename;
    private String email;
    private String phone;
    private String locale = "English";

    public Individual(int CRM_ID, CustomerType type, String description, String firstname, String lastname, String middlename, String email, String phone, String locale) {
        super(CRM_ID, type, description);
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.email = email;
        this.phone = phone;
        this.locale = locale;
    }
}
