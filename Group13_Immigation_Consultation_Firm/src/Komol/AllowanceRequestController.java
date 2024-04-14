
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
import javafx.scene.control.DatePicker;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class AllowanceRequestController implements Initializable {

    @FXML
    private TextField Employeenametextfield;
    @FXML
    private TextField employeenumbertextfield;
    @FXML
    private ComboBox<String> designationcombobox;
    @FXML
    private TextField expancedetailstextfield;
    @FXML
    private TextField expenseamounttextfield;
    @FXML
    private DatePicker datepicker;
    @FXML
    private RadioButton bankaccountradiobutton;
    @FXML
    private RadioButton checkradiobutton;
    @FXML
    private RadioButton mobilebankingradiobutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationcombobox.getItems().addAll("Legal Advisor","Consultant","Receptionist");
          ToggleGroup paymentMethodToggleGroup = new ToggleGroup();
         bankaccountradiobutton.setToggleGroup(paymentMethodToggleGroup);
         checkradiobutton.setToggleGroup(paymentMethodToggleGroup);
         mobilebankingradiobutton.setToggleGroup(paymentMethodToggleGroup);
    }    

    @FXML
    private void downloadreceiptonclick(ActionEvent event) {
    }

    @FXML
    private void submitrequestonclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) throws IOException {
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
