package com.hussein.userutil;

public class Cources {
    private String cName,cHour,cHall;

    public Cources(String cName, String cHour, String cHall) {
        this.cName = cName;
        this.cHour = cHour;
        this.cHall = cHall;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcHour() {
        return cHour;
    }

    public void setcHour(String cHour) {
        this.cHour = cHour;
    }

    public String getcHall() {
        return cHall;
    }

    public void setcHall(String cHall) {
        this.cHall = cHall;
    }
}
