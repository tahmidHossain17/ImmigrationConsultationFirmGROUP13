/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class BalancesheetController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
                Parent backButton= FXMLLoader.load(getClass().getResource("AccountantMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
