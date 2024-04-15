/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

/**
 *
 * @author diyan
 */
public class AccomodationBook {
    int sl;
    String noOfRooms,personPerRoom,gender,ownersDetail,rentPerPerson,advance;

    public AccomodationBook() {
    }

    public AccomodationBook(int sl, String noOfRooms, String personPerRoom, String gender, String ownersDetail, String rentPerPerson, String advance) {
        this.sl = sl;
        this.noOfRooms = noOfRooms;
        this.personPerRoom = personPerRoom;
        this.gender = gender;
        this.ownersDetail = ownersDetail;
        this.rentPerPerson = rentPerPerson;
        this.advance = advance;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwnersDetail() {
        return ownersDetail;
    }

    public void setOwnersDetail(String ownersDetail) {
        this.ownersDetail = ownersDetail;
    }

    public String getRentPerPerson() {
        return rentPerPerson;
    }

    public void setRentPerPerson(String rentPerPerson) {
        this.rentPerPerson = rentPerPerson;
    }

    public String getAdvance() {
        return advance;
    }

    public void setAdvance(String advance) {
        this.advance = advance;
    }

    @Override
    public String toString() {
        return "AccomodationBook{" + "sl=" + sl + ", noOfRooms=" + noOfRooms + ", personPerRoom=" + personPerRoom + ", gender=" + gender + ", ownersDetail=" + ownersDetail + ", rentPerPerson=" + rentPerPerson + ", advance=" + advance + '}';
    }
    
}
