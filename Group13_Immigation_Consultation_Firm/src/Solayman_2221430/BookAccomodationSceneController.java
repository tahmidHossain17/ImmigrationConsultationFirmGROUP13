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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class BookAccomodationSceneController implements Initializable {

    @FXML
    private ComboBox<String> countryComboBox;
    @FXML
    private ComboBox<String> cityComboBox;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TableView<AccomodationBook> housingInfoTableView;
    @FXML
    private TableColumn<AccomodationBook, String> noOfRoomsColumn;
    @FXML
    private TableColumn<AccomodationBook, String> personPerRoomColumn;
    @FXML
    private TableColumn<AccomodationBook, String> genderColumn;
    @FXML
    private TableColumn<AccomodationBook, String> ownersDetailsColumn;
    @FXML
    private TableColumn<AccomodationBook, String> rentPerPersonColumn;
    @FXML
    private TableColumn<AccomodationBook, String> advanceColumn;
    @FXML
    private TableColumn<AccomodationBook, Integer> slNoColumn;
    @FXML
    private RadioButton showAllRadioButton;
    @FXML
    private RadioButton dormatoriesRadioButton;
    @FXML
    private RadioButton apartmentsRadioButton;

    ToggleGroup tg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        
        noOfRoomsColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, String>("noOfRooms"));
        personPerRoomColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, String>("personPerRoom"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, String>("gender"));
        ownersDetailsColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, String>("ownersDetail"));
        rentPerPersonColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, String>("rentPerPerson"));
        slNoColumn.setCellValueFactory(new PropertyValueFactory<AccomodationBook, Integer>("advance"));
        
        
        apartmentsRadioButton.setToggleGroup(tg);
        dormatoriesRadioButton.setToggleGroup(tg);
        showAllRadioButton.setToggleGroup(tg);
        
        countryComboBox.getItems().addAll("USA","China","Canada","Australia","Malaysia");
        monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        
    }    

    @FXML
    private void backToDashboardButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("ClientDashBoardMainScene.fxml"));
        Scene dashboardScene = new Scene(node);
        
        
        Stage mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        mainStage.setScene(dashboardScene);
        mainStage.show();
    }
    
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
          }
    @FXML
    private void confirmBookingButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void loadResidenceButtonOnMouseClick(ActionEvent event) {
        
        
        if((!apartmentsRadioButton.isSelected()) && (!dormatoriesRadioButton.isSelected()) && (!showAllRadioButton.isSelected()) ){
        
            showErrorAlert("SelectButton","Please Select what type of appointment do you want");
            
        }
        if(apartmentsRadioButton.isSelected()){
            
            
            ObjectInputStream ois = null;
            try {
            Accomodation a;
            housingInfoTableView.getItems().clear();
            int sl=0;
            ois = new ObjectInputStream(new FileInputStream("AccomodationInformations.bin"));

            while (true) {
                a = (Accomodation) ois.readObject();
                if(a.getAccomodationType().equals("Appartment")){
                
                    housingInfoTableView.getItems().add(new AccomodationBook((sl+1),a.getNoOfRooms(),a.getPersonPerRoom(),a.getStayers(),("Name: "+a.getOwnersName()+ "E-mail"+ a.getOwnersEmail()),a.getRentPerPerson(),a.getAdvance()));
                }
                
                }
               }
                
            
         catch (EOFException e) {
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
        if(dormatoriesRadioButton.isSelected()){
            
            
            
            ObjectInputStream ois = null;
            
            try {
            Accomodation a;
            housingInfoTableView.getItems().clear();
            int sl=0;
            ois = new ObjectInputStream(new FileInputStream("AccomodationInformations.bin"));

            while (true) {
                a = (Accomodation) ois.readObject();
                if(a.getAccomodationType().equals("Dormetory")){
                
                    housingInfoTableView.getItems().add(new AccomodationBook((sl+1),a.getNoOfRooms(),a.getPersonPerRoom(),a.getGender(),("Name: "+a.getOwnersName()+ "E-mail"+ a.getOwnersEmail()),a.getRentPerPerson(),a.getAdvance()));
                }
                
                }
               }
                
            
         catch (EOFException e) {
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
        
        if(showAllRadioButton.isSelected()){
            
            
            ObjectInputStream ois = null;
            try {
            Accomodation a;
            housingInfoTableView.getItems().clear();
            int sl=0;
            ois = new ObjectInputStream(new FileInputStream("AccomodationInformations.bin"));

            while (true) {
                a = (Accomodation) ois.readObject();
                housingInfoTableView.getItems().add(new AccomodationBook((sl+1),a.getNoOfRooms(),a.getPersonPerRoom(),a.getStayers(),("Name: "+a.getOwnersName()+ "E-mail"+ a.getOwnersEmail()),a.getRentPerPerson(),a.getAdvance()));
                
                
                }
               }
                
            
         catch (EOFException e) {
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
//        
        
        
    }

    @FXML
    private void countryComboBoxOnMouseClick(ActionEvent event) {
        
        if(countryComboBox.getValue().equals("USA")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Texas","California","Alington");
        }
        if(countryComboBox.getValue().equals("Canada")){
            cityComboBox.getItems().clear();

            cityComboBox.getItems().addAll("Toronto","Montreal","Vancouver");
        }
        if(countryComboBox.getValue().equals("China")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Shanghai","Beijing","Hong Kong");
        }
        if(countryComboBox.getValue().equals("Australia")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Sydney","Melbourne","Brisbane");
        }
        if(countryComboBox.getValue().equals("Malaysia")){
            cityComboBox.getItems().clear();
            cityComboBox.getItems().addAll("Kuala Lumpur ","George Town ","Johor Bahru");
        }
    }
    
}
