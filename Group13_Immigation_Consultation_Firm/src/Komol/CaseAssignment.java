
package Komol;

import java.io.*;
import java.time.LocalDate;

public class CaseAssignment implements Serializable {
    private String clientName;
    private String contactInfo;
    private String caseCategories;
    private String Legaladvisor;
    private LocalDate AssignDate;

    public CaseAssignment(String clientName, String contactInfo, String caseCategories, String Legaladvisor, LocalDate AssignDate) {
        this.clientName = clientName;
        this.contactInfo = contactInfo;
        this.caseCategories = caseCategories;
        this.Legaladvisor = Legaladvisor;
        this.AssignDate = AssignDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCaseCategories() {
        return caseCategories;
    }

    public void setCaseCategories(String caseCategories) {
        this.caseCategories = caseCategories;
    }

    public String getLegaladvisor() {
        return Legaladvisor;
    }

    public void setLegaladvisor(String Legaladvisor) {
        this.Legaladvisor = Legaladvisor;
    }

    public LocalDate getAssignDate() {
        return AssignDate;
    }

    public void setAssignDate(LocalDate AssignDate) {
        this.AssignDate = AssignDate;
    }

    @Override
    public String toString() {
        return "CaseAssignment{" + "clientName=" + clientName + ", contactInfo=" + contactInfo + ", caseCategories=" + caseCategories + ", Legaladvisor=" + Legaladvisor + ", AssignDate=" + AssignDate + '}';
    }

    String getCaseType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
