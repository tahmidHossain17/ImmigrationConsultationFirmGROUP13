/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
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
public class ClientPaymentStatusController implements Initializable {

    @FXML
    private ComboBox<String> NameComboBox;
    @FXML
    private TableView<Paymentslip> transactionTableView;
    @FXML
    private TableColumn<Paymentslip, String> nameTableColumn;

    @FXML
    private TableColumn<Paymentslip, LocalDate> dojTableColumn;
    @FXML
    private TableColumn<Paymentslip, String> paidAmountTableColumn;
    @FXML
    private TableColumn<Paymentslip, String> dueTableColumn;
    Stage sg;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TableColumn<Paymentslip, String> phoneTableColumn;
    
    ArrayList<Paymentslip> lst;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Paymentslip, String>("name"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<Paymentslip, String>("phone"));
        dojTableColumn.setCellValueFactory(new PropertyValueFactory<Paymentslip, LocalDate>("date"));
        paidAmountTableColumn.setCellValueFactory(new PropertyValueFactory<Paymentslip, String>("recievedAmount"));
        dueTableColumn.setCellValueFactory(new PropertyValueFactory<Paymentslip, String>("due"));
        NameComboBox.getItems().add("All");
        // TODO
        lst=new ArrayList();
    }

    @FXML
private void showTransactionsButtonOnMouseClick(ActionEvent event) {
    transactionTableView.getItems().clear(); // Clear existing items
//    ObservableList<Paymentslip> ob=FXCollections.observableArrayList();
    Paymentslip p;
    
    ObjectInputStream ois = null;
    try {
        ois = new ObjectInputStream(new FileInputStream("paymentRecord.bin"));

        while (true) {
            try {
                p = (Paymentslip) ois.readObject();
//                ob.add(p);
                
                transactionTableView.getItems().add(p);
                NameComboBox.getItems().add(p.getName());
                lst.add(p);
            } catch (EOFException e) {
                // End of file reached, break out of the loop
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        try {
            if (ois != null) {
                ois.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println();        
    }
}


//    @FXML
//    private void searchbyEmpIDTExtFeildOnClk(ActionEvent event) {
//   String searchTerm = SearchFeild.getText().toLowerCase(); // Convert search term to lowercase for case-insensitive search
//    
//    // Clear the TableView
//    requestTableView.getItems().clear();
//    
//    // Iterate through the items in the TableView and add matching items to the TableView
//    for (AllowanceRequest request : requestTableView.getItems()) {
//        if (request.getName().toLowerCase().contains(searchTerm)) {
//            requestTableView.getItems().add(request);
//        }
//    }
//        
//    }
@FXML
private void backbuttonOnMouseClick(ActionEvent event)  throws IOException{
//        Parent backButton= FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
//        Scene scene1=new Scene(backButton);
//        
//        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
//        
//        sg.setScene(scene1);
//        sg.show();
        Parent parent=FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
        
        Scene scene1=new Scene(parent);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }

    @FXML
private void saveRecordOnMouseClick(ActionEvent event) {
    }

    @FXML
private void loadButtonOnMouseClick(ActionEvent event) {
    for (Paymentslip s:lst){
            transactionTableView.getItems().clear();
        if(NameComboBox.getValue().equals(s.getName())){
            transactionTableView.getItems().add(s);
        }
    if(NameComboBox.getValue().equals("All")){
              transactionTableView.getItems().clear();
        for (Paymentslip t:lst){
              transactionTableView.getItems().add(t);
             
        }
    }

        
        
        
    
    }
    
    }
    
}
