
package Tahmid_2220557;

import java.io.Serializable;





public class Opex implements Serializable {
    String month,expenseType;
    int amnt;

    public Opex() {
    }

    public Opex(String month, String expenseType, int amnt) {
        this.month = month;
        this.expenseType = expenseType;
        this.amnt = amnt;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public int getAmnt() {
        return amnt;
    }

    public void setAmnt(int amnt) {
        this.amnt = amnt;
    }

    @Override
    public String toString() {
        return "Opex{" + "month=" + month + ", expenseType=" + expenseType + ", amnt=" + amnt + '}';
    }
//    public int totalExpense(){
//        
//        int sum=0;
//        
//        
//    }
    
}
