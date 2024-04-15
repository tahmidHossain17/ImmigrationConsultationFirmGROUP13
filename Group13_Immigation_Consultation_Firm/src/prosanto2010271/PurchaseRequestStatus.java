/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosanto2010271;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author prosh
 */
public class PurchaseRequestStatus extends PurchaseRequest implements Serializable {
    public boolean requestStatus;

    public PurchaseRequestStatus() {
    }

    public PurchaseRequestStatus(int id, LocalDate date, float ammount, String purpose) {
        super(id, date, ammount, purpose);
    }

    public boolean isRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(boolean requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getAmmount() {
        return ammount;
    }

    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "PurchaseRequestStatus{" + "requestStatus=" + requestStatus + '}';
    }
    
    
}
