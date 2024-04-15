/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class PurchaseApprovalController implements Initializable {

    @FXML
    private TableView<PurchaseRequest> purchaseApprovalTableView;
    @FXML
    private TableColumn<PurchaseRequest, Integer> idTableColumn;
    @FXML
    private TableColumn<PurchaseRequest, Float> ammountTableColumn;
    @FXML
    private TableColumn<PurchaseRequest, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<PurchaseRequest, String> purposeTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<PurchaseRequest,Integer>("id"));
        ammountTableColumn.setCellValueFactory(new PropertyValueFactory<PurchaseRequest,Float>("ammount"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<PurchaseRequest,LocalDate>("date"));
        purposeTableColumn.setCellValueFactory(new PropertyValueFactory<PurchaseRequest,String>("purpose"));
        
        ObjectInputStream ois=null;
         try {
             PurchaseRequest u;
             //FileInputStream fis = new FileInputStream("studObjects.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("PurchaseRequests.bin"));
             
        
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                u = (PurchaseRequest) ois.readObject();
                purchaseApprovalTableView.getItems().add(u);
                
                
                
            }
            //ois.close();
                       
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
           
            try {
                System.out.println(ex.toString());
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) { 
            
            }           
        }
       purchaseApprovalTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);  
    }
        
        
        

    @FXML
    private void confirmRequestOnMouseClick(ActionEvent event) {
        PurchaseRequest selectedRequest = purchaseApprovalTableView.getSelectionModel().getSelectedItem();
        //delete
      
        //Set status and Record
        
        }

    @FXML
    private void declineRequestOnMouseClick(ActionEvent event) {
        PurchaseRequest selectedRequest = purchaseApprovalTableView.getSelectionModel().getSelectedItem();
        
        //Set status and Record
        
    }

    @FXML
    private void showRequestButtonOnMouseClick(ActionEvent event) {
    }
    
}
