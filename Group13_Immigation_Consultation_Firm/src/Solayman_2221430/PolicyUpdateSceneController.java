/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.FileOutputStream;
import java.io.IOException;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class PolicyUpdateSceneController implements Initializable {

    @FXML
    private TextField affiliatedUniTextField;
    @FXML
    private TextField affiliatedOrgTextField;
    @FXML
    private TextField touristPlacesTextField;
    @FXML
    private ComboBox<String> ieltsComboBox;
    @FXML
    private ComboBox<String> countryComboBox;
    @FXML
    private ComboBox<String> satComboBox;
    @FXML
    private ComboBox<String> greComboBox;
    @FXML
    private ComboBox<String> languageIssueComboBox;
    @FXML
    private ComboBox<String> spouseVisaRateComboBox;
    @FXML
    private ComboBox<String> minimumEducationComboBox;
    @FXML
    private TextField skillsTextField;

    ArrayList<PolicyUpdate> policyList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        countryComboBox.getItems().addAll("USA","China","Audtralia","Malaysia","Canada");
        ieltsComboBox.getItems().addAll("below 5","6","7","8","9","N/A");
        satComboBox.getItems().addAll("1200-1250","1250-1300","1300-1350","1350-1400","1400-1500","1500+","N/A");
        greComboBox.getItems().addAll("260-280","280-300","300-320","320-340");
        languageIssueComboBox.getItems().addAll("English is enough","Native Language is needed");
        spouseVisaRateComboBox.getItems().addAll("Below 40%","50%","60%","70%","80%+");
        minimumEducationComboBox.getItems().addAll("SSC","O-levels","HSC","A-levels","BSC","BA","Bcom");
        
    }    


    @FXML
    private void backToDashboardOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("ImmigrationProcessingOfficerMainDashboard.fxml"));
        Scene dashboardScene = new Scene(node);
        
        
        Stage mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        mainStage.setScene(dashboardScene);
        mainStage.show();
        
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
        
        try{
                
                FileOutputStream fos= new FileOutputStream("PolicyUpdatesFromImmigrationOfficer.bin",true);
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                for(PolicyUpdate i:policyList){
                
                    oos.writeObject(i);
                    
                }
                oos.close();
                
            }
            catch(IOException e){}
    }

    @FXML
    private void addButtonOnMouseClick(ActionEvent event) {
        policyList = new ArrayList<PolicyUpdate>();
        policyList.add(new PolicyUpdate(countryComboBox.getValue(),spouseVisaRateComboBox.getValue(),affiliatedUniTextField.getText(),affiliatedOrgTextField.getText(),touristPlacesTextField.getText(),ieltsComboBox.getValue(),satComboBox.getValue(),greComboBox.getValue(),languageIssueComboBox.getValue(),skillsTextField.getText(),minimumEducationComboBox.getValue()));
        
        
        
        
    }
    
    
}
