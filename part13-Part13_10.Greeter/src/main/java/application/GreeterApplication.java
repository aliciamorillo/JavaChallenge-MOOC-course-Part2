package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        Label firstLabel = new Label("Enter your name and start");
        Button firstBtn = new Button("Start");
        TextField tField = new TextField();
        
        gridPane.add(firstLabel, 0, 0);
        gridPane.add(tField, 0, 1);
        gridPane.add(firstBtn, 0, 2);
        
        Scene firstScene = new Scene(gridPane, 300,180);
        
        gridPane.setPrefSize(300, 180);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        
        StackPane  secondPane = new StackPane();
        Label secondLabel = new Label();
        secondPane.getChildren().add(secondLabel);
        
        Scene seconScene = new Scene(secondPane,300,180);
        
        firstBtn.setOnAction((event) -> {
            secondLabel.setText("Welcome " + tField.getText() + "!");
            stage.setScene(seconScene);
        });
        
        stage.setScene(firstScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
