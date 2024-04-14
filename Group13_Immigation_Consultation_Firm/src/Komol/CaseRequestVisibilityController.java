/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.stage.Stage;

public class CaseRequestVisibilityController implements Initializable {

    @FXML
    private TableColumn<Caserequest, String> clientnameoncolumn;
    @FXML
    private TableColumn<Caserequest, String> numberoncolumn;
    @FXML
    private TableColumn<Caserequest, String> detailsoncolumn;
    @FXML
    private TableColumn<Caserequest, String> typeoncolumn;
    @FXML
    private TableColumn<Caserequest, String> genderoncolumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadinfobuttononclick(ActionEvent event) {
        // Create sample CaseRequest instances
        Caserequest caseRequest1 = new Caserequest("komol", "123456", "Government issu", "special", "Male");
        Caserequest caseRequest2 = new Caserequest("Joy", "789012", "student", "random", "male");

        // Write CaseRequest instances to file
        caseRequest1.writeToFile("caseRequest1.bin");
        caseRequest2.writeToFile("caseRequest2.bin");

        // Read CaseRequest instances from file (optional)
        Caserequest retrievedCaseRequest1 = Caserequest.readFromFile("caseRequest1.bin");
        Caserequest retrievedCaseRequest2 = Caserequest.readFromFile("caseRequest2.bin");

        // You can use the retrievedCaseRequest objects as needed
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
    private void backonbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LegaladvisorDashboard.fxml"));
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
