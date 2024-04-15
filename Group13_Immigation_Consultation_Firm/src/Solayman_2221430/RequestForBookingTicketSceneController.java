/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class RequestForBookingTicketSceneController implements Initializable {

    @FXML
    private ComboBox<String> selectedCountryComboBox;
    @FXML
    private DatePicker selectDateDatePicker;
    @FXML
    private TableView<AvaiableFlight> availableFlightsTableView;
    @FXML
    private TableColumn<AvaiableFlight, String> countryColumn;
    @FXML
    private TableColumn<AvaiableFlight, String> availableFlightsColumn;
    @FXML
    private TableColumn<AvaiableFlight, Integer> costPerFlightColumn;

    ArrayList<AvaiableFlight> flightList;
//    ArrayList<TicketRequest> requestList;
    @FXML
    private ComboBox<Integer> selectedQuantityComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField passportNoTextField;
    @FXML
    private ComboBox<String> selectedFlightComboBox;
    
    ArrayList<AvaiableFlight> tableList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        flightList = new ArrayList();
        tableList = new ArrayList();
        
        flightList.add(new AvaiableFlight("USA", "Boeing 737", 100000));
        flightList.add(new AvaiableFlight("China", "Airbus A380", 150000));
        flightList.add(new AvaiableFlight("Malaysia", "Boeing 747", 90000));
        flightList.add(new AvaiableFlight("Canada", "Airbus A380", 120000));
        flightList.add(new AvaiableFlight("Australia", "Boeing 737", 145000));

        flightList.add(new AvaiableFlight("USA", "Boeing 747", 100000));
        flightList.add(new AvaiableFlight("China", "Boeing 747", 150000));
        flightList.add(new AvaiableFlight("Malaysia", "Airbus A380", 90000));
        flightList.add(new AvaiableFlight("Canada", "Boeing 737", 120000));
        flightList.add(new AvaiableFlight("Australia", "Airbus A380", 145000));

        flightList.add(new AvaiableFlight("USA", "Airbus A380", 100000));
        flightList.add(new AvaiableFlight("China", "Boeing 787", 150000));
        flightList.add(new AvaiableFlight("Malaysia", "Boeing 787", 90000));
        flightList.add(new AvaiableFlight("Canada", "Boeing 787", 120000));
        flightList.add(new AvaiableFlight("Australia", "Boeing 787", 145000));

      
        selectedCountryComboBox.getItems().addAll("USA", "China", "Canada", "Malaysia", "Australia");
        selectedQuantityComboBox.getItems().addAll(1, 2, 3, 4);
        selectedFlightComboBox.getItems().addAll("Boeing 737", "Airbus A380", "Boeing 747", "Boeing 787","All");

        countryColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, String>("country"));
        availableFlightsColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, String>("availableFlightsName"));
        costPerFlightColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, Integer>("costPerFlight"));

        try {
            FileOutputStream fos = new FileOutputStream("AvailableFlights.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (AvaiableFlight f : flightList) {
                oos.writeObject(f);
            }
            oos.close();
        } catch (Exception e) {
        }   
            
    }    

    @FXML
    private void viewAvailableFlightsButtonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            AvaiableFlight f;
            //FileInputStream fis = new FileInputStream("studObjects.bin");
            //ois = new ObjectInputStream(fis);
            ois = new ObjectInputStream(new FileInputStream("AvailableFlights.bin"));
            
            availableFlightsTableView.getItems().clear();
            tableList.clear();

            while (true) {
                f = (AvaiableFlight) ois.readObject();
                f.toString();
                
                availableFlightsTableView.getItems().add(f);
                tableList.add(f);

//                availableFlightsTableView.getItems().add(f);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            //
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex1) {
            }
        }
    }

    @FXML
    private void requestForBookingButtonOnMouseClick(ActionEvent event) {
       
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("TicketBookingRequest.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            ClientTicket c= new ClientTicket(nameTextField.getText(),passportNoTextField.getText(),selectedFlightComboBox.getValue(),selectedCountryComboBox.getValue(),selectDateDatePicker.getValue());

            oos.writeObject(c);

            

        } catch (IOException ex) {
            Logger.getLogger(AddContactsSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(AddContactsSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }

    @FXML
    private void previousBookingConfirmationButtonOnMouseClick(ActionEvent event) {
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
    private void filterButtonOnMouseClick(ActionEvent event) {
         availableFlightsTableView.getItems().clear();
        for(AvaiableFlight s:tableList){
            if(selectedCountryComboBox.getValue().equals(s.getCountry()) && selectedFlightComboBox.getValue().equals(s.getAvailableFlightsName())){
                
                availableFlightsTableView.getItems().add(s);
        
         
            
        }
        }
    }
    
}
