package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import javafx.stage.Stage;

//Side 22
public class basicFXExample extends Application{
           public void start(Stage primaryStage) {
            // Create a button and place it in the scene
            Button btOK = new Button("OK");
            Scene scene = new Scene(btOK, 200, 250);
            primaryStage.setTitle("MyJavaFX"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage

    }
    public static void main(String[] args) {
        launch(args);
    }

}
