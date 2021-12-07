package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {

    @Override
    public void start(Stage stage) {
        VBox labelBar = new VBox();
        TextField textField = new TextField("");
        Button button = new Button("Update");
        Label thirdLabel = new Label();
        
        labelBar.getChildren().addAll(textField, button, thirdLabel);
        
        Scene view = new Scene(labelBar, 200, 100);
        button.setOnAction((event) -> {
            thirdLabel.setText(textField.getText());
        });
        
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
