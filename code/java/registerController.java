package Login;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class registerController implements Initializable{

   
    @FXML
    private TextField inputNama;

    @FXML
    private TextField inputEmail;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private Button buttonCreateAccount;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException{
    root = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
 
    // Import Bagian Openscene 
    private OpenScene openScene = new OpenScene();

    // Bagian Register
    @FXML
    private void createAccount(ActionEvent event) {
        // Membuat variabel
        String name = inputNama.getText();
        String email = inputEmail.getText();
        String password = inputPassword.getText();

        try {
            // Validasi agar semua data terisi 
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Massage");
                alert.setHeaderText(null);
                alert.setContentText("All fields must be filled in");
                alert.showAndWait();
            } else {
                RegLog newUser = new RegLog(name, email, password);

                XStream xstream = new XStream(new StaxDriver());
                xstream.allowTypes(new Class[] {RegLog.class});

                String xml = xstream.toXML(newUser);

                try {
                    // Menyimpan data ke file XML
                    String filePath = "users.xml";
                    FileOutputStream output = new FileOutputStream(filePath);
                    output.write(xml.getBytes());   
                    output.close();

                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Congratulations!");
                    alert.setHeaderText(null);
                    alert.setContentText("Account Created!");
                    alert.showAndWait();

                    openScene.openScene("LOGIN", buttonCreateAccount);
                }catch (IOException e){
                    System.out.println("Failed to save the file");
                    System.exit(0);
                }
            } 
                
        } catch (Exception e){
            e.printStackTrace();
        }

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
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}

