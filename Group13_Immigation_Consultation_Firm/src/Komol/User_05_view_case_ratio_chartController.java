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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_05_view_case_ratio_chartController implements Initializable {

    @FXML
    private PieChart piechart;
    @FXML
    private BarChart<?, ?> barchart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadinfoonmouseclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
