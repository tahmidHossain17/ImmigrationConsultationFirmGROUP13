/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        flightList= new ArrayList();
//        requestList= new ArrayList();
        
        flightList.add(new AvaiableFlight("USA","Boeing 707",100000));
        flightList.add(new AvaiableFlight("China","Airbus",150000));
        flightList.add(new AvaiableFlight("Malaysia","Boeing 707",90000));
        flightList.add(new AvaiableFlight("Canada","Boeing 707",120000));
        flightList.add(new AvaiableFlight("Australia","Boeing 787",145000));
        
        countryColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, String>("country"));
        availableFlightsColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, String>("availableFlightsName"));
        costPerFlightColumn.setCellValueFactory(new PropertyValueFactory<AvaiableFlight, Integer>("costPerFlight"));

        
        try{
                FileOutputStream fos = new FileOutputStream("AvailableFlights.bin",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(AvaiableFlight f: flightList)
                    oos.writeObject(f);
                oos.close();
            }
            catch(Exception e){}       
            
    }    

    @FXML
    private void viewAvailableFlightsButtonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois=null;
         try {
             AvaiableFlight f;
             //FileInputStream fis = new FileInputStream("studObjects.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("AvailableFlights.bin"));
             
            
            
            while(true){
                f = (AvaiableFlight) ois.readObject();
                availableFlightsTableView.getItems().add(f);
                
            }
            
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }

    @FXML
    private void requestForBookingButtonOnMouseClick(ActionEvent event) {
        ObservableList<AvaiableFlight> selectedRow,allPeople;
        allPeople = availableFlightsTableView.getItems();
        selectedRow = availableFlightsTableView.getSelectionModel().getSelectedItems();
//        System.out.println(selectedRows.size());
//        System.out.println(selectedRow.toString());
//        TicketRequest t = new TicketRequest(t.getName(),t.getPassportNo(),);
        
        try{
                FileOutputStream fos = new FileOutputStream("studObjects.bin",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
            }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
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
    
}
