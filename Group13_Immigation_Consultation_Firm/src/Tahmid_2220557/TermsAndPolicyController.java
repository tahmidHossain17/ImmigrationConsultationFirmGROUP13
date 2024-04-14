/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class TermsAndPolicyController implements Initializable {

    @FXML
    private TextArea termsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     File file = new File("PrivacyPolicy.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            termsTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                
              
                termsTextArea.appendText(str+"\n");
                //outputTxtArea
            }
       }catch (FileNotFoundException ex) {
            Logger.getLogger(TermsAndPolicyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    }

