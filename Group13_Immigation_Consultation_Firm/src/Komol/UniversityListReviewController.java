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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class UniversityListReviewController implements Initializable {

    @FXML
    private TextField universitynametextfield;
    @FXML
    private TextField countrynametextfield;
    @FXML
    private TextField IELTSontextfield;
    @FXML
    private TextField greTextField;
    @FXML
    private TextField Acceptanceratetextfield;
    @FXML
    private RadioButton USAradiobutton;
    @FXML
    private RadioButton Australiaradiobutton;
    @FXML
    private RadioButton ukradiobutton;
    @FXML
    private RadioButton canadaradiobutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveaspdfonclickbutton(ActionEvent event) {
    }

    @FXML
    private void logoutonclickbutton(ActionEvent event) {
    }
    
}
