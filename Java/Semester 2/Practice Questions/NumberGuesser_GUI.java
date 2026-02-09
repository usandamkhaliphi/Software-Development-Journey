import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NumberGuesserGUI extends Application {
    private int randomNumber;
    private int attempts;

    @Override
    public void start(Stage primaryStage) {
        randomNumber = (int) (Math.random() * 100) + 1; // 1–100
        attempts = 0;

        Label titleLabel = new Label("🎯 Number Guessing Game");
        Label feedbackLabel = new Label("Guess a number between 1 and 100:");
        TextField guessInput = new TextField();
        guessInput.setPromptText("Enter your guess");
        Button guessButton = new Button("Submit Guess");
        Label resultLabel = new Label();

        guessButton.setOnAction(e -> {
            String input = guessInput.getText();
            try {
                int guess = Integer.parseInt(input);
                attempts++;

                if (guess < randomNumber) {
                    resultLabel.setText("Too low! Try again.");
                } else if (guess > randomNumber) {
                    resultLabel.setText("Too high! Try again.");
                } else {
                    resultLabel.setText("🎉 Correct! You guessed it in " + attempts + " attempts!");
                    guessButton.setDisable(true);
                }

            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
            guessInput.clear();
        });

        VBox layout = new VBox(10, titleLabel, feedbackLabel, guessInput, guessButton, resultLabel);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-font-size: 14;");
        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setTitle("Number Guessing Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
