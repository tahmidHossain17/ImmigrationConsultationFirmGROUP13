
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class ClientDashBoardController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label phoneNumberLabell;
    @FXML
    private Label emailLabel;
    @FXML
    private ImageView imageView;

    Stage mainStage;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameLabel.setText(null);
        phoneNumberLabell.setText(null);
        emailLabel.setText(null);
        
        
        
    }    

    @FXML
    private void addProfileInfoButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("EditProfileDetailsScene.fxml"));
        Scene editProfile = new Scene(node);
        
        mainStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        mainStage.setTitle("Edit Profile");
        mainStage.setScene(editProfile);
        mainStage.show();
        
        
    }

    @FXML
    private void logOutButtonOnMouseClick(ActionEvent event) {
    }
    
}
