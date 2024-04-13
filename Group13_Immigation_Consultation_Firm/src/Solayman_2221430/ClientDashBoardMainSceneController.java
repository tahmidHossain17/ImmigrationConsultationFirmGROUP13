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
public class ClientDashBoardMainSceneController implements Initializable {

    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
                Parent parent = FXMLLoader.load(getClass().getResource("ClientDashBoard.fxml"));
                borderpane.setCenter(parent);    
            } catch (IOException ex) {
//                Logger.getLogger(User_05_MainDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    

    @FXML
    private void openFixAppointmentSceneOnMouseClick(ActionEvent event)throws IOException {
        
        Parent parent= FXMLLoader.load(getClass().getResource("FixAppointmentScene.fxml"));
        borderpane.setCenter(parent);
        
    }

    @FXML
    private void openEligibilityToApplySceneOnMouseClick(ActionEvent event)throws IOException {
        
        Parent parent= FXMLLoader.load(getClass().getResource("EligibilityToApplyScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openBookAccomodationSceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("BookAccomodationScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openRequestForBookingATicketSceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("RequestForBookingTicketScene.fxml"));
        borderpane.setCenter(parent);
        
    }

    @FXML
    private void openKnowAboutYourDestinationSceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("KnowABoutYourDestinationScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openReviewsSceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("ReviewsScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void openApplyForBankSolvencySceneOnMouseClick(ActionEvent event)throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("ApplyForBankSolvencyScene.fxml"));
        borderpane.setCenter(parent);
    }

    @FXML
    private void closeWindowOnMouseClick(ActionEvent event) {
    }
    
}
