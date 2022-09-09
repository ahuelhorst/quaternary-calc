import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CalculatorUI extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) {
        TextField field = new TextField();
        field.setPrefSize(50, 70);
        BorderPane root = new BorderPane();
        TilePane tile = createTile(createAllButtons());
        root.setTop(field);
        root.setCenter(tile);
        Scene scene = new Scene(root, 280,370);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Button createButton(String operator){
        Button button = new Button(operator);
        button.setFont(new Font(30));
        button.setPrefSize(50,50);
        return button;
    }
    public ArrayList<Button> createAllButtons(){
        ArrayList<Button> buttonArrayList = new ArrayList<>();
        buttonArrayList.add(createButton("+"));
        buttonArrayList.add(createButton("-"));
        buttonArrayList.add(createButton("*"));
        buttonArrayList.add(createButton("/"));
        buttonArrayList.add(createButton("S"));
        buttonArrayList.add(createButton("R"));
        buttonArrayList.add(createButton("="));
        buttonArrayList.add(createButton("C"));
        buttonArrayList.add(createButton("0"));
        buttonArrayList.add(createButton("1"));
        buttonArrayList.add(createButton("2"));
        buttonArrayList.add(createButton("3"));
        return buttonArrayList;
    }
    public TilePane createTile(ArrayList<Button> buttonList){
        TilePane tile = new TilePane();
        tile.setHgap(10);
        tile.setVgap(10);
        for(Button button: buttonList){
            tile.getChildren().add(button);
        }
        return tile;
    }
}
