package Komol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;



import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.stage.Stage;




public class ConsultantDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void applicationformreviewbuttononclick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("application_form_review.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("view");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
         
        
    }

    private void clientcurrentstatusbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Client_current_status.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("view");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
    
    }

    private void allowancerequestbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Allowance Request.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Allowance");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
        
    }

    private void clientreviewbuttonclick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("client Review.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Review");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    private void complainitbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Complain IT.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Complain");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
        
    }

    private void updatetermsandpolicybuttononclick(ActionEvent event)throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Update terms and feedback.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("update");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
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

    private Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    



    private void universitylistbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("University List Review.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("university");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show(); 
    }

    private void appointmentchackingbuttononclick(ActionEvent event)  throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("appointmentchacking.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("Appointment");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show(); 
    }

    @FXML
    private void openFixAppointmentSceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openEligibilityToApplySceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openBookAccomodationSceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openRequestForBookingATicketSceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openKnowAboutYourDestinationSceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openReviewsSceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void openApplyForBankSolvencySceneOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void addProfileInfoButtonOnMouseClick(ActionEvent event) {
    }

    
    
}
