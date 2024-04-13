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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_06_Client_current_statusController implements Initializable {

    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> ClientNameoncolumn;
    @FXML
    private TableColumn<?, ?> emailoncolumn;
    @FXML
    private TableColumn<?, ?> phonnumberoncolumn;
    @FXML
    private TableColumn<?, ?> documentnameoncolumn;
    @FXML
    private TableColumn<?, ?> statusoncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutonbuttonclick(ActionEvent event) {
    }

    @FXML
    private void uploadclientdetailsonbuttonnclick(ActionEvent event) {
    }
    
}
