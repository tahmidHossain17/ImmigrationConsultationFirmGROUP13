/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_06_ComplainITController implements Initializable {

    @FXML
    private TextField Consultantnametextfield;
    @FXML
    private ComboBox<String> complaintypecombobox;
    @FXML
    private TextField detailtextfield;
    @FXML
    private TextField dateofbirthtextfield;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        complaintypecombobox.getItems().addAll(
                "Legalmatter", "client service", "emergency", "special","outcome disputs");
        
    }    

    @FXML
    private void sendbuttononclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }

    @FXML
    private void downloadbuttononclick(ActionEvent event) {
    }
    
}
