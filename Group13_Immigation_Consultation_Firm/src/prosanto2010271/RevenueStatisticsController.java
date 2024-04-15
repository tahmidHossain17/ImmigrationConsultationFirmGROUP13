/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import Tahmid_2220557.Report;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class RevenueStatisticsController implements Initializable {

    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private NumberAxis xAxis;
    @FXML
    private CategoryAxis yaxis;
    ArrayList<Report> rp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        rp=new ArrayList();
            XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        for(Report r:rp){
            series.getData().add(new XYChart.Data<String,Number>(r.getMonth(),r.getNet()));
        
        }
         barChart.getData().add(series);
         
    }    
    
}
