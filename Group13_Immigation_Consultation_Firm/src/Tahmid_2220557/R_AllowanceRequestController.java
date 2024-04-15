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
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class R_AllowanceRequestController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> designationComboBox;
    @FXML
    private ComboBox<String> allowanceTypeComboBox;
    @FXML
    private TextField requestedAmountTextField;
    @FXML
    private Label outputLabel;
    @FXML
    private ComboBox<String> choosePayMethodComboBox;

    AllowanceRequest allw;
    ArrayList<AllowanceRequest> rqstLst;
    private TextArea outputTxtArea;
    Stage sg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationComboBox.getItems().addAll("Accountant", "Receptionist", "Consultant", "Lawyer", "Immigration Processing Officer", "IT Officer");
//         monthComboBx.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        allowanceTypeComboBox.getItems().addAll("Transportation", "Food", "Material", "Talk Time");
        choosePayMethodComboBox.getItems().addAll("Bkash", "Nagad", "Rocket", "Bank");
        rqstLst = new ArrayList();
    }
      private void showNotifyAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
          }
    @FXML
    private void SubmitRequestOnMouseClick(ActionEvent event) {
        allw = new AllowanceRequest(nameTextField.getText(), allowanceTypeComboBox.getValue(), designationComboBox.getValue(), choosePayMethodComboBox.getValue(), Integer.parseInt(requestedAmountTextField.getText()));
        System.out.println(allw.toString());
        rqstLst.add(allw);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("AllowanceRequest.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(allw);
            System.out.println("write object sucessfull ");
            outputLabel.setText("Your Request Has Been Submitted");
            showNotifyAlert("Notification", "Request Submitted.Thank You!");
            oos.close();

        } catch (IOException ex) {


        }
    }


    private void ShowRequestOnMouseClick(ActionEvent event) {
    


    System.out.println ("Heated");
        ObjectInputStream ois = null;

    
        try {
            AllowanceRequest allw;
        //FileInputStream fis = new FileInputStream("studObjects.bin");
        //ois = new ObjectInputStream(fis);
        ois = new ObjectInputStream(new FileInputStream("AllowanceRequest.bin"));

        outputTxtArea.setText(null);
        //int[] arr={1,2,3};
        //System.out.println(arr[3]);

               while (true) {
                allw = (AllowanceRequest) ois.readObject();
                System.out.println(allw.toString());

                outputTxtArea.appendText(allw.toString() + "\n");
                //outputTxtArea.appendText(s+"\n");
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
       
        Parent parent=FXMLLoader.load(getClass().getResource("/mainPKG/Login.fxml"));
        
        Scene scn=new Scene(parent);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scn);
        sg.show();
    }

}
