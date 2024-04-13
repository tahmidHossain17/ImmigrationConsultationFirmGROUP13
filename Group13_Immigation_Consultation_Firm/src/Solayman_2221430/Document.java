/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

import java.io.Serializable;



public class Document implements Serializable {
    String passportNo,Name,Gender,Nationality,dob;

    public Document() {
    }

    public Document(String passportNo, String Name, String Gender, String Nationality, String dob) {
        this.passportNo = passportNo;
        this.Name = Name;
        this.Gender = Gender;
        this.Nationality = Nationality;
        this.dob = dob;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Document{" + "passportNo=" + passportNo + ", Name=" + Name + ", Gender=" + Gender + ", Nationality=" + Nationality + ", dob=" + dob + '}';
    }

    
            
    
}
