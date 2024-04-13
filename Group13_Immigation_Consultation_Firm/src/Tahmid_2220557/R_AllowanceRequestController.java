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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    @FXML
    private TextArea outputTxtArea;

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

    @FXML
    private void SubmitRequestOnMouseClick(ActionEvent event) {
        allw = new AllowanceRequest(nameTextField.getText(), allowanceTypeComboBox.getValue(), designationComboBox.getValue(), choosePayMethodComboBox.getValue(), Integer.parseInt(requestedAmountTextField.getText()));
        System.out.println(allw.toString());
        rqstLst.add(allw);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("AllowanceRequests.bin");
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
            oos.close();

        } catch (IOException ex) {
//                Logger.getLogger(FileHandleSceneController.class
//                        .getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                try {
//                    if (oos != null) {
//                        oos.close();
//
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(FileHandleSceneController.class
//                            .getName()).log(Level.SEVERE, null, ex);
//                }
//            }

        }
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void ShowRequestOnMouseClick(ActionEvent event) {
    


    System.out.println ("Heated");
        ObjectInputStream ois = null;

    
        try {
            AllowanceRequest allw;
        //FileInputStream fis = new FileInputStream("studObjects.bin");
        //ois = new ObjectInputStream(fis);
        ois = new ObjectInputStream(new FileInputStream("AllowanceRequests.bin"));

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

}
