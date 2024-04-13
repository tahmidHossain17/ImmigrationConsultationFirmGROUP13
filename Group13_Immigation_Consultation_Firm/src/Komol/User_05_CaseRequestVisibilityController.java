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

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_05_CaseRequestVisibilityController implements Initializable {

    @FXML
    private TableColumn<Casereview,String > clientnameoncolumn;
    @FXML
    private TableColumn<Casereview,String> numberoncolumn;
    @FXML
    private TableColumn<Casereview,String> detailsoncolumn;
    @FXML
    private TableColumn<Casereview,String> typeoncolumn;
    @FXML
    private TableColumn<Casereview,String> genderoncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadinfobuttononclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
