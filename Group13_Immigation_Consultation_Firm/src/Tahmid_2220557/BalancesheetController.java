/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class BalancesheetController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private ComboBox<String> assetComboBox;
    @FXML
    private TextField assetTextField;
    @FXML
    private TextField liabilitiesTextField;
    @FXML
    private TextField ownerEquityTextField;
    Balance bd;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
            assetComboBox.getItems().addAll("Current","Fixed");
        // TODO
    }    

    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
                Parent backButton= FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }

    @FXML
    private void generateBalanceSheetOnMouseClick(ActionEvent event) throws IOException {
        Parent backButton= FXMLLoader.load(getClass().getResource("BalanceSheetOutput.fxml"));
        Scene scene1=new Scene(backButton);
        
        Stage s=new Stage();
        s.setScene(scene1);
        s.show();
        
        
        
        
        
    }

    @FXML
    private void saveOnMouseClick(ActionEvent event) {
          FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    File f = null;
    
    bd=new Balance(Integer.parseInt(assetTextField.getText()),Integer.parseInt(liabilitiesTextField.getText()),Integer.parseInt(ownerEquityTextField.getText()),monthComboBox.getValue());


    System.out.println(bd);

    try {
        f = new File("balancerecord.bin");

        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(bd); // Serialize only the Paymentslip object
        System.out.println("Written successful");

//        dueLabel.setText("Amount Due is " + Float.toString(slip.getDueAmount()) + " Taka");

    } catch (Exception ex) {
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
    
}
