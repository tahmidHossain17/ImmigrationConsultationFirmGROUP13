/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class ManagingDirectorController implements Initializable {

    @FXML
    private BorderPane mdBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
        
    private void loadUi(String ui){
     Parent root;
     try { root =FXMLLoader.load(getClass().getResource(ui+".fxml"));
            mdBorderPane.setCenter(root);
        }
     catch(IOException ex){
            Logger.getLogger(ITOfficerController.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    
    }
      
    

    @FXML
    private void profileButtonOnMouseClick(ActionEvent event) {
        loadUi("Managing Director Profile");

    }

    @FXML
    private void employeeInsightButtonOnMouseClick(ActionEvent event) {
        loadUi("Employee Insight");
    }

    @FXML
    private void clientsStatisticsButtonOnMouseClick(ActionEvent event) {
        loadUi("clients statistics");
    }

    @FXML
    private void revenueStatisticsButtonOnMouseClick(ActionEvent event) {
            loadUi("Revenue Statistics");
    }

    @FXML
    private void feedbackButtonOnMouseClick(ActionEvent event) {
        loadUi("Feedback & Suggestion_1");
    }

    @FXML
    private void purchaseButtonOnMouseClick(ActionEvent event) {
        loadUi("Purchase Approval");
    }

    @FXML
    private void allowanceButtonOnMouseClick(ActionEvent event) {
        loadUi("Allowance approval");
    }

    @FXML
    private void reportButtonOnMouseClick(ActionEvent event) {
        loadUi("View Report");
        
    }

    private void appointmentButtonOnMouseClick(ActionEvent event) {
        loadUi("Appointment schedule");
    }

    @FXML
    private void termsAndPolicyButtonOnMouseClick(ActionEvent event) {
        loadUi("MD_Terms and Policy");
    }
    
}
