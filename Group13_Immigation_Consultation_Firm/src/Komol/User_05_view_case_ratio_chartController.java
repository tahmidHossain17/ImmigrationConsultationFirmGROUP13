/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class User_05_view_case_ratio_chartController implements Initializable {

    @FXML
    private PieChart piechart;
    @FXML
    private BarChart<String, Integer> barchart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadinfoonmouseclick(ActionEvent event) {
        piechart.getData().clear();
        barchart.getData().clear();
        
    ArrayList<CaseAssignment> caseAssignments = Receptionist.loadCaseAssignmentsFromFile("CaseAssignment.bin");
        int totalCases = caseAssignments.size();
        int[] caseTypeCounts = new int[5];
        for (CaseAssignment assignment : caseAssignments) {
            String caseType = assignment.getCaseType();
            if (caseType.equals("Emergency")) {
                caseTypeCounts[0]++;
            } else if (caseType.equals("Pro bono")) {
                caseTypeCounts[1]++;
            } else if (caseType.equals("National security")) {
                caseTypeCounts[2]++;
            } else if (caseType.equals("Special")) {
                caseTypeCounts[3]++;
            } else if (caseType.equals("Random")) {
                caseTypeCounts[4]++;
            }
        }
         XYChart.Series<String, Integer> series = new XYChart.Series<>();
            series.getData().add(new XYChart.Data<>("Emergency", caseTypeCounts[0]));
            series.getData().add(new XYChart.Data<>("Pro bono", caseTypeCounts[1]));
            series.getData().add(new XYChart.Data<>("National security", caseTypeCounts[2]));
            series.getData().add(new XYChart.Data<>("Special", caseTypeCounts[3]));
            series.getData().add(new XYChart.Data<>("Random", caseTypeCounts[4]));
            barchart.getData().add(series);
    
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
            new PieChart.Data("Emergency (" + caseTypeCounts[0] + " cases)", (double) caseTypeCounts[0] / totalCases),
            new PieChart.Data("Pro bono (" + caseTypeCounts[1] + " cases)", (double) caseTypeCounts[1] / totalCases),
            new PieChart.Data("National security (" + caseTypeCounts[2] + " cases)", (double) caseTypeCounts[2] / totalCases),
            new PieChart.Data("Special (" + caseTypeCounts[3] + " cases)", (double) caseTypeCounts[3] / totalCases),
            new PieChart.Data("Random (" + caseTypeCounts[4] + " cases)", (double) caseTypeCounts[4] / totalCases)
        );

        piechart.setData(pieChartData);
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
