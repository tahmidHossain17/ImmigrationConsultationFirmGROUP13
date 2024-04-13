/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

import java.io.Serializable;

/**
 *
 * @author diyan
 */
public class Contact implements Serializable {
    String name,country,profession,email;
    int phone;

    public Contact() {
    }

    public Contact(String name, String country, String profession, String email, int phone) {
        this.name = name;
        this.country = country;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", country=" + country + ", profession=" + profession + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
}
