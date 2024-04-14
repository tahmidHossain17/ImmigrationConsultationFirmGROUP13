/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author MSI
 */
public class OperationalExpenditureController implements Initializable {


    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private ComboBox<String> expenseComboBox;
    @FXML
    private TableView<Opex> opexTableView;
    @FXML
    private TableColumn<Opex,String> dateTableColumn;
    @FXML
    private TableColumn<Opex,String > typeTableColumn;
    @FXML
    private TableColumn<Opex, Integer> amountTableColumn;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextField expenseTextField;
    @FXML
    private PieChart pieChart;
    /**
     * Initializes the controller class.
     */
    Opex opx;
    Stage sg;
    int utility,rent,food,misc,insurance,others;
        private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
            expenseComboBox.getItems().addAll("Utility","Rent","Miscellenous","Insurance","Food","Others");
            
            dateTableColumn.setCellValueFactory(new PropertyValueFactory<Opex,String>("month"));
            typeTableColumn.setCellValueFactory(new PropertyValueFactory<Opex,String>("expenseType"));
            amountTableColumn.setCellValueFactory(new PropertyValueFactory<Opex,Integer>("amnt"));
            
            
        // TODO
    }    
    
    @FXML
    private void saveDataOnMouseClick(ActionEvent event) {
        ObjectOutputStream oos=null;
        FileOutputStream fos=null;
        File f=null;
        opx=new Opex(monthComboBox.getValue(),expenseComboBox.getValue(),Integer.parseInt(amountTextField.getText()));
        try{
            
            f=new File("opexRecord.bin");
            
            if (f.exists()){
                fos= new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
            
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
                        
            
            }
            oos.writeObject(opx);
            System.out.println("Write Success");
//            oos.close();
        
        
        }
       catch (Exception ex) {
        ex.printStackTrace(); // Print stack trace to identify any exceptions
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle IO exceptions
        }
    }
    }

    @FXML
    private void showDataOnMouseClick(ActionEvent event) {
          Opex s;
        ObjectInputStream ois = null;
        try {
            //FileInputStream fis = new FileInputStream("studObjects.bin");
            //ois = new ObjectInputStream(fis);
            ois = new ObjectInputStream(new FileInputStream("opexRecord.bin"));

//            outputTxtArea.setText(null);

            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            opexTableView.getItems().clear();
            int sum=0;
            while (true) {
                System.out.println("helo");
                s = (Opex) ois.readObject();
                System.out.println(s.toString());
                sum+=s.getAmnt();
                
                
                opexTableView.getItems().add(s);
                expenseTextField.setText(Integer.toString(sum));
                if (s.getExpenseType().equals("Utility")){
                    utility+=s.getAmnt();
                
              }
                if (s.getExpenseType().equals("Rent")){
                    rent+=s.getAmnt();
                
              }
                if (s.getExpenseType().equals("Food")){
                    food+=s.getAmnt();
                
              }
                if (s.getExpenseType().equals("Miscellenous")){
                    misc+=s.getAmnt();
                
              }
                if (s.getExpenseType().equals("Insurance")){
                    insurance+=s.getAmnt();
                
              }
                if (s.getExpenseType().equals("Others")){
                    others+=s.getAmnt();
                
              }
                
//                requestTableView.getItems().add(new AllowanceRequest(s.getName(),s.getAllowanceType(),s.getDesignantion(),s.getPaymentMethod(),s.getAmount()));
//                outputTxtArea.appendTexts.toString() + "\n");
//                outputTxtArea.appendText(s.toString()+"\n");
            }
            //ois.close();

        } catch (RuntimeException e) {
            e.printStackTrace();
            //
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex1) {
            }

        }

    }


    @FXML
    private void backOnMouseClick(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
        
        Scene sc=new Scene(parent);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(sc);
        sg.show();
    }

    @FXML
    private void showChartOnMouseClick(ActionEvent event) {
        
        pieChart.getData().clear();
        
        list.add(new PieChart.Data("Utility",utility));
        list.add(new PieChart.Data("Rent",rent));
        list.add(new PieChart.Data("Insurance",insurance));
        list.add(new PieChart.Data("Miscelllenous",misc));
        list.add(new PieChart.Data("Others",others));
        list.add(new PieChart.Data("Food",food));
        
        pieChart.setData(list);
        
    }

}
