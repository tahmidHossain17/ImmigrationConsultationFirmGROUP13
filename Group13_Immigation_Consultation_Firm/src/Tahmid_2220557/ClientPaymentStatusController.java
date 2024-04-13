/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class ClientPaymentStatusController implements Initializable {

    @FXML
    private ComboBox<?> NameComboBox;
    @FXML
    private TextField PhoneTextField;
    @FXML
    private TableView<?> transactionTableView;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> idTableColumn;
    @FXML
    private TableColumn<?, ?> dojTableColumn;
    @FXML
    private TableColumn<?, ?> paidAmountTableColumn;
    @FXML
    private TableColumn<?, ?> dueTableColumn;
    @FXML
    private TableColumn<?, ?> statusTablecolumn;

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showTransactionsButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException{
        Parent backButton= FXMLLoader.load(getClass().getResource("AccountantMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
        
    }

    @FXML
    private void saveRecordOnMouseClick(ActionEvent event) {
    }
    
}
