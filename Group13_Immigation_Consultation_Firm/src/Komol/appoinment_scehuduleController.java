/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class appoinment_scehuduleController implements Initializable {

    @FXML
    private ComboBox<String> combobox;
    @FXML
    private TextArea textarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.getItems().addAll("Appointment","Document");
    }    

    @FXML
    private void loadbuttononclick(ActionEvent event) {
      String selectedFileName = null;
        if ( combobox.getValue() == "Appointment"){
            selectedFileName = "Legal Advisor Appointment.bin";
        }
        
//        List<Object> objects = Lawyer.readObjectsFromFile(selectedFileName);
//        StringBuilder contentBuilder = new StringBuilder();
//        
//        for (Object obj : objects) {
//            if (obj instanceof Appointment) {
//                contentBuilder.append(((Appointment) obj).toString()).append("\n");
//            }
//        }
//           textarea.setText(contentBuilder.toString());
    }
    

    @FXML
    private void logoutbuttonclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mainPKG/Login.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show(); 
    }
    
}
