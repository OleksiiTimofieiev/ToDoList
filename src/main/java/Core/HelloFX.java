package Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Core.fxml"));
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Set some tasks ;)");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
//        root.getChildren().add(greeting);

        primaryStage.setTitle("ToDoListApp");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}