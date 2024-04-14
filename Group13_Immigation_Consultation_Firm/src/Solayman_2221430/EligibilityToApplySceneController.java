/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class EligibilityToApplySceneController implements Initializable {

    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private ComboBox<?> countryComboBox;
    @FXML
    private ComboBox<?> visaApplyingForComboBox;
    @FXML
    private ComboBox<?> ieltsComboBox;
    @FXML
    private ComboBox<?> greComboBox;
    @FXML
    private ComboBox<?> satComboBox;
    @FXML
    private ComboBox<?> educationComboBox;
    @FXML
    private ComboBox<?> skillsComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backToDashBoardOnMouseClicked(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("ClientDashBoardMainScene.fxml"));
        Scene dashboardScene = new Scene(node);
        
        
        Stage mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        mainStage.setScene(dashboardScene);
        mainStage.show();
    }
    
}