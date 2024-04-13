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
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_06_application_form_reviewController implements Initializable {

    @FXML
    private PieChart Piechart;
    @FXML
    private TableColumn<?, ?> Countrynameoncolumn;
    @FXML
    private TableColumn<?, ?> maleoncolumn;
    @FXML
    private TableColumn<?, ?> Femaleoncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Countryratioonclick(ActionEvent event) {
    }

    @FXML
    private void genderratioonclick(ActionEvent event) {
    }

    @FXML
    private void tableviewonclick(ActionEvent event) {
    }
    
}
