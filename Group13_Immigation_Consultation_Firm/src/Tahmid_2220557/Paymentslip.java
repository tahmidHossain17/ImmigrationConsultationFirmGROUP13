
package Tahmid_2220557;

import java.io.Serializable;
import java.time.LocalDate;

public class Paymentslip implements Serializable {
    String name,phone;
    int amount,recievedAmount,discount;
  
    LocalDate date;

    public Paymentslip() {
    }

    public Paymentslip(String name, String phone, int amount, int recievedAmount, int discount, LocalDate date) {
        this.name = name;
        this.phone = phone;
        this.amount = amount;
        this.recievedAmount = recievedAmount;
        this.discount = discount;
        this.date = date;
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
        return "Paymentslip{" + "name=" + name + ", phone=" + phone + ", amount=" + amount + ", recievedAmount=" + recievedAmount + ", discount=" + discount + "date=" + date + '}';
    }
    
    
    public float getDueAmount(){
        
        float sum;
        
        sum=amount-recievedAmount;
        
        float total= sum-(sum*(discount/100.0f));
        
        return total;
    
    }
    
}
