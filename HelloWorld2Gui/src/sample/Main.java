package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import org.junit.Test;


public class Main extends Application {




    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("This is my own title!");
        Button button = new Button();
        button.setText("Click me!");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
