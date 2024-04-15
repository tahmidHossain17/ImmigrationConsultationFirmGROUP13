



package Tahmid_2220557;

import java.io.Serializable;
import java.time.LocalDate;


public class Appointment implements Serializable {
    String name,timeslot,phone;
    LocalDate date;

    public Appointment() {
    }

    public Appointment(String name, String timeslot, String phone, LocalDate date) {
        this.name = name;
        this.timeslot = timeslot;
        this.phone = phone;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" + "name=" + name + ", timeslot=" + timeslot + ", phone=" + phone + ", date=" + date + '}';
    }
    
}
