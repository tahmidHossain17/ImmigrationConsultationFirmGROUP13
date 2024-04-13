/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komol;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Komol
 */
public class Case implements Serializable{
    private String clientName;
    private String clientNumber;
    private String caseCategory;
    private String legalAdvisor;
    private LocalDate assignDate;

    public Case(String clientName, String clientNumber, String caseCategory, String legalAdvisor, LocalDate assignDate) {
        this.clientName = clientName;
        this.clientNumber = clientNumber;
        this.caseCategory = caseCategory;
        this.legalAdvisor = legalAdvisor;
        this.assignDate = assignDate;
    }

    // Getters and Setters

    // Write method to serialize Case object to a binary file
    public void writeToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("Case object has been written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing Case object to file: " + e.getMessage());
        }
    }

    // Read method to deserialize Case object from a binary file
    public static Case readFromFile(String fileName) {
        Case retrievedCase = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            retrievedCase = (Case) ois.readObject();
            System.out.println("Case object has been read from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading Case object from file: " + e.getMessage());
        }
        return retrievedCase;
    }

    @Override
    public String toString() {
        return "Case{" +
                "clientName='" + clientName + '\'' +
                ", clientNumber='" + clientNumber + '\'' +
                ", caseCategory='" + caseCategory + '\'' +
                ", legalAdvisor='" + legalAdvisor + '\'' +
                ", assignDate=" + assignDate +
                '}';
    }
    
}
