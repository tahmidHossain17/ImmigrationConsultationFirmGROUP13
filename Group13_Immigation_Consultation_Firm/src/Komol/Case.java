
package Komol;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;


public class Case implements Serializable{
    private String clientName;
    private String clientNumber;
    private String Categoriesoncolumn;
    private String advisornameoncolumn;
    private LocalDate dateoncolumn;

    public Case(String clientName, String clientNumber, String Categoriesoncolumn, String advisornameoncolumn, LocalDate dateoncolumn) {
        this.clientName = clientName;
        this.clientNumber = clientNumber;
        this.Categoriesoncolumn = Categoriesoncolumn;
        this.advisornameoncolumn = advisornameoncolumn;
        this.dateoncolumn = dateoncolumn;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getCategoriesoncolumn() {
        return Categoriesoncolumn;
    }

    public void setCategoriesoncolumn(String Categoriesoncolumn) {
        this.Categoriesoncolumn = Categoriesoncolumn;
    }

    public String getAdvisornameoncolumn() {
        return advisornameoncolumn;
    }

    public void setAdvisornameoncolumn(String advisornameoncolumn) {
        this.advisornameoncolumn = advisornameoncolumn;
    }

    public LocalDate getDateoncolumn() {
        return dateoncolumn;
    }

    public void setDateoncolumn(LocalDate dateoncolumn) {
        this.dateoncolumn = dateoncolumn;
    }

    @Override
    public String toString() {
        return "Case{" + "clientName=" + clientName + ", clientNumber=" + clientNumber + ", Categoriesoncolumn=" + Categoriesoncolumn + ", advisornameoncolumn=" + advisornameoncolumn + ", dateoncolumn=" + dateoncolumn + '}';
    }



   
 

}