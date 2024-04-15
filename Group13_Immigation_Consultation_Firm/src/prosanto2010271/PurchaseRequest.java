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
public class PurchaseRequest implements Serializable {
    public int id;
    public LocalDate date ;
    public float ammount;
    public String purpose;

    public PurchaseRequest() {
    }

    public PurchaseRequest(int id, LocalDate date, float ammount, String purpose) {
        this.id = id;
        this.date = date;
        this.ammount = ammount;
        this.purpose = purpose;
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
        return "PurchaseRequest{" + "id=" + id + ", date=" + date + ", ammount=" + ammount + ", purpose=" + purpose + '}';
    }

   
    
    
    
    
    
}
