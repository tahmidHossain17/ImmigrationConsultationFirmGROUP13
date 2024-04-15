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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class R_AttendenceAndHoursController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private DatePicker DateLocalDate;
    @FXML
    private TextField extraHoursTextField;
    @FXML
    private Label OutputLabel;
    
    Attendance att;
    ToggleGroup tg;
    Stage sg;
    @FXML
    private RadioButton presentRadioButton;
    @FXML
    private RadioButton absentRadioButton;
    @FXML
    private RadioButton lateRadioButton;
    @FXML
    private RadioButton leaveRadioButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        att=new Attendance();
        presentRadioButton.setToggleGroup(tg);
        absentRadioButton.setToggleGroup(tg);
        leaveRadioButton.setToggleGroup(tg);
        lateRadioButton.setToggleGroup(tg);
                
        
    }    
    
        private void showNotifyAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
          }
    @FXML
    private void saveRecordOnMouseClick(ActionEvent event) {
        
        String attnd="";
        
        if (presentRadioButton.isSelected()){
            attnd="Present";
        
        }
        if (absentRadioButton.isSelected()){
            attnd="Absent";
        
        }
        if (lateRadioButton.isSelected()){
            attnd="Late";
        
        }
        if (leaveRadioButton.isSelected()){
            attnd="On Leave";
        
        }
        
        
        
        
        
        ObjectOutputStream oos=null;
        FileOutputStream fos=null;
        File f=null;
        
        att=new Attendance(nameTextField.getText(),attnd,DateLocalDate.getValue(),Integer.parseInt(extraHoursTextField.getText()));
        System.out.println(att);
        try{
            f=new File("attendanceRecord.bin");
            
            if (f.exists()){
                
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
            
            }
            
            else{
                
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            
            oos.writeObject(att);
            System.out.println("Write Object Successful");
            OutputLabel.setText("Your Record Has Been saved \n"+att.toString());
            showNotifyAlert("Notification", "Attendence Submitted");
            oos.close();
        
        
        
        }
        catch(Exception ex){
        
        }
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) throws IOException {
                Parent backButton= FXMLLoader.load(getClass().getResource("R_ReceptionistMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }

}
