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
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ClientTicketProcessingController implements Initializable {

    @FXML
    private TableView<ClientTicket> bookingRequestsTableView;
    @FXML
    private TableColumn<ClientTicket, String> nameColumn;
    @FXML
    private TableColumn<ClientTicket, String> passportNoColumn;
    @FXML
    private TableColumn<ClientTicket, String> flightSelected;
    @FXML
    private TableColumn<ClientTicket, LocalDate> dateOfFlightColumn;
    @FXML
    private TableColumn<ClientTicket, String> countryColumn;
    @FXML
    private TextField tickerNumberTextField;
    @FXML
    private TextField passportNoTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<ClientTicket, String>("name"));
        passportNoColumn.setCellValueFactory(new PropertyValueFactory<ClientTicket, String>("passportNo"));
        flightSelected.setCellValueFactory(new PropertyValueFactory<ClientTicket, String>("flightSelected"));
        dateOfFlightColumn.setCellValueFactory(new PropertyValueFactory<ClientTicket, LocalDate>("dateOfFlight"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<ClientTicket, String>("country"));
        
        
    }    

    @FXML
    private void confirmButtonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            ClientTicket r;
            ois = new ObjectInputStream(new FileInputStream("TicketBookingRequest.bin"));

            // Clear existing items in the TableView
            bookingRequestsTableView.getItems().clear();

            while (true) {
                r = (ClientTicket) ois.readObject();
                bookingRequestsTableView.getItems().add(new ClientTicket(r.getName(),r.getPassportNo(),r.getFlightSelected(),r.getCountry(),r.getDateOfFlight()));
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

    @FXML
    private void cannotBeProcessedButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void loadTableButtonOnMouseClick(ActionEvent event) {
        
    }
    
}
