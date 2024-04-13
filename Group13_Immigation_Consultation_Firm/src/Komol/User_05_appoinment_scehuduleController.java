/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_05_appoinment_scehuduleController implements Initializable {

    @FXML
    private ComboBox<String> combobox;
    @FXML
    private TextArea textarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.getItems().addAll("Appointment", 
                "Legal Documents");
    }    

    @FXML
    private void loadbuttononclick(ActionEvent event) {
                String selectedFileName = null;
        if (combobox.getValue() == "Appointment"){
            selectedFileName = "Lawyer Appointment.bin";
        }
        
        List<Object> objects = Lawyer.readObjectsFromFile(selectedFileName);
        StringBuilder contentBuilder = new StringBuilder();
        
        for (Object obj : objects) {
            // if (obj instanceof Appointment) {
               //contentBuilder.append(((Appointment) obj).toString()).append("\n");
            //}
        }
        textarea.setText(contentBuilder.toString());
    
    }

    @FXML
    private void logoutbuttonclick(ActionEvent event) {

    }
    
}
