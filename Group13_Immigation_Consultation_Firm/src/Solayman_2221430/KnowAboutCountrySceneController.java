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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
        languageHelpColumn.setCellValueFactory(new PropertyValueFactory<CountryInfo, String>("languageHelp"));
        extraSkillsColumn.setCellValueFactory(new PropertyValueFactory<CountryInfo, String>("extraSkills"));
        spouseVisaColumn.setCellValueFactory(new PropertyValueFactory<CountryInfo, String>("spouseVisaPossibility"));
        
        

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
                PolicyUpdate r;
                ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

                
//                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (PolicyUpdate) ois.readObject();
                    r.toString();
                    
                    if(r.getCountry().equals("USA")){
                        extraInfoTableView.getItems().add(new CountryInfo(r.getLanguageIssue(),r.getSkills(),r.getSpouse()));
                        affiliatedUniversityLabel.setText(r.getAffiliatedUni());
                        affilliatedOrganizationsLabel.setText(r.getAffiliatedOrg());
                        touristPlacesTovisitLabel.setText(r.getTouristPlaces());
                    }
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
        if (countryStage.getTitle().equals("Know About Canada")) {
            countryNameLabel.setText("Canada");
            ObjectInputStream ois = null;
            try {
                PolicyUpdate r;
                ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

                
                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (PolicyUpdate) ois.readObject();
                    r.toString();
                    if(r.getCountry().equals("Canada")){
                        extraInfoTableView.getItems().add(new CountryInfo(r.getLanguageIssue(),r.getSkills(),r.getSpouse()));
                        affiliatedUniversityLabel.setText(r.getAffiliatedUni());
                        affilliatedOrganizationsLabel.setText(r.getAffiliatedOrg());
                        touristPlacesTovisitLabel.setText(r.getTouristPlaces());
                    }
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
        if (countryStage.getTitle().equals("Know About Australia")) {
            countryNameLabel.setText("Australia");
            ObjectInputStream ois = null;
            try {
                PolicyUpdate r;
                ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

                
                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (PolicyUpdate) ois.readObject();
                    r.toString();
                    if(r.getCountry().equals("Australia")){
                        affiliatedUniversityLabel.setText(r.getAffiliatedUni());
                        affilliatedOrganizationsLabel.setText(r.getAffiliatedOrg());
                        touristPlacesTovisitLabel.setText(r.getTouristPlaces());
                        extraInfoTableView.getItems().add(new CountryInfo(r.getLanguageIssue(),r.getSkills(),r.getSpouse()));
                    }
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
        if (countryStage.getTitle().equals("Know About Malaysia")) {
            countryNameLabel.setText("Malaysia");
            ObjectInputStream ois = null;
            try {
                PolicyUpdate r;
                ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

                
                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (PolicyUpdate) ois.readObject();
                    r.toString();
                    if(r.getCountry().equals("Malaysia")){
                        affiliatedUniversityLabel.setText(r.getAffiliatedUni());
                        affilliatedOrganizationsLabel.setText(r.getAffiliatedOrg());
                        touristPlacesTovisitLabel.setText(r.getTouristPlaces());
                        extraInfoTableView.getItems().add(new CountryInfo(r.getLanguageIssue(),r.getSkills(),r.getSpouse()));
                    }
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
        if (countryStage.getTitle().equals("Know About China")) {
            countryNameLabel.setText("China");
            ObjectInputStream ois = null;
            try {
                PolicyUpdate r;
                ois = new ObjectInputStream(new FileInputStream("PolicyUpdatesFromImmigrationOfficer.bin"));

                
                extraInfoTableView.getItems().clear();

                while (true) {
                    r = (PolicyUpdate) ois.readObject();
                    r.toString();
                    if(r.getCountry().equals("China")){
                        affiliatedUniversityLabel.setText(r.getAffiliatedUni());
                        affilliatedOrganizationsLabel.setText(r.getAffiliatedOrg());
                        touristPlacesTovisitLabel.setText(r.getTouristPlaces());
                        extraInfoTableView.getItems().add(new CountryInfo(r.getLanguageIssue(),r.getSkills(),r.getSpouse()));
                    }
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
