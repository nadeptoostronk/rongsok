package viewRongsokin.Menu;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DaftarController {

    @FXML
    private Button simpanButton;

    @FXML
    private TextField tfNama;

    @FXML
    private TextField tfNama1;

    @FXML
    private TextField tfNama11;

    @FXML
    private TextField tfNama12;

    @FXML
    private TextField tfNama2;

    @FXML
    private TextField tfNama3;

    @FXML
    private void handleSimpanButton(ActionEvent event) {
        // Simpan data seller ke database atau lakukan tindakan lain yang diperlukan

        // Kembali ke halaman login
        try {
            // Load file FXML Login.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/viewRongsokin/Menu/Login.fxml"));
            Parent loginRoot = loader.load();
            Scene loginScene = new Scene(loginRoot);

            Stage stage = (Stage) simpanButton.getScene().getWindow();
            
            stage.setScene(loginScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
