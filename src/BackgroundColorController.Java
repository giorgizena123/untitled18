import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.Random;

public class BackgroundColorController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    public void changeBackground() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        String backgroundColor = String.format("-fx-background-color: rgb(%d, %d, %d);", red, green, blue);
        anchorPane.setStyle(backgroundColor);
    }
}
