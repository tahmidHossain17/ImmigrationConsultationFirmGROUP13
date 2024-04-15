/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tahmid_2220557;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author MSI
 */
public class DummyPayment implements Serializable{
    float due;
    String name,phone;
    int amount,recievedAmount,discount;
     LocalDate date;

    public DummyPayment() {
    }

    public DummyPayment(float due, String name, String phone, int amount, int recievedAmount, int discount, LocalDate date) {
        this.due = due;
        this.name = name;
        this.phone = phone;
        this.amount = amount;
        this.recievedAmount = recievedAmount;
        this.discount = discount;
        this.date = date;
    }


    

    public float getDue() {
        return due;
    }

    public void setDue(float due) {
        this.due = due;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRecievedAmount() {
        return recievedAmount;
    }

    public void setRecievedAmount(int recievedAmount) {
        this.recievedAmount = recievedAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DummyPayment{" + "due=" + due + ", name=" + name + ", phone=" + phone + ", amount=" + amount + ", recievedAmount=" + recievedAmount + ", discount=" + discount + ", date=" + date + '}';
    }

   
    

    
    
}
