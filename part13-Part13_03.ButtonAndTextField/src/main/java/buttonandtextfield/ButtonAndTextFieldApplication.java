package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;


public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start (Stage stage) {
        Button button = new Button("Button");
        TextField textField = new TextField();
        Pane pane = new Pane();
        
        pane.getChildren().add(button);
        pane.getChildren().add(textField);
        
        button.setLayoutX(100);
        button.setLayoutY(100);
        textField.setLayoutX(250);
        textField.setLayoutY(250);
        Scene view = new Scene(pane, 500, 500);
        
        stage.setScene(view);
        stage.show();
    
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
