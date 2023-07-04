package viewRongsokin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Rongsokin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load file FXML untuk halaman login
            Parent root = FXMLLoader.load(getClass().getResource("Menu/Login.fxml"));
            Scene scene = new Scene(root);

            // Mengatur scene pada stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Aplikasi Rongsokin");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
