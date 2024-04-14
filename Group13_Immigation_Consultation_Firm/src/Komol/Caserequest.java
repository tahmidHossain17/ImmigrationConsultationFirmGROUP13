package Komol;

import java.io.*;

public class Caserequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String clientName;
    private String number;
    private String details;
    private String type;
    private String gender;

    public Caserequest(String clientName, String number, String details, String type, String gender) {
        this.clientName = clientName;
        this.number = number;
        this.details = details;
        this.type = type;
        this.gender = gender;
    }

    // Getters and Setters

    // Write method to serialize CaseRequest object to a binary file
    public void writeToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("CaseRequest object has been written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing CaseRequest object to file: " + e.getMessage());
        }
    }

    // Read method to deserialize CaseRequest object from a binary file
    public static Caserequest readFromFile(String fileName) {
        Caserequest retrievedCaseRequest = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            retrievedCaseRequest = (Caserequest) ois.readObject();
            System.out.println("CaseRequest object has been read from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading CaseRequest object from file: " + e.getMessage());
        }
        return retrievedCaseRequest;
    }

    @Override
    public String toString() {
        return "CaseRequest{" +
                "clientName='" + clientName + '\'' +
                ", number='" + number + '\'' +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
