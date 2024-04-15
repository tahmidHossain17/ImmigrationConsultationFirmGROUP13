/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class EditAccomodationUpdatesSceneController implements Initializable {

    @FXML
    private ComboBox<String> countryComboBox;
    @FXML
    private RadioButton appartmentRadioButton;
    @FXML
    private RadioButton dormetoryRadioButton;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton bothRadioButton;
    @FXML
    private TextField ownersNameTextField;
    @FXML
    private TextField ownersemailTextField;
    @FXML
    private ComboBox<String> noOfRoomsComboBox;
    @FXML
    private ComboBox<String> personPerRoomComboBox;
    @FXML
    private TextField advanceTextField;
    @FXML
    private TextField perPersonRentTextField;
    @FXML
    private CheckBox onlyForCouplesCheckBox;
    @FXML
    private ComboBox<String> cityComboBox;
    
    
    Accomodation a;
    ToggleGroup tg;
    ToggleGroup tgg;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        countryComboBox.getItems().addAll("USA","China","Canada","Australia","Malaysia");
        noOfRoomsComboBox.getItems().addAll("1","2","3","4","5");
        personPerRoomComboBox.getItems().addAll("1","2","3","4");
        
        a= new Accomodation();
        tg = new ToggleGroup();
        tgg = new ToggleGroup();
        
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        bothRadioButton.setToggleGroup(tg);
        
        appartmentRadioButton.setToggleGroup(tgg);
        dormetoryRadioButton.setToggleGroup(tgg);
        
        
        
    }    

    @FXML
    private void addInformationButtonOnMouseClick(ActionEvent event) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("AccomodationInformations.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            String stayers="";
            String accomodationType="";
            String coupleOrNot="";
            
            if(maleRadioButton.isSelected()){
                stayers="Male";
            }
            else if(femaleRadioButton.isSelected()){
                stayers="Female";
            }
            else if(bothRadioButton.isSelected()){
                stayers="Both";
            }
            
            if(appartmentRadioButton.isSelected()){
                accomodationType="Appartment";
           
            }
            else  if(dormetoryRadioButton.isSelected()){
                accomodationType="Dormetory";
           
            }
            if(onlyForCouplesCheckBox.isSelected()){
                coupleOrNot="Only For Couples";
            
            }
            else{
                coupleOrNot="All";
            }
            
            
            
            
            a = new Accomodation(countryComboBox.getValue(),cityComboBox.getValue(),coupleOrNot,accomodationType,stayers,ownersNameTextField.getText(),ownersemailTextField.getText(),advanceTextField.getText(),perPersonRentTextField.getText(),noOfRoomsComboBox.getValue(),personPerRoomComboBox.getValue());
            
            
            oos.writeObject(a);
            System.out.println("Write Sucessfull");

            

        } catch (IOException ex) {
            Logger.getLogger(AddContactsSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(AddContactsSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void generatePdfButtonOnMouseClick(ActionEvent event) {
        
    }

    @FXML
    private void viewUpdatedInfoButtonOnMouseClick(ActionEvent event) {
        
    }

    @FXML
    private void countryComboBoxOnMouseClick(ActionEvent event) {
        
        if(countryComboBox.getValue().equals("USA")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Texas","California","Alington");
        }
        if(countryComboBox.getValue().equals("Canada")){
            cityComboBox.getItems().clear();

            cityComboBox.getItems().addAll("Toronto","Montreal","Vancouver");
        }
        if(countryComboBox.getValue().equals("China")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Shanghai","Beijing","Hong Kong");
        }
        if(countryComboBox.getValue().equals("Australia")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Sydney","Melbourne","Brisbane");
        }
        if(countryComboBox.getValue().equals("Malaysia")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Kuala Lumpur ","George Town ","Johor Bahru");
        }
       

        
    }
    
}
