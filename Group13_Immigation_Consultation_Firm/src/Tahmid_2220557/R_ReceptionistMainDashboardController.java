/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

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
 * @author MSI
 */
public class R_ReceptionistMainDashboardController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            Parent scene = FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
            borderPane.setCenter(scene);
        }
        catch(Exception E){}
    }    

    @FXML
    private void clientProfileViewOnMouseClick(ActionEvent event) throws IOException {
         Parent clientProfileScene = FXMLLoader.load(getClass().getResource("ClientPaymentStatus.fxml"));
        borderPane.setCenter(clientProfileScene);
    }

    @FXML
    private void fillupClientProfileOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void appointmentScheduleRecordOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void generatePaySlipOnMouseClick(ActionEvent event) throws IOException {
         Parent payslipScene = FXMLLoader.load(getClass().getResource("R_PayslipofClient.fxml"));
        borderPane.setCenter(payslipScene);
    }

    @FXML
    private void CheckEligibilityOnMouseClick(ActionEvent event) throws IOException {
        Parent eligibleScene = FXMLLoader.load(getClass().getResource("R_EligibilityCheck(Receptionist).fxml"));
        borderPane.setCenter(eligibleScene);
    }

    @FXML
    private void attendenceAndHoursOnMouseClick(ActionEvent event) throws IOException {
        Parent eligibleScene = FXMLLoader.load(getClass().getResource("R_AttendenceAndHours(receptionist).fxml"));
        borderPane.setCenter(eligibleScene);
    }

    @FXML
    private void TermsAndPolicyOnMouseClick(ActionEvent event) throws IOException {
          Parent terms= FXMLLoader.load(getClass().getResource("TermsAndPolicy.fxml"));
          borderPane.setCenter(terms);
    }

    @FXML
    private void requestForAllowanceOnMouseClick(ActionEvent event) throws IOException {
          Parent request= FXMLLoader.load(getClass().getResource("R_AllowanceRequest.fxml"));
          borderPane.setCenter(request);
    }
    
}
