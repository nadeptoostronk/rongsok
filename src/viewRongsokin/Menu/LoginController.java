package viewRongsokin.Menu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button daftarButton;

    @FXML
    private Button loginButton;

    @FXML
    private ImageView logo;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> {
            try {
                Parent dashboardParent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
                Scene dashboardScene = new Scene(dashboardParent);
            
                Stage currentStage = (Stage) loginButton.getScene().getWindow();
                
                currentStage.setScene(dashboardScene);
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Menambahkan aksi klik pada tombol daftar
        daftarButton.setOnAction(event -> {
            try {
                Parent daftarParent = FXMLLoader.load(getClass().getResource("Daftar.fxml"));
                Scene daftarScene = new Scene(daftarParent);

                Stage currentStage = (Stage) daftarButton.getScene().getWindow();

                currentStage.setScene(daftarScene);
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
