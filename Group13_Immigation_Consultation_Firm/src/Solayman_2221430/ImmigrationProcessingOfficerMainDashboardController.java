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
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ImmigrationProcessingOfficerMainDashboardController implements Initializable {

    @FXML
    private BorderPane borderpane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
                Parent parent = FXMLLoader.load(getClass().getResource("ImmigrationProcessingOfficerDashboardScene.fxml"));
                borderpane.setCenter(parent);    
            } catch (IOException ex) {
//                Logger.getLogger(User_05_MainDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }
    
       
        
    }    

    @FXML
    private void openUpdatePolicySceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("PolicyUpdateScene.fxml"));
        borderpane.setCenter(parent);
        
    }

    @FXML
    private void openVerifyDocumentOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("VerifyDoocumentScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openClientTicketProcessingScene(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("ClientTicketProcessing.fxml"));
        borderpane.setCenter(parent);
    }

    
// Baki
    
    @FXML
    private void openAllowanceRequestScene(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("PolicyUpdateScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openViewContactsScene(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("ViewContactsScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openEditAccomodationUpdatesOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("EditAccomodationUpdatesScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openSendUpdatesToManagingDirectorScene(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("SendUpdateToManagingDirectorScene.fxml"));
        borderpane.setCenter(parent);
    }


// baki
    @FXML
    private void openTermsAndPolicySceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("PolicyUpdateScene.fxml"));
        borderpane.setCenter(parent);
    }
    
}
