/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

import java.io.Serializable;


public class Accomodation implements Serializable {
    String country,city,stayers,accomodationType,gender,ownersName,ownersEmail,advance,rentPerPerson,noOfRooms,personPerRoom;

    public Accomodation(String country, String city, String stayers, String accomodationType, String gender, String ownersName, String ownersEmail, String advance, String rentPerPerson, String noOfRooms, String personPerRoom) {
        this.country = country;
        this.city = city;
        this.stayers = stayers;
        this.accomodationType = accomodationType;
        this.gender = gender;
        this.ownersName = ownersName;
        this.ownersEmail = ownersEmail;
        this.advance = advance;
        this.rentPerPerson = rentPerPerson;
        this.noOfRooms = noOfRooms;
        this.personPerRoom = personPerRoom;
    }

    public Accomodation() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStayers() {
        return stayers;
    }

    public void setStayers(String stayers) {
        this.stayers = stayers;
    }

    public String getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(String accomodationType) {
        this.accomodationType = accomodationType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersEmail() {
        return ownersEmail;
    }

    public void setOwnersEmail(String ownersEmail) {
        this.ownersEmail = ownersEmail;
    }

    public String getAdvance() {
        return advance;
    }

    public void setAdvance(String advance) {
        this.advance = advance;
    }

    public String getRentPerPerson() {
        return rentPerPerson;
    }

    public void setRentPerPerson(String rentPerPerson) {
        this.rentPerPerson = rentPerPerson;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getPersonPerRoom() {
        return personPerRoom;
    }

    public void setPersonPerRoom(String personPerRoom) {
        this.personPerRoom = personPerRoom;
    }

    @Override
    public String toString() {
        return "Accomodation{" + "country=" + country + ", city=" + city + ", stayers=" + stayers + ", accomodationType=" + accomodationType + ", gender=" + gender + ", ownersName=" + ownersName + ", ownersEmail=" + ownersEmail + ", advance=" + advance + ", rentPerPerson=" + rentPerPerson + ", noOfRooms=" + noOfRooms + ", personPerRoom=" + personPerRoom + '}';
    }

    
    
    
}
