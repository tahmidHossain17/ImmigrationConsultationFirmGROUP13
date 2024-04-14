/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

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
 * @author prosh
 */
public class IT_AllowanceRequestController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<?> designationComboBox;
    @FXML
    private ComboBox<?> allowanceTypeComboBox;
    @FXML
    private TextField requestedAmountTextField;
    @FXML
    private ComboBox<?> choosePayMethodComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitRequestOnMouseClick(ActionEvent event) {
    }
    
}
