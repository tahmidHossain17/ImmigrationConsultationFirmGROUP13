
package Komol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class User_06_Client_current_statusController implements Initializable {

    @FXML
    private TableView<Clientdetails> tableview;
    @FXML
    private TableColumn<Clientdetails, String> ClientNameoncolumn;
    @FXML
    private TableColumn<Clientdetails, String> emailoncolumn;
    @FXML
    private TableColumn<Clientdetails, String> phonnumberoncolumn;
    @FXML
    private TableColumn<Clientdetails, String> documentnameoncolumn;
    @FXML
    private TableColumn<Clientdetails, String> statusoncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ClientNameoncolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailoncolumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phonnumberoncolumn.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        documentnameoncolumn.setCellValueFactory(new PropertyValueFactory<>("documentname"));
        statusoncolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        
    }    

    @FXML
    private void logoutonbuttonclick(ActionEvent event) {
    }

    @FXML
    private void uploadclientdetailsonbuttonnclick(ActionEvent event) {
    }
    
}
