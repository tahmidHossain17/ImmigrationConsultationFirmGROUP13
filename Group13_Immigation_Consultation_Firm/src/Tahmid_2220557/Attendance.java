
package Tahmid_2220557;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendance implements Serializable{
    String name,attendanceStatus;
    LocalDate date;
    int hours;

    public Attendance() {
    }

    public Attendance(String name, String attendanceStatus, LocalDate date, int hours) {
        this.name = name;
        this.attendanceStatus = attendanceStatus;
        this.date = date;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Attendance{" + "name=" + name + ", attendanceStatus=" + attendanceStatus + ", date=" + date + ", hours=" + hours + '}';
    }
    
    
    
}
