/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class EligibilityToApplySceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private DatePicker dateOfBirthDatePicker;
    @FXML
    private ComboBox<String> ChooseCountryComboBox;
    @FXML
    private Label comfirmationLabel;
    @FXML
    private TextField ieltsScoreTextField;
    @FXML
    private TextField satScoreTextField;
    @FXML
    private TextField greScoreTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ChooseCountryComboBox.getItems().addAll("USA","China","Audtralia","Malaysia","Canada");
        
        
        
    }    

    @FXML
    private void checkEligibilityButtonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois = null;
        String yo = "No";
        String uni= null;
        try {
            PolicyUpdate p;
            ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

            while (true) {
                p = (PolicyUpdate) ois.readObject();
                if(ChooseCountryComboBox.getValue().equals(p.getCountry())){
                    if(Float.parseFloat(ieltsScoreTextField.getText()) >= (Integer.parseInt(p.getIelts())) || ((Float.parseFloat(satScoreTextField.getText())) >= (Integer.parseInt(p.getSat()))) || ((Float.parseFloat(greScoreTextField.getText())) >= (Integer.parseInt(p.getGre())))){
                        uni = p.getAffiliatedUni();
                        yo = "Yes";
                        break;
                
                }
               }
                
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex1) {
                    ex1.printStackTrace();
                }
            }
        }
        if(yo.equals("Yes")){
            comfirmationLabel.setText(nameTextField.getText() + "You Are Eligible to apply for this country \n" + "Here are Some University We are affiliated with! \n"+ uni);
        }
        else{
            comfirmationLabel.setText("Sorry, You Are Not Eligible to apply for this country");

        }
        
    }
    
}
