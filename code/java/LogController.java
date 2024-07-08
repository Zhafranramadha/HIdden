package Login;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// import untuk menangani format xml
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class LogController implements Initializable{
    @FXML
    private BorderPane loginForm;
    
    @FXML
    private TextField inputEmail;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private Button loginButton;

    @FXML
    private Button buttonSignUp;

    @FXML
    private Button buttonExit;

    
    @FXML
    private CheckBox login_select_show_Pass;

    @FXML
    private TextField login_show_Pass;

    

    // Import Bagian Openscene
    private OpenScene openScene = new OpenScene();
  

    // Bagian Login 
    @FXML
    public void adminLogi(ActionEvent event) {
        try {
            Alert alert;

            if (inputEmail.getText().isEmpty() || inputPassword.getText().isEmpty()) {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please enter your E-mail and Password");
                alert.showAndWait();
            } else {
                XStream xstream = new XStream(new StaxDriver());
                xstream.allowTypes(new Class[] { RegLog.class });

                RegLog loadedUser = (RegLog)  xstream.fromXML(new java.io.File("users.xml"));

                if (inputEmail.getText().equals(loadedUser.getEmail()) && inputPassword.getText().equals(loadedUser.getPassword())) {
                    // jika data user ditemukan di datUser
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Succesfully Login!");
                    alert.setHeaderText(null);
                    alert.setContentText("Welcome back! :)");
                    alert.showAndWait();

                    openScene.openScene("homescreen", loginButton);
                } else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Massage");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong E-mail or Password");
                    alert.showAndWait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        private Stage stage;
        private Scene scene;
        private Parent root;

        public void register(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Untuk keluar dari App
    @FXML   
    private void exit (ActionEvent event) {
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Quit");
    alert.setHeaderText(null);
    alert.setContentText("Are you sure want to quit Hidden Heaven? :(");

    ButtonType yesButton = new ButtonType("Yes");
    ButtonType noButton = new ButtonType("No");

    alert.getButtonTypes().setAll(yesButton, noButton);

    // Untuk memunculkan opsi yes dan no
    alert.showAndWait().ifPresent(response -> {
    if (response == yesButton) {
        System.out.println("See you again!");
        System.exit(0);

    } else if (response == noButton) {
        System.out.println(":)");
    }
    });

    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void change() {
        if (login_select_show_Pass.isSelected()) {
            login_show_Pass.setText(inputPassword.getText());
            login_show_Pass.setVisible(true);
            inputPassword.setVisible(false);
        } else{
            inputPassword.setText(login_show_Pass.getText());
            login_show_Pass.setVisible(false);
            inputPassword.setVisible(true);
        }
    }
}

