/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosanto2010271;

import java.io.Serializable;

/**
 *
 * @author prosh
 */
public class TermsAndCondition implements Serializable{
    
    public String termsAndConditionNumber;
    public String termsAndCondition;

    public TermsAndCondition(String termsAndConditionNumber, String termsAndCondition) {
        this.termsAndConditionNumber = termsAndConditionNumber;
        this.termsAndCondition = termsAndCondition;
    }

    public String getTermsAndConditionNumber() {
        return termsAndConditionNumber;
    }

    public void setTermsAndConditionNumber(String termsAndConditionNumber) {
        this.termsAndConditionNumber = termsAndConditionNumber;
    }

    public String getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

    @Override
    public String toString() {
        return "TermsAndCondition{" + "termsAndConditionNumber=" + termsAndConditionNumber + ", termsAndCondition=" + termsAndCondition + '}';
    }
    
    

    

    
}
