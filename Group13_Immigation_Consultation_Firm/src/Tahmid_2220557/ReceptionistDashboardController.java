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
import javafx.scene.Scene;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class ReceptionistDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clientPaymentStatusOnClick(ActionEvent event) {
    }

    @FXML
    private void generateIncomeStatement(ActionEvent event) {
    }

    @FXML
    private void generateBalancesheet(ActionEvent event) {
    }

    @FXML
    private void payrollprocessing(ActionEvent event) {
    }

    @FXML
    private void allowanceRequestOnClick(ActionEvent event) {
    }

    @FXML
    private void opExOnClick(ActionEvent event) {
    }

    @FXML
    private void yearlyFinancialReportOnClick(ActionEvent event) {
    }


    @FXML
    private void logoutbuttononclick(ActionEvent event) {
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

    
}
