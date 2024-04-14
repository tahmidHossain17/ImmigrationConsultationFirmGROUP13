/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class VerifyDoocumentSceneController implements Initializable {

    @FXML
    private TextField enterPassportNoTextField;
    @FXML
    private Label passportNoLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label dobLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private Label nationalityLabel;

    ArrayList<Document> docList;
    @FXML
    private Label notMatchesLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        docList = new ArrayList();

        docList.add(new Document("12345678A", "Solayman", "Male", "Bangladeshi", "20-08-2001"));
        docList.add(new Document("21345678A", "Tahmid", "Male", "Bangladeshi", "17-07-2001"));
        docList.add(new Document("23145678A", "Hasan", "Male", "Bangladeshi", "13-01-2002"));
        docList.add(new Document("23415678A", "Rayhan", "Male", "Bangladeshi", "20-09-2001"));
        docList.add(new Document("23451678B", "Maimuna", "Female", "Bangladeshi", "14-05-2001"));
        docList.add(new Document("23456178B", "Neha", "Female", "Bangladeshi", "02-08-2001"));
        docList.add(new Document("23456718C", "Anonna", "Female", "Bangladeshi", "02-08-2001"));
        docList.add(new Document("23456781D", "Liam", "Male", "Bangladeshi", "20-02-2000"));
        docList.add(new Document("31245678A", "Anton", "Male", "Bangladeshi", "20-08-1999"));
        docList.add(new Document("34125678X", "Faria", "Female", "Bangladeshi", "01-11-2001"));
        docList.add(new Document("34512678L", "Kashfi", "Femle", "Bangladeshi", "20-12-2000"));
        docList.add(new Document("34561278Z", "Mekat", "Male", "Bangladeshi", "20-04-2001"));
        docList.add(new Document("None", "None", "None", "None", "None"));
        
        try {
            FileOutputStream fos = new FileOutputStream("DoccumentVerification.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Document d : docList) {
                oos.writeObject(d);
            }
            oos.close();
        } catch (Exception e) {
            //SHOW e.toString() IN AN ALERT
        }

    }

    @FXML
    private void viewDetailsButtonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            Document d;
            ois = new ObjectInputStream(new FileInputStream("DoccumentVerification.bin"));

            while (true) {
                d = (Document) ois.readObject();
                System.out.println(d.toString());

                if (d.getPassportNo().equals(enterPassportNoTextField.getText())) {
                    passportNoLabel.setText(d.getPassportNo());
                    nameLabel.setText(d.getName());
                    dobLabel.setText(d.getDob());
                    nationalityLabel.setText(d.getNationality());
                    genderLabel.setText(d.getGender());

                }
                if(d.getPassportNo().equals("None")){
                    notMatchesLabel.setText("Document Not Found ");

                
                }

            }
            

        } catch (RuntimeException e) {
            e.printStackTrace();
            

        } catch (Exception ex) {
            try {
                if (ois != null) {
//                    notMatchesLabel.setText(null);
//                    notMatchesLabel.setText("Document Not Found ");
                    ois.close();
                }
            } catch (IOException ex1) {
            }
//        }catch(Exception ex){
//            ois.close();
//            notMatchesLabel.setText("Document Not Found");
//        }
        }

    }
}
