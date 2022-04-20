package mypackage;

import java.util.Date;

public class Entitlement {
    private String EID;
    private int type;
    private Date startDate;
    private Date endDate;
    private boolean neverExpires = true;
    private String comments;

    public Entitlement(String EID, int type, Date startDate, Date endDate, boolean neverExpires, String comments) {
        this.EID = EID;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.neverExpires = neverExpires;
        this.comments = comments;
    }
}
