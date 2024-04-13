
package Komol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class User_05_Sending_ReportController implements Initializable {

    @FXML
    private TextField employeenametextfield;
    @FXML
    private TextField employeenumbertextfield;
    @FXML
    private TextField sendreporttextfield;
    @FXML
    private ComboBox<String> designationcombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendbuttononclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
