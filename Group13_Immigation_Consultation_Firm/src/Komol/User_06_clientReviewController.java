
package Komol;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class User_06_clientReviewController implements Initializable {

    @FXML
    private TableView<Clientreview> tableview;
    @FXML
    private TableColumn<Clientreview, String> serialnooncolumn;
    @FXML
    private TableColumn<Clientreview, String> clientnameoncolumn;
    @FXML
    private TableColumn<Clientreview, String> secesiontimeoncolumn;
    @FXML
    private TableColumn<Clientreview, String> genderoncolumn;
    @FXML
    private TableColumn<Clientreview, String> ratingsoncolumn;
    @FXML
    private TableColumn<Clientreview, String> feedbackoncolumn;
    @FXML
    private PieChart Piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serialnooncolumn.setCellValueFactory(new PropertyValueFactory <>("serial no"));
        clientnameoncolumn.setCellValueFactory(new PropertyValueFactory <>("Client name"));
        secesiontimeoncolumn.setCellValueFactory(new PropertyValueFactory <>("Secesion Time"));
        genderoncolumn.setCellValueFactory(new PropertyValueFactory <>("gender"));
        ratingsoncolumn.setCellValueFactory(new PropertyValueFactory <>("Ratings"));
        feedbackoncolumn.setCellValueFactory(new PropertyValueFactory <>("Feedback"));
        
    }    

    @FXML
    private void Loadbuttononclick(ActionEvent event) {
            ArrayList<Clientreview> myList = ClientFeedback.reviewFileRead();
        ObservableList<Clientreview> reviewlist = FXCollections.observableArrayList(myList);
         tableview.setItems(reviewlist);
    
    
     
    }

    @FXML
    private void ratingsbuttononclick(ActionEvent event) {
         ArrayList<String> myList = ClientFeedback.rating();
         ObservableList<PieChart.Data> pieChartData = (ObservableList<PieChart.Data>) Piechart.getData();
         pieChartData.clear();
        int count_1=0;
        int count_2=0;
        int count_3=0;
        int count_4=0;
        int count_5=0;
        for(String r:myList){
            if(r.equals("1")){
               count_1=count_1+1; 
            }
            else if(r.equals("2")){
               count_2=count_2+1; 
            }
            else if(r.equals("3")){
               count_3=count_3+1; 
            }
            else if(r.equals("4")){
               count_4=count_4+1; 
            }
            else if(r.equals("5")){
               count_5=count_5+1; 
            }

        }
         if ( count_1> 0) {
        Piechart.getData().add(new PieChart.Data("1", count_1));
       }
        if ( count_2> 0) {
        Piechart.getData().add(new PieChart.Data("2", count_2));
       }
        if ( count_3> 0) {
        Piechart.getData().add(new PieChart.Data("3", count_3));
       }
       if ( count_4> 0) {
        Piechart.getData().add(new PieChart.Data("4", count_4));
       }
       if ( count_5> 0) {
        Piechart.getData().add(new PieChart.Data("5", count_5));
       }
    }
    
    
}
