package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label helloworld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloworld.setText("Hello World!");
    }
}
