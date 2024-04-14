
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
import javafx.scene.chart.PieChart;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class ApplicationFormReviewController implements Initializable {

    @FXML
    private PieChart piechart;
    @FXML
    private TableView<Applicatonform> tableview;
    @FXML
    private TableColumn<Applicatonform, String> counteyoncolumn;
    @FXML
    private TableColumn<Applicatonform,String> maleoncolumn;
    @FXML
    private TableColumn<Applicatonform,String> Femaleoncolumn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        counteyoncolumn.setCellValueFactory(new PropertyValueFactory<Applicatonform, String>("Name"));
         maleoncolumn.setCellValueFactory(new PropertyValueFactory<Applicatonform, String>("email"));
        Femaleoncolumn.setCellValueFactory(new PropertyValueFactory<Applicatonform, String>("Phone Number"));
    }    

    @FXML
    private void countryratiobuttononclick(ActionEvent event) {
    }

    @FXML
    private void genderratiobuttononclick(ActionEvent event) {
    }

    @FXML
    private void tableviewonclick(ActionEvent event) {
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
