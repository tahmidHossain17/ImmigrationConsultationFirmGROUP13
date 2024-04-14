/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tahmid_2220557;

import java.io.Serializable;

/**
 *
 * @author MSI
 */
public class Payroll implements Serializable {
    String employee,name;
    int tax_payroll;
    int basic;
    float hour;
    int deduction;

    public Payroll() {
    }

    public Payroll(String employee, String name, int tax_payroll, int basic, float hour, int deduction) {
        this.employee = employee;
        this.name = name;
        this.tax_payroll = tax_payroll;
        this.basic = basic;
        this.hour = hour;
        this.deduction = deduction;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTax_payroll() {
        return tax_payroll;
    }

    public void setTax_payroll(int tax_payroll) {
        this.tax_payroll = tax_payroll;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "Payroll{" + "employee=" + employee + ", name=" + name + ", tax_payroll=" + tax_payroll + ", basic=" + basic + ", hour=" + hour + ", deduction=" + deduction + '}';
    }
    
    
    public float calculate_salary(){
        
        float amount=0;
        amount=basic+(hour*100.0f);
        float cut=((deduction/100.0f)*amount)+((tax_payroll/100.0f)*amount);
        
        float total=amount-cut;
        return total;
    
    
    }
    
    
}
