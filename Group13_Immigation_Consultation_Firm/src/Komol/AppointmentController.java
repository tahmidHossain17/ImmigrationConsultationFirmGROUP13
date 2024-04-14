/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class AppointmentController implements Initializable {
 ArrayList<Appointment> clientlist;
    @FXML
    private TableView<Appointment> tableview;
    @FXML
    private TableColumn<Appointment, String> clientnameoncolumn;
    @FXML
    private TableColumn<Appointment, Integer> clientphonenumberoncolumn;
    @FXML
    private TableColumn<Appointment, String> timeoncolumn;
    @FXML
    private TableColumn<Appointment, String> dateoncolumn;
    @FXML
    private TextField ClientnameTextField;
    @FXML
    private TextField phonenumberTextfield;
    @FXML
    private TextField timeTextfield;
    @FXML
    private DatePicker datedatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         clientlist = new ArrayList<Appointment>();
         clientnameoncolumn.setCellValueFactory(new PropertyValueFactory<Appointment,String>("name"));
         clientphonenumberoncolumn.setCellValueFactory(new PropertyValueFactory<Appointment,Integer>("Phone Number"));
         timeoncolumn.setCellValueFactory(new PropertyValueFactory<Appointment,String>("time"));
         //datedatepicker.setCellValueFactory(new PropertyValueFactory<Appointment,String>("name"));
    }    

    @FXML
    private void loadbuttononclick(ActionEvent event) {
    }

    @FXML
    private void backbuttononclick(ActionEvent event) {
        
    }

    @FXML
    private void Addbuttononclick(ActionEvent event) {
        
        
    }

    @FXML
    private void viewtableonclick(ActionEvent event) {
         for(Appointment s: clientlist){
            tableview.getItems().add(s);
         }
    }
    
}
