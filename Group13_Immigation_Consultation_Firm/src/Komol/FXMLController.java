
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
       designationcombobox.getItems().addAll("Legal Advisor","Consultant");
    }    

    @FXML
    private void sendbuttononclick(ActionEvent event) {
            
    employeenametextfield.clear();
    employeenumbertextfield.clear();
    sendreporttextfield.clear();
    //designationcombobox.clear();

    }

    @FXML
    private void logoutbuttononclick(ActionEvent event)  throws IOException {
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
