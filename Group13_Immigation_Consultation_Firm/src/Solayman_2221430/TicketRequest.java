/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author diyan
 */
public class TicketRequest extends Client implements Serializable {
    String name,passportNo,flightSelected,country;
    LocalDate dateOfFlight;

    public TicketRequest() {
    }

    public TicketRequest(String name, String passportNo, String flightSelected, String country, LocalDate dateOfFlight) {
        this.name = name;
        this.passportNo = passportNo;
        this.flightSelected = flightSelected;
        this.country = country;
        this.dateOfFlight = dateOfFlight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getFlightSelected() {
        return flightSelected;
    }

    public void setFlightSelected(String flightSelected) {
        this.flightSelected = flightSelected;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    @Override
    public String toString() {
        return "TicketRequest{" + "name=" + name + ", passportNo=" + passportNo + ", flightSelected=" + flightSelected + ", country=" + country + ", dateOfFlight=" + dateOfFlight + '}';
    }
    
    
}
