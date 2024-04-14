/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosanto2010271;

import java.time.LocalDate;

/**
 *
 * @author prosh
 */
public class Complaint {
    public String name;
    public LocalDate date;
    public int caseId ;
    public String issue;
    public boolean stats;

    public Complaint() {
    }

    public Complaint(String name, LocalDate date, int caseId, String issue, boolean stats) {
        this.name = name;
        this.date = date;
        this.caseId = caseId;
        this.issue = issue;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public boolean isStats() {
        return stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Complaint{" + "name=" + name + ", date=" + date + ", caseId=" + caseId + ", issue=" + issue + ", stats=" + stats + '}';
    }
    
    
    
    
}
