/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class EditAccomodationUpdatesSceneController implements Initializable {

    @FXML
    private ComboBox<?> countryComboBox;
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
    private ComboBox<?> noOfRoomsComboBox;
    @FXML
    private ComboBox<?> personPerRoomComboBox;
    @FXML
    private TextField advanceTextField;
    @FXML
    private TextField perPersonRentTextField;
    @FXML
    private Button addInformationButton;
    @FXML
    private Button generatePdfButton;
    @FXML
    private CheckBox onlyForCouplesCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
