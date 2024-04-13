/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class SendUpdateToManagingDirectorSceneController implements Initializable {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private ComboBox<?> monthComboBox;
    @FXML
    private TextField uniColabTextField;
    @FXML
    private TextField orgColabTextField;
    @FXML
    private TextField clientHandledTextField;
    @FXML
    private TextField clientSentTextField;
    @FXML
    private TextField clientTicketsProcessedTextField;
    @FXML
    private TextField accomodationConfirmTextField;
    @FXML
    private Button generateChartButton;
    @FXML
    private Button saveAndSendToMdButton;
    @FXML
    private Button dashboardButton;
    @FXML
    private Button generatePdfButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
