/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class AppointmentRecordController implements Initializable {

    @FXML
    private ComboBox<String> nameComboBox;
    @FXML
    private TableView<Appointment> appointmentTableView;
    @FXML
    private TableColumn<Appointment, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Appointment, String> nameTableColumn;
    @FXML
    private TableColumn<Appointment, String> phoneTableColumn;
    @FXML
    private TableColumn<Appointment, String> timeSlotTableColumn;
    
    Stage sg;
    ArrayList<Appointment> lst;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Appointment,LocalDate>("date"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Appointment,String>("name"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<Appointment,String>("phone"));
        timeSlotTableColumn.setCellValueFactory(new PropertyValueFactory<Appointment,String>("timeslot"));
        
        
        lst=new ArrayList();
        // TODO
    }    

    @FXML
    private void loadButtonOnMouseClick(ActionEvent event) {
        appointmentTableView.getItems().clear();
        for(Appointment a:lst){
            if (nameComboBox.getValue().equals(a.getName())){
                appointmentTableView.getItems().add(a);
            }
        }
    }

    @FXML
    private void showAppointmentbuttonOnMouseClick(ActionEvent event) {
        ObjectInputStream ois=null;
        Appointment s;
        
        try{
            
            ois=new ObjectInputStream(new FileInputStream("appointmentRecord.bin"));
            appointmentTableView.getItems().clear();
            nameComboBox.getItems().clear();
            while(true){
                
                s=(Appointment)ois.readObject();
                
                appointmentTableView.getItems().add(s);
                nameComboBox.getItems().add(s.getName());
                lst.add(s);
                
                
                
                
            
            
            }
        
        }
        catch(Exception ex){}
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent backButton= FXMLLoader.load(getClass().getResource("R_ReceptionistMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
