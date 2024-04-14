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
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class clientReviewController implements Initializable {

    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> serialnooncolumn;
    @FXML
    private TableColumn<?, ?> clientnameoncolumn;
    @FXML
    private TableColumn<?, ?> secesiontimeoncolumn;
    @FXML
    private TableColumn<?, ?> genderoncolumn;
    @FXML
    private TableColumn<?, ?> ratingsoncolumn;
    @FXML
    private TableColumn<?, ?> feedbackoncolumn;
    @FXML
    private PieChart Piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Loadbuttononclick(ActionEvent event) {
    }

    @FXML
    private void ratingsbuttononclick(ActionEvent event) {
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
