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
public class PolicyUpdateSceneController implements Initializable {

    @FXML
    private TextField affiliatedUniTextField;
    @FXML
    private TextField affiliatedOrgTextField;
    @FXML
    private TextField touristPlacesTextField;
    @FXML
    private ComboBox<?> ieltsComboBox;
    @FXML
    private ComboBox<?> countryComboBox;
    @FXML
    private ComboBox<?> satComboBox;
    @FXML
    private ComboBox<?> greComboBox;
    @FXML
    private ComboBox<?> languageIssueComboBox;
    @FXML
    private ComboBox<?> spouseVisaRateComboBox;
    @FXML
    private ComboBox<?> minimumEducationComboBox;
    @FXML
    private TextField skillsTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backToDashboardOnMouseClick(ActionEvent event) {
    }
    
}
