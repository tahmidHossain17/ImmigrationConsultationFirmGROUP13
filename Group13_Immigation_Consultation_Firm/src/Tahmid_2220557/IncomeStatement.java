
package Tahmid_2220557;


public class IncomeStatement {
    
    String month;
    int  revenue,tax,expense;

    public IncomeStatement() {
    }

    public IncomeStatement(String month, int revenue, int tax, int expense) {
        this.month = month;
        this.revenue = revenue;
        this.tax = tax;
        this.expense = expense;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }
    
    
    public  float getIncomeBeforeTax() {
        
        float income=revenue-expense;
        return income;
    



}
    
    public float getIncomeAfterTax(){
        
        float incm=revenue-expense;
        
        float after=incm-(incm*(tax/100.0f));
        
        return after;
    
    
    
    }
    
}
