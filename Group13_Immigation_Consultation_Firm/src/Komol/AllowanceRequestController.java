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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class AllowanceRequestController implements Initializable {

    @FXML
    private TextField Employeenametextfield;
    @FXML
    private TextField employeenumbertextfield;
    @FXML
    private ComboBox<?> designationcombobox;
    @FXML
    private TextField expancedetailstextfield;
    @FXML
    private TextField expenseamounttextfield;
    @FXML
    private DatePicker datepicker;
    @FXML
    private RadioButton bankaccountradiobutton;
    @FXML
    private RadioButton checkradiobutton;
    @FXML
    private RadioButton mobilebankingradiobutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void downloadreceiptonclick(ActionEvent event) {
    }

    @FXML
    private void submitrequestonclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
