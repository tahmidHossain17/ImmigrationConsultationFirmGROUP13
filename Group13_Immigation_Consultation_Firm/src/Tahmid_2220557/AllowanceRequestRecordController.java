/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class AllowanceRequestRecordController implements Initializable {

    @FXML
    private TableView<AllowanceRequest> requestTableView;
    @FXML
    private TableColumn<AllowanceRequest, String> nameTableColumn;
    @FXML
    private TableColumn<AllowanceRequest, String> designationTableColumn;
    @FXML
    private TableColumn<AllowanceRequest, String> allowanceTypeTableColumn;
    @FXML
    private TableColumn<AllowanceRequest, String> paymentMethodTableColumn;
    @FXML
    private TableColumn<AllowanceRequest, Integer> amountTableColumn;
    @FXML
    private TextArea outputTxtArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,String>("id"));
        designationTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,String>("designation"));
        allowanceTypeTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,String>("allowanceType"));
        paymentMethodTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,String>("paymentMethod"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,Integer>("amount"));
//        StatusTableColumn.setCellValueFactory(new PropertyValueFactory<AllowanceRequest,String>("id"));
        
        // TODO
    }    

    @FXML
    private void showRecordOnMouseClick(ActionEvent event) {
                System.out.println("Heated");

        AllowanceRequest s;
        ObjectInputStream ois = null;
        try {
            //FileInputStream fis = new FileInputStream("studObjects.bin");
            //ois = new ObjectInputStream(fis);
            ois = new ObjectInputStream(new FileInputStream("AllowanceRequest.bin"));

//            outputTxtArea.setText(null);

            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while (true) {
                System.out.println("helo");
                s = (AllowanceRequest) ois.readObject();
                System.out.println(s.toString());
                
                requestTableView.getItems().add(s);
//                requestTableView.getItems().add(new AllowanceRequest(s.getName(),s.getAllowanceType(),s.getDesignantion(),s.getPaymentMethod(),s.getAmount()));
//                outputTxtArea.appendTexts.toString() + "\n");
                outputTxtArea.appendText(s.toString()+"\n");
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
    
}
