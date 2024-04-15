/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class FinancialReport_ChartController implements Initializable {

    @FXML
    private BarChart<String,Number> barChart;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TextField profitTextField;
    @FXML
    private NumberAxis yaxis;
    @FXML
    private CategoryAxis xaxis;
    Stage sg;
    ArrayList<Report> rp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
          rp=new ArrayList();
    }    

    @FXML
    private void showChartOnMouseClick(ActionEvent event) {
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        for(Report r:rp){
            series.getData().add(new XYChart.Data<String,Number>(r.getMonth(),r.getNet()));
        
        }
         barChart.getData().add(series);
         
         profitTextField.clear();
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
        rp.add(new Report(monthComboBox.getValue(),Integer.parseInt(profitTextField.getText())));
        profitTextField.clear();
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent backButton= FXMLLoader.load(getClass().getResource("R_ReceptionistMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
        
        
    }
    
}
