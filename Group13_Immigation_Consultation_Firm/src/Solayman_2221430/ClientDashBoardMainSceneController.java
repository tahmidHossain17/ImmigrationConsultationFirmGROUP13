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
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ClientDashBoardMainSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openFixAppointmentSceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FixAppointmentScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openEligibilityToApplySceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EligibilityToApplyScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openBookAccomodationSceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookAccomodationScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openRequestForBookingATicketSceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RequestForBookingTicketScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openKnowAboutYourDestinationSceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("KnowABoutYourDestinationScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openReviewsSceneOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ReviewsScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void openApplyForBankSolvencySceneOnMouseClick(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ApplyForBankSolvencyScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void addProfileInfoButtonOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ApplyForBankSolvencyScene.fxml"));
        Parent parent = fxmlLoader.load();

    
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
//        stage.setTitle("Case");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();
    }

    @FXML
    private void logoutbuttononclick(ActionEvent event) {
    }
    
}
