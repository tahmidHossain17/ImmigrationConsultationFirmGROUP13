
package Solayman_2221430;

import java.io.Serializable;


public class AvaiableFlight implements Serializable {
    String country,availableFlightsName;
    int costPerFlight;

    public AvaiableFlight(String country, String availableFlightsName, int costPerFlight) {
        this.country = country;
        this.availableFlightsName = availableFlightsName;
        this.costPerFlight = costPerFlight;
    }

    public AvaiableFlight() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvailableFlightsName() {
        return availableFlightsName;
    }

    public void setAvailableFlightsName(String availableFlightsName) {
        this.availableFlightsName = availableFlightsName;
    }

    public int getCostPerFlight() {
        return costPerFlight;
    }

    public void setCostPerFlight(int costPerFlight) {
        this.costPerFlight = costPerFlight;
    }

    @Override
    public String toString() {
        return "AvaiableFlights{" + "country=" + country + ", availableFlightsName=" + availableFlightsName + ", costPerFlight=" + costPerFlight + '}';
    }
    
    
}
