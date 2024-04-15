
package Solayman_2221430;

import java.io.Serializable;
import java.time.LocalDate;


public class Profile implements Serializable {
    
    String name,phone,email,passportno,nationality,gender;
    
    LocalDate dob;

    public Profile() {
    }

    public Profile(String name, String phone, String email, String passportno, String nationality, String gender, LocalDate dob) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.passportno = passportno;
        this.nationality = nationality;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", phone=" + phone + ", email=" + email + ", passportno=" + passportno + ", nationality=" + nationality + ", gender=" + gender + ", dob=" + dob + '}';
    }
    
    
    
    
}
