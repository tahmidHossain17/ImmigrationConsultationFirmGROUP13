/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class ITOfficerProfileController implements Initializable {

 
    @FXML
    private Label emailLable;

    @FXML
    private Label nameLable;
    @FXML
    private Label idLable;
    @FXML
    private Label mobileNumber;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
          nameLable.setText("Prosanto Bhakta");
          idLable.setText("2010271");
          emailLable.setText("2010271@iub.edu.bd");
          mobileNumber.setText("01537198808");
    }    
    
}
