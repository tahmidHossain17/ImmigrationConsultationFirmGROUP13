
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
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class ClientCurrentStatusController implements Initializable {

    @FXML
    private TableColumn<status, String> nameoncolumn;
    @FXML
    private TableColumn<status, String> emailoncolumn;
    @FXML
    private TableColumn<status, String> phonenumberincolumn;
    @FXML
    private TableColumn<status, String> documentnameoncolumn;
    @FXML
    private TableColumn<status, String> statusoncolumn;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameoncolumn.setCellValueFactory(new PropertyValueFactory<status, String>("Name"));
        emailoncolumn.setCellValueFactory(new PropertyValueFactory<status, String>("email"));
        phonenumberincolumn.setCellValueFactory(new PropertyValueFactory<status, String>("Phone Number"));
        documentnameoncolumn.setCellValueFactory(new PropertyValueFactory<status, String>("Document name"));
        statusoncolumn.setCellValueFactory(new PropertyValueFactory<status, String>("Status"));
    }    

    @FXML
    private void backbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ConsultantDashboard.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();  
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event)throws IOException {
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

    @FXML
    private void uploadbuttononclick(ActionEvent event) {
    }
    
}
