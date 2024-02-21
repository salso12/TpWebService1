package ws;

import java.util.Date;

public class compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public int getCode() {
        return code;
    }

    public compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public compte() {
    }

    public double getSolde() {
        return solde;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }



}




