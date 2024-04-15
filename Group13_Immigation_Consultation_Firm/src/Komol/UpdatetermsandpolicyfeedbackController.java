/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class UpdatetermsandpolicyfeedbackController implements Initializable {

    @FXML
    private TextArea TextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("PrivacyPolicy.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            TextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                
              
                TextArea.appendText(str+"\n");
                //outputTxtArea
            }
       }catch (FileNotFoundException ex) {
            Logger.getLogger(UpdatetermsandpolicyfeedbackController.class.getName()).log(Level.SEVERE, null, ex);
        
    
}
        // TODO
    }    

    @FXML
    private void logoutbuttononclick(ActionEvent event)throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mainPKG/Login.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();  
    }

    @FXML
    private void loadbuttononclick(ActionEvent event) {
    }

    @FXML
    private void backbuttononclick(ActionEvent event) {
    }
    
}
