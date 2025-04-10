import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleMover extends Application {

    private Circle circle;
    private double x = 200;
    private double y = 200;
    private final double radius = 20;
    private final double moveAmount = 10;
    private Color[] colors = {Color.RED, Color.BLACK, Color.GREEN, Color.BLUE};
    private int colorIndex = 0;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        circle = new Circle(x, y, radius);
        circle.setFill(Color.BLUE);

        Button upButton = new Button("ზემოთ");
        upButton.setOnAction(e -> moveCircle(0, -moveAmount));
        upButton.setLayoutX(150);
        upButton.setLayoutY(20);

        Button downButton = new Button("ქვემოთ");
        downButton.setOnAction(e -> moveCircle(0, moveAmount));
        downButton.setLayoutX(150);
        downButton.setLayoutY(100);

        Button leftButton = new Button("მარცხნივ");
        leftButton.setOnAction(e -> moveCircle(-moveAmount, 0));
        leftButton.setLayoutX(50);
        leftButton.setLayoutY(60);

        Button rightButton = new Button("მარჯვნივ");
        rightButton.setOnAction(e -> moveCircle(moveAmount, 0));
        rightButton.setLayoutX(250);
        rightButton.setLayoutY(60);

        Button upLeftButton = new Button("ზემოთ-მარცხნივ");
        upLeftButton.setOnAction(e -> moveCircle(-moveAmount, -moveAmount));
        upLeftButton.setLayoutX(50);
        upLeftButton.setLayoutY(20);

        Button upRightButton = new Button("ზემოთ-მარჯვნივ");
        upRightButton.setOnAction(e -> moveCircle(moveAmount, -moveAmount));
        upRightButton.setLayoutX(250);
        upRightButton.setLayoutY(20);

        Button downLeftButton = new Button("ქვემოთ-მარცხნივ");
        downLeftButton.setOnAction(e -> moveCircle(-moveAmount, moveAmount));
        downLeftButton.setLayoutX(50);
        downLeftButton.setLayoutY(100);

        Button downRightButton = new Button("ქვემოთ-მარჯვნივ");
        downRightButton.setOnAction(e -> moveCircle(moveAmount, moveAmount));
        downRightButton.setLayoutX(250);
        downRightButton.setLayoutY(100);

        Button redButton = new Button("გაწითლება");
        redButton.setOnAction(e -> circle.setFill(Color.RED));
        redButton.setLayoutX(140);
        redButton.setLayoutY(140);

        Button colorCycleButton = new Button("ფერის შეცვლა");
        colorCycleButton.setOnAction(e -> changeCircleColor());
        colorCycleButton.setLayoutX(130);
        colorCycleButton.setLayoutY(180);

        root.getChildren().addAll(circle, upButton, downButton, leftButton, rightButton,
                upLeftButton, upRightButton, downLeftButton, downRightButton, redButton, colorCycleButton);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("წრის მართვა");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveCircle(double dx, double dy) {
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }

    private void changeCircleColor() {
        circle.setFill(colors[colorIndex]);
        colorIndex = (colorIndex + 1) % colors.length;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
