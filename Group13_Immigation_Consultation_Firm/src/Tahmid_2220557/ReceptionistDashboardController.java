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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class ReceptionistDashboardController implements Initializable {
    Stage stg;    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    





    @FXML
    private void logoutbuttononclick(ActionEvent event) throws IOException {
       
        Parent parent=FXMLLoader.load(getClass().getResource("/mainPKG/Login.fxml"));
        
        Scene scn=new Scene(parent);
        
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg.setScene(scn);
        stg.show();
        
        
        
        

            
    }

    @FXML
    private void requestForAllowanceOnMouseClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("R_AllowanceRequest.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void clientProfileViewOnMouseClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Solayman_2221430/EditProfileDetailsScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    private void fillupClientProfileOnMouseClick(ActionEvent event) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Balancesheet.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

//    private void appointmentScheduleRecordOnMouseClick(ActionEvent event)throws IOException {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FixAppointment.fxml"));
//        Parent parent = fxmlLoader.load();
//
//    
//        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
//        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);
//
//        Stage stage = new Stage();
//  
//        stage.setScene(new Scene(parent, prefWidth, prefHeight));
//        stage.show();
//    }

    @FXML
    private void generatePaySlipOnMouseClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("R_PayslipofClient.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void CheckEligibilityOnMouseClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Solayman_2221430/EligibilityToApplyScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
    }

    @FXML
    private void attendenceAndHoursOnMouseClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("R_AttendenceAndHours.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
        
    }

    @FXML
    private void TermsAndPolicyOnMouseClick(ActionEvent event) throws IOException {
              FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TermsAndPolicy.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
    }

    @FXML
    private void appointmentRecordOnMouseClick(ActionEvent event) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AppointmentRecord.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
  
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void fixAppointmentOnMouseClick(ActionEvent event) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FixAppointment.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
  
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    
}
