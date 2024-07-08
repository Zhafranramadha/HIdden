package Login;

import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController{

    // private OpenScene openScene = new OpenScene();

    @FXML
    private Button create_Account;

    @FXML
    private Button button_login;

    @FXML
    private Button register_Button;

    @FXML
    private Button signout_button;

    @FXML
    private Button home_page_button;

    @FXML
    private Button history_page_button;

    @FXML
    private Button category_page_button;

    @FXML
    private Button add_destiButton;

    @FXML
    private Button button_signout;

    @FXML
    private Button settings_button;

    @FXML
    private TextField search_field;

    @FXML
    private TextField username_Field;

    @FXML
    private AnchorPane History1;

    @FXML
    private AnchorPane History2;

    @FXML
    private AnchorPane History3;

    @FXML
    private AnchorPane History4;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void ToScreen(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("treasure.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToRegister(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Login(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void LogOut(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToHistory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("history.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void SwitchToHomePage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToCategory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("category.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToSettings(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("settings.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SettingsToHomePage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToMountainCategory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("mountainCategory.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToBeachCategory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("beachCategory.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToForestCategory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("forestCategory.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToLakeCategory(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("lakeCategory.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToForestDescription(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("forestDescription.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToLakeDescription(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("lakeDescription.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToMountainDescription(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("mountainDescription.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ToBeachDescription(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("beachDescription.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
