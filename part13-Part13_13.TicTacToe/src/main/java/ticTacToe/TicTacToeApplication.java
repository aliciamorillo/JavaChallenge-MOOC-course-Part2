package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {

    private boolean state;
    private boolean finished;
    private Label turn;
    private Button[] buttons;
    
    public TicTacToeApplication(){
        this.state = true;
        this.finished = false;
        this.turn = new Label("Turn: X");
        this.buttons = new Button[9];
        for(int i = 0; i < 9; i++){
            buttons[i] = createButton();
        }
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setPrefSize(310, 350);
        turn.setFont(new Font(30.0));
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        
        grid.add(buttons[0], 1, 0);
        grid.add(buttons[1], 2, 0);
        grid.add(buttons[2], 3, 0);
        grid.add(buttons[3], 1, 1);
        grid.add(buttons[4], 2, 1);
        grid.add(buttons[5], 3, 1);
        grid.add(buttons[6], 1, 2);
        grid.add(buttons[7], 2, 2);
        grid.add(buttons[8], 3, 2);
        
        layout.setTop(turn);
        layout.setCenter(grid);
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();
    }

    private Button createButton() {
        Button button = new Button(" ");
        button.setFont(new Font("Monospaced", 40));
        button.setPrefSize(90, 90);
        
        button.setOnAction((event) -> {
                        if (finished) return;
            if (!button.getText().equals(" ")) return;

            if (state) {
                button.setText("X");
                turn.setText("Turn: O");
                state = false;
            } else {
                button.setText("O");
                turn.setText("Turn: X");
                state = true;
            }

            if (gameScratched() || gameWon()) {
                turn.setText("The end!");
                finished = true;
            }
        });
        
        return button;
    }

    private boolean gameScratched() {
        if (!buttons[0].getText().equals(" ") &&
            !buttons[1].getText().equals(" ") &&
            !buttons[2].getText().equals(" ") &&
            !buttons[3].getText().equals(" ") &&
            !buttons[4].getText().equals(" ") &&
            !buttons[5].getText().equals(" ") &&
            !buttons[6].getText().equals(" ") &&
            !buttons[7].getText().equals(" ") &&
            !buttons[8].getText().equals(" ")) {
            return true;
        }
        return false;
    }

    private boolean gameWon() {
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
                return true;
            }
        }
        if (!buttons[3].getText().equals(" ")) {
            if (buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())) {
                return true;
            }
        }
        if (!buttons[6].getText().equals(" ")) {
            if (buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        // text columns
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        if (!buttons[1].getText().equals(" ")) {
            if (buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        // test diagoals
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())) {
                return true;
            }
        }

        return false;
    }

}
