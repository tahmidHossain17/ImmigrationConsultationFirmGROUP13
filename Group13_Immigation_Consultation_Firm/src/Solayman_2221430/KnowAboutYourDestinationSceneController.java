/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class KnowAboutYourDestinationSceneController implements Initializable {
    private String dataToPass;

    // Define a method to set data
    public void setDataToPass(String data) {
        this.dataToPass = data;
    }


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void usaButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("KnowAboutCountryScene.fxml"));
        
        
        Scene country = new Scene(node);
        
        
        
        Stage countryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        countryStage.setTitle("Know About USA");
        countryStage.setScene(country);
        countryStage.show();
    }

    @FXML
    private void chainaButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("KnowAboutCountryScene.fxml"));
        
        
        Scene country = new Scene(node);
        
        
        
        Stage countryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        countryStage.setTitle("Know About China");
        countryStage.setScene(country);
        countryStage.show();
    }

    @FXML
    private void malaysiaButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("KnowAboutCountryScene.fxml"));
        
        
        Scene country = new Scene(node);
        
        
        
        Stage countryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        countryStage.setTitle("Know About Malaysia");
        countryStage.setScene(country);
        countryStage.show();
    }

    @FXML
    private void canadaButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("KnowAboutCountryScene.fxml"));
        
        
        Scene country = new Scene(node);
        
        
        
        Stage countryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        countryStage.setTitle("Know About Canada");
        countryStage.setScene(country);
        countryStage.show();
    }

    @FXML
    private void australiaBittonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("KnowAboutCountryScene.fxml"));
        
        
        Scene country = new Scene(node);
        
        
        
        Stage countryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        countryStage.setTitle("Know About Australia");
        countryStage.setScene(country);
        countryStage.show();
    }
    
}
