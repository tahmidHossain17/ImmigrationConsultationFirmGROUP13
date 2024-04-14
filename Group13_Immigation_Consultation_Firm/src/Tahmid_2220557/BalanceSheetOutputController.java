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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class BalanceSheetOutputController implements Initializable {

    @FXML
    private Label monthLabel;
    @FXML
    private Label assetLabel;
    @FXML
    private Label LiabitlitiesLabel;
    @FXML
    private Label OELabel;
    @FXML
    private Label assetFinal;
    @FXML
    private Label OEfinalLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Balance s;
        ObjectInputStream ois = null;
        try {
            //FileInputStream fis = new FileInputStream("studObjects.bin");
            //ois = new ObjectInputStream(fis);
            ois = new ObjectInputStream(new FileInputStream("balancerecord.bin"));

//            outputTxtArea.setText(null);

            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while (true) {
                System.out.println("helo");
                s = (Balance) ois.readObject();
                System.out.println(s.toString());
                monthLabel.setText("As at "+s.getMonth()+",2024");
                assetLabel.setText(Integer.toString(s.getAsset()));
                LiabitlitiesLabel.setText(Integer.toString(s.getLiability()));
                OELabel.setText(Integer.toString(s.getOE()));
                OEfinalLabel.setText(Integer.toString(s.getOE()));
                assetFinal.setText(Float.toString(s.totalAsset()));
                
                
                
                
//                requestTableView.getItems().add(s);
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

        
        // TODO
    }    
    
}
