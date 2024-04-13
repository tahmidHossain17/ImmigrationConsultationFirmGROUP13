
package Tahmid_2220557;

import java.io.Serializable;


public class AllowanceRequest implements Serializable {
    String Name,allowanceType,designantion,paymentMethod;
    int amount;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(String allowanceType) {
        this.allowanceType = allowanceType;
    }

    public String getDesignantion() {
        return designantion;
    }

    public void setDesignantion(String designantion) {
        this.designantion = designantion;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public AllowanceRequest(String Name, String allowanceType, String designantion, String paymentMethod, int amount) {
        this.Name = Name;
        this.allowanceType = allowanceType;
        this.designantion = designantion;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public AllowanceRequest() {
        
    }

    @Override
    public String toString() {
        return "AllowanceRequest{" + "Name=" + Name + ", allowanceType=" + allowanceType + ", designantion=" + designantion + ", paymentMethod=" + paymentMethod + ", amount=" + amount + '}';
    }
    
    
    
}
