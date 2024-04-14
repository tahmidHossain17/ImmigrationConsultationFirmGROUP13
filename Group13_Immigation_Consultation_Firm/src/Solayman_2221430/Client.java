
package Solayman_2221430;

import java.time.LocalDate;


public class Client {
    String name,gender,phone,email,passportNo,nationality;
    LocalDate dob;

    public Client() {
    }

    public Client(String name, String gender, String phone, String email, String passportNo, String nationality, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.passportNo = passportNo;
        this.nationality = nationality;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", passportNo=" + passportNo + ", nationality=" + nationality + ", dob=" + dob + '}';
    }
    
    
}
