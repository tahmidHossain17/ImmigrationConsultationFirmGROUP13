/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ClientTicketProcessingController implements Initializable {

    @FXML
    private TableView<?> bookingRequestsTableView;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> passportNoColumn;
    @FXML
    private TableColumn<?, ?> flightSelected;
    @FXML
    private TableColumn<?, ?> dateOfFlightColumn;
    @FXML
    private TableColumn<?, ?> countryColumn;
    @FXML
    private Button dashboardButton;
    @FXML
    private TextField tickerNumberTextField;
    @FXML
    private TextField passportNoTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void cannotBeProcessedButtonOnMouseClick(ActionEvent event) {
    }
    
}
