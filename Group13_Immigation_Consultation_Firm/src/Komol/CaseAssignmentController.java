/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author Komol
 */
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

    /**
     * Initializes the controller class.
     */
private Case currentCase;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize ComboBoxes
        initializeLegalAdvisorComboBox();
        casecategoriesdatepicker.getItems().addAll("Random","emergency","National Security","special");
    }

    private void initializeLegalAdvisorComboBox() {
        // Dummy list of lawyer names
        ArrayList<String> lawyerNames = getLawyerNamesFromFirm(); // Replace this with your actual method to get lawyer names

        // Add lawyer names to the ComboBox
        legaladvisorcombobox.getItems().addAll(lawyerNames);
    }

    // Dummy method to get lawyer names from the firm
    private ArrayList<String> getLawyerNamesFromFirm() {
        ArrayList<String> lawyerNames = new ArrayList<>();
        // Add lawyer names here (replace this with your actual implementation)
        lawyerNames.add("Komol");
        lawyerNames.add("Dip");
        lawyerNames.add("Tahmid");
        // Add more names as needed
        return lawyerNames;
    }   

    @FXML
    private void assignmentcaseonclick(ActionEvent event) {
        if (clientnametextfield.getText().isEmpty() || clientnumbertextfield.getText().isEmpty() ||
            casecategoriesdatepicker.getValue() == null || legaladvisorcombobox.getValue() == null ||
            assigndatedatepicker.getValue() == null) {
        // If any field is empty, show an alert
        showAlert(Alert.AlertType.ERROR, "Error", "Please fill in all fields.");
        return;
    }

    // Retrieve values from fields
    String clientName = clientnametextfield.getText();
    String clientNumber = clientnumbertextfield.getText();
    String caseCategory = casecategoriesdatepicker.getValue();
    String legalAdvisor = legaladvisorcombobox.getValue();
    LocalDate assignDate = assigndatedatepicker.getValue();

    // Create a new Case object
    currentCase = new Case(clientName, clientNumber, caseCategory, legalAdvisor, assignDate);

    // Write the current case to file
    currentCase.writeToFile("case.bin");

    // Show a success alert
    showAlert(Alert.AlertType.INFORMATION, "Success", "Case added successfully.");

    // Clear all fields
    clearFields();

    // You can perform further actions here if needed
}

// Method to clear all fields
private void clearFields() {
    clientnametextfield.clear();
    clientnumbertextfield.clear();
    casecategoriesdatepicker.getSelectionModel().clearSelection();
    legaladvisorcombobox.getSelectionModel().clearSelection();
    assigndatedatepicker.setValue(null);
}

// Method to show an alert
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

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();  
    }
    
}
