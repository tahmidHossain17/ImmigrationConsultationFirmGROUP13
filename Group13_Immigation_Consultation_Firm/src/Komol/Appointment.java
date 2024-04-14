/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komol;

/**
 *
 * @author Komol
 */
public class Appointment {
    private String clientname;
    private Integer clientphonenumber;
    private String time;

    public Appointment(String clientname, Integer clientphonenumber, String time) {
        this.clientname = clientname;
        this.clientphonenumber = clientphonenumber;
        this.time = time;
    }

    public Appointment() {
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public Integer getClientphonenumber() {
        return clientphonenumber;
    }

    public void setClientphonenumber(Integer clientphonenumber) {
        this.clientphonenumber = clientphonenumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment{" + "clientname=" + clientname + ", clientphonenumber=" + clientphonenumber + ", time=" + time + '}';
    }

}   
    
