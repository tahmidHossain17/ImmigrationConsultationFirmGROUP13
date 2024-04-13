/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/**
 * FXML Controller class
 *
 * @author MSI
 */
public class OperationalExpenditureController implements Initializable {


    @FXML
    private ComboBox<?> monthComboBox;
    @FXML
    private ComboBox<?> expenseComboBox;
    @FXML
    private TableView<?> opexTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> typeTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> totalTableColumn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void saveDataOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void showDataOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void pdfOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) {
    }

}
