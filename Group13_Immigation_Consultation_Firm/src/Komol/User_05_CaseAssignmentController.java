/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_05_CaseAssignmentController implements Initializable {

    @FXML
    private TextField clientnametextfield;
    @FXML
    private TextField clientnumbertextfield;
    @FXML
    private ComboBox<String> casecategoriesdatepicker;
    @FXML
    private ComboBox<String> legaladvisorcombobox;
    @FXML
    private DatePicker assigndatedatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        casecategoriesdatepicker.getItems().addAll(
                "random", "government", "emergency", "special","student");
        legaladvisorcombobox.getItems().addAll(
                "joy", "komol", "dip", "tahmid");
    }    
        
    @FXML
    private void assignmentcaseonclick(ActionEvent event) {
        String name=clientnametextfield.getText();
        String number=clientnumbertextfield.getText();
        LocalDate date=assigndatedatepicker.getValue();
        
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
