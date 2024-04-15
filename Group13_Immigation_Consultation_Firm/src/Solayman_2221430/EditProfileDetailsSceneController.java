/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class EditProfileDetailsSceneController implements Initializable {

    @FXML
    private DatePicker dateOfBirthDatePicker;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private ComboBox<String> nationalityComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passportNoTextField;
    
    ToggleGroup tg;
    Profile prf;
    @FXML
    private Label outputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        prf=new Profile();
        
        nationalityComboBox.getItems().addAll("Bengali","Indian","Russian","American");
        
        // TODO
    }    

    @FXML
    private void submitProfileButton(ActionEvent event) {
        String gender="";
        if (maleRadioButton.isSelected()){
            gender="Male";
        if (femaleRadioButton.isSelected()){
            gender="Female";
        
        }
        ObjectOutputStream oos=null;
        FileOutputStream fos=null;
        File f=null;
        
        prf=new Profile(nameTextField.getText(),phoneTextField.getText(),emailTextField.getText(),passportNoTextField.getText(),nationalityComboBox.getValue(),gender,dateOfBirthDatePicker.getValue());
        try{
            f=new File("profileInfo.bin");
            if (f.exists()){
            fos=new FileOutputStream(f,true);
            oos=new AppendableObjectOutputStream(fos);}
            else{
            fos=new FileOutputStream(f);
            oos=new ObjectOutputStream(fos);
            }
             oos.writeObject(prf);
             outputLabel.setText(prf.toString());
             oos.close();
        }
        catch(Exception ex){
        
        }
        }
    }

    @FXML
    private void saveAsPdfButton(ActionEvent event) {
     
         try {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
        File f = fc.showSaveDialog(null);
        
        if (f != null) {
            // Create a new PDF document
            PdfWriter pw = new PdfWriter(new FileOutputStream(f));
            PdfDocument pdf = new PdfDocument(pw);
            com.itextpdf.layout.Document doc = new com.itextpdf.layout.Document(pdf, PageSize.A4);
            
            // Add content to the PDF document
            String name = nameTextField.getText();
            String phone = phoneTextField.getText();
            String email = emailTextField.getText();
            String passportno = passportNoTextField.getText();
            String nationality = nationalityComboBox.getValue();
            LocalDate date=dateOfBirthDatePicker.getValue();
            
            // Add data to the PDF
            doc.add(new Paragraph("Profile")
   
                .setFontSize(40));
            doc.add(new Paragraph("Date : " + date  +"\n"));
            doc.add(new Paragraph("Name : " + name  +"\n"));
            doc.add(new Paragraph("Phone : " + phone +"\n"));
            doc.add(new Paragraph("Email : " + email +"\n"));
            doc.add(new Paragraph("Passport NO : " + passportno +"\n"));
            doc.add(new Paragraph("Nationality : " + nationality +"\n"));
          
          
            // Close the document
            doc.close();
            
            // Show success message
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("PDF saved successfully.");
            successAlert.showAndWait();
        } else {
            // Show cancellation message
            Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
            cancelAlert.setContentText("Saving as PDF: cancelled!");
            cancelAlert.showAndWait();
        }
    } catch (Exception e) {
        // Show error message
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setContentText("Oops! Exception: " + e.toString() + " occurred.");
        errorAlert.showAndWait();
        e.printStackTrace();
    }

    }
    

    @FXML
    private void logoutButton(ActionEvent event) {
    }
    
}
