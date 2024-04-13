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
public class ITOfficerController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadUi(String ui){
        Parent root;
        try { root =FXMLLoader.load(getClass().getResource(ui+".fxml"));
        borderPane.setCenter(root);
       
        }
        catch(IOException ex){
            Logger.getLogger(ITOfficerController.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    
    
    }

    @FXML
    private void profileButtonMouseOnClick(ActionEvent event) {
        loadUi("IT Officer Profile");
        
    }

    @FXML
    private void serviceHistoryButtonMouseOnClick(ActionEvent event) {
        loadUi("Service History");
    }

    @FXML
    private void securityInspectionButtonMouseOnClick(ActionEvent event) {
        loadUi("Security Insepection");
    }

    @FXML
    private void feedbackButtonMouseOnClick(ActionEvent event) {
        loadUi("Feedback & Suggestion");
    }

    @FXML
    private void allowanceButtonMouseOnClick(ActionEvent event) {
        loadUi("Allowance Request");
    }

    @FXML
    private void purchaseRequestButtonMouseOnClick(ActionEvent event) {
        loadUi("Purchase Request");
    }

    @FXML
    private void termsAndPolicyButtonMouseOnClick(ActionEvent event) {
        loadUi("Terms and Policy");
    }

    @FXML
    private void complaintButtonMouseOnClick(ActionEvent event) {
        loadUi("Complaints");
    }

    @FXML
    private void updateToMDMouseOnClick(ActionEvent event) {
        loadUi("Update To MD");
    }
    
}
