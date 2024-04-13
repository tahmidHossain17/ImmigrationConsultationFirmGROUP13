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
public class Update implements Serializable{
    public String name;
    public int id;
    public LocalDate date; 
    public String details;

    public Update(String name, int id, LocalDate date, String details) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Update{" + "name=" + name + ", id=" + id + ", date=" + date + ", details=" + details + '}';
    }
    
    
}
