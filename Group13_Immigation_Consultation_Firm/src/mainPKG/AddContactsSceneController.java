/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
 * @author diyan
 */
public class AddContactsSceneController implements Initializable {

    @FXML
    private ComboBox<?> countryComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField professionTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addMoreButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) {
    }
    
}
