/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class FixAppointmentController implements Initializable {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> timeSlotCombobox;
    @FXML
    private TextField phoneTextField;
    
    Appointment app;
    Stage sg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeSlotCombobox.getItems().addAll("10:00AM","12:00PM","3:00PM","5:00PM","7:00PM");
        // TODO
        app=new Appointment();
    }    
        private void showNotifyAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
          }
    @FXML
    private void submitButtonOnMouseClick(ActionEvent event) {
    
        ObjectOutputStream oos=null;
        FileOutputStream fos=null;
        File f=null;
        app=new Appointment(nameTextField.getText(),timeSlotCombobox.getValue(),phoneTextField.getText(),dateDatePicker.getValue());
       
        try{
            f=new File("appointmentRecord.bin");
            
            if (f.exists()){
                
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
            
            }
            
            else{
                
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            
            oos.writeObject(app);
            System.out.println("Write Object Successful");
//            OutputLabel.setText("Your Record Has Been saved \n"+att.toString());
            showNotifyAlert("Notification", "Attendence Submitted");
            oos.close();
        
        
        
        }
        catch(Exception ex){
        
        }
        
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
