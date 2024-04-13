
package Komol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class FXMLController implements Initializable {

    @FXML
    private TextField employeenametextfield;
    @FXML
    private TextField employeenumbertextfield;
    @FXML
    private ComboBox<String> designationcombobox;
    @FXML
    private TextField sendreporttextfield;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void sendbuttononclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
