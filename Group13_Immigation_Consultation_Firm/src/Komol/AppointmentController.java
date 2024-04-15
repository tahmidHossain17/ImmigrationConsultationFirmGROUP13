/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class AppointmentController implements Initializable {

    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> clientnameoncolumn;
    @FXML
    private TableColumn<?, ?> clientphonenumberoncolumn;
    @FXML
    private TableColumn<?, ?> timeoncolumn;
    @FXML
    private TableColumn<?, ?> dateoncolumn;
    @FXML
    private TextField ClientnameTextField;
    @FXML
    private TextField phonenumberTextfield;
    @FXML
    private TextField timeTextfield;
    @FXML
    private DatePicker datedatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadbuttononclick(ActionEvent event) {
    }

    @FXML
    private void backbuttononclick(ActionEvent event) {
    }

    @FXML
    private void Addbuttononclick(ActionEvent event) {
    }

    @FXML
    private void viewtableonclick(ActionEvent event) {
    }
    
}
