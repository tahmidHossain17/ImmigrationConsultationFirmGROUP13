/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CaseAssignmentController implements Initializable {

    @FXML
    private TextField clientnametextfield;
    @FXML
    private TextField clientnumbertextfield;
    @FXML
    private ComboBox<String> casecategoriesdatepicker;
    @FXML
    private ComboBox<String> legaladvisorcombobox;
    @FXML
    private DatePicker assigndatedatepicker;


private Case currentCase;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        initializeLegalAdvisorComboBox();
        casecategoriesdatepicker.getItems().addAll("Random","emergency","National Security","special");
    }

    private void initializeLegalAdvisorComboBox() {

        ArrayList<String> lawyerNames = getLawyerNamesFromFirm(); 
        legaladvisorcombobox.getItems().addAll(lawyerNames);
    }

    private ArrayList<String> getLawyerNamesFromFirm() {
        ArrayList<String> lawyerNames = new ArrayList<>();
        lawyerNames.add("Komol");
        lawyerNames.add("Dip");
        lawyerNames.add("Tahmid");
        return lawyerNames;
    }   

@FXML
private void assignmentcaseonclick(ActionEvent event) {
    File file = null;
    FileOutputStream fileOutputStream = null;
    DataOutputStream dataOutputStream = null;

    try {
        file = new File("case.bin");
        fileOutputStream = new FileOutputStream(file);
        dataOutputStream = new DataOutputStream(fileOutputStream);

        if (clientnametextfield.getText().isEmpty() || clientnumbertextfield.getText().isEmpty() ||
            casecategoriesdatepicker.getValue() == null || legaladvisorcombobox.getValue() == null ||
            assigndatedatepicker.getValue() == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please fill in all fields.");
            return;
        }

        String clientName = clientnametextfield.getText();
        String clientNumber = clientnumbertextfield.getText();
        String caseCategory = casecategoriesdatepicker.getValue();
        String legalAdvisor = legaladvisorcombobox.getValue();
        LocalDate assignDate = assigndatedatepicker.getValue();

        dataOutputStream.writeUTF(clientName);
        dataOutputStream.writeUTF(clientNumber);
        dataOutputStream.writeUTF(caseCategory);
        dataOutputStream.writeUTF(legalAdvisor);
        dataOutputStream.writeLong(assignDate.toEpochDay());

        showAlert(Alert.AlertType.INFORMATION, "Success", "Case added successfully.");

    } catch (IOException ex) {
        Logger.getLogger(CaseAssignmentController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(CaseAssignmentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    clearFields();
}

private void clearFields() {
    clientnametextfield.clear();
    clientnumbertextfield.clear();
    casecategoriesdatepicker.getSelectionModel().clearSelection();
    legaladvisorcombobox.getSelectionModel().clearSelection();
    assigndatedatepicker.setValue(null);
}

private void showAlert(Alert.AlertType alertType, String title, String content) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    alert.showAndWait();
}

    @FXML
    private void logoutbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mainPKG/Login.fxml"));
        Parent parent = fxmlLoader.load();

        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();  
    }
    
}
