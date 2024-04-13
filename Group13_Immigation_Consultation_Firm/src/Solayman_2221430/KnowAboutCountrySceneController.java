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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class KnowAboutCountrySceneController implements Initializable {

    @FXML
    private Label countryNameLabel;
    @FXML
    private Label affiliatedUniversityLabel;
    @FXML
    private Label affilliatedOrganizationsLabel;
    @FXML
    private TableView<?> extraInfoTableView;
    @FXML
    private TableColumn<?, ?> candidateTypeColumn;
    @FXML
    private TableColumn<?, ?> languageHelpColumn;
    @FXML
    private TableColumn<?, ?> englishTestingToolsColumn;
    @FXML
    private Label touristPlacesTovisitLabel;
    @FXML
    private Button backToDashboardButton;
    @FXML
    private TableColumn<?, ?> spouseVisaColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
