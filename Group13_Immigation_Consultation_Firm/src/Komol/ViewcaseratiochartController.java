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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class ViewcaseratiochartController implements Initializable {

    @FXML
    private BarChart<String, Integer> piechart;
    @FXML
    private PieChart barchart;

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

    @FXML
    private void backbuttononclick(ActionEvent event) {
    }
    
}
