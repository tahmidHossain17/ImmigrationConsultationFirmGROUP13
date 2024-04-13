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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class FixAppointmentSceneController implements Initializable {

    @FXML
    private ComboBox<?> reasonForApplyingComboBox;
    @FXML
    private DatePicker preferedDateDatePicker;
    @FXML
    private TableView<?> consultingRoutineTableView;
    @FXML
    private TableColumn<?, ?> clientNameColumn;
    @FXML
    private TableColumn<?, ?> dateColumn;
    @FXML
    private TableColumn<?, ?> consultantNameColumn;
    @FXML
    private TableColumn<?, ?> availableTimeColumn;
    @FXML
    private TableColumn<?, ?> paymentColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDashboardButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("ClientDashBoardMainScene.fxml"));
        Scene dashboardScene = new Scene(node);
        
        
        Stage mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        mainStage.setScene(dashboardScene);
        mainStage.show();
        
        
    }

    @FXML
    private void confirmButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void generatePaySlipButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void availableTimeSlotButtonOnMouseClick(ActionEvent event) {
    }
    
}
