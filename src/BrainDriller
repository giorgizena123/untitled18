import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;

public class BrainDriller extends Application {
    private Button clickMeButton;
    private StackPane root;
    private Random random = new Random();
    private double sceneWidth;
    private double sceneHeight;
    private final double buttonWidth = 100;
    private final double buttonHeight = 40;

    @Override
    public void start(Stage primaryStage) {
        clickMeButton = new Button("Click me");
        clickMeButton.setOnAction(e -> jumpButton());

        root = new StackPane(clickMeButton);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("ტვინის საბურღი");
        primaryStage.setScene(scene);
        primaryStage.show();


        scene.widthProperty().addListener((obs, oldVal, newVal) -> sceneWidth = newVal.doubleValue());
        scene.heightProperty().addListener((obs, oldVal, newVal) -> sceneHeight = newVal.doubleValue());
        sceneWidth = scene.getWidth();
        sceneHeight = scene.getHeight();
    }

    private void jumpButton() {
        double maxX = sceneWidth - buttonWidth;
        double maxY = sceneHeight - buttonHeight;

        double newX = random.nextDouble() * maxX;
        double newY = random.nextDouble() * maxY;

        TranslateTransition transition = new TranslateTransition(Duration.millis(200), clickMeButton);
        transition.setToX(newX - clickMeButton.getTranslateX());
        transition.setToY(newY - clickMeButton.getTranslateY());
        transition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
