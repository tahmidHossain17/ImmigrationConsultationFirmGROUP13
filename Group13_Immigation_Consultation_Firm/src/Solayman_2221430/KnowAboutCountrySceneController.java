/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

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
    private TableView<CountryInfo> extraInfoTableView;
    @FXML
    private TableColumn<CountryInfo, String> languageHelpColumn;
    @FXML
    private Label touristPlacesTovisitLabel;
    @FXML
    private TableColumn<CountryInfo, String> spouseVisaColumn;
    @FXML
    private TableColumn<CountryInfo, String> extraSkillsColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void backToDashboardButtonOnMouseClick(ActionEvent event) {

    }

    @FXML
    private void clickToLoadInformationsButtonOnMouseClick(ActionEvent event) {
        Stage countryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (countryStage.getTitle().equals("Know About USA")) {
            countryNameLabel.setText("USA");
            ObjectInputStream ois = null;
            try {
                Review r;
                ois = new ObjectInputStream(new FileInputStream("Reviews.bin"));

                
                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (Review) ois.readObject();
                    extraInfoTableView.getItems().add(new CountryInfo());
                }
            } catch (EOFException e) {
                // Reached end of file
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (ois != null) {
                    try {
                        ois.close();
                    } catch (IOException ex1) {
                        ex1.printStackTrace();
                    }
                }
            }

        }
    }

}
