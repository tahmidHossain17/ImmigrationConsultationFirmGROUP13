/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
 * @author prosh
 */
public class SelectUserController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void itOfficerButtonOnMouseClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("IT Officer.fxml"));
        Parent scene2Parent = loader.load();
        Scene scene2 = new Scene(scene2Parent);

     
        ITOfficerController controller2 = loader.getController();
    
        
        
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
  
        stg2.setScene(scene2);
        stg2.show();
        
    }

    @FXML
    private void MDButtonOnMouseClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ManagingDirector.fxml"));
        Parent scene3Parent = loader.load();
        Scene scene3 = new Scene(scene3Parent);
      
        
        ManagingDirectorController controller3 = loader.getController();
              
     
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    
       
        stg2.setScene(scene3);
        stg2.show();
        
    }
    
}
