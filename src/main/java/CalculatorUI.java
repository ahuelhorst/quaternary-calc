import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CalculatorUI extends javafx.application.Application {
    TextField field = new TextField();
    ArrayList<Button> buttonArrayList = new ArrayList<>();
    String numOne;
    String numTwo;
    String operator;

    @Override
    public void start(Stage primaryStage) {

        field.setPrefSize(50, 70);
        BorderPane root = new BorderPane();
        TilePane tile = createTile(createAllButtons());
        root.setTop(field);
        root.setCenter(tile);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Button createButton(String operator){
        Button button = new Button(operator);
        button.setFont(new Font(30));
        button.setPrefSize(100,100);
        return button;
    }
    public ArrayList<Button> createAllButtons(){
        buttonArrayList.add(createButton("+"));
        EventHandler<ActionEvent> add = e -> {
            operator = "+";
            toggleButtons("disable");
            numOne = field.toString();
            field.clear();
        };
        buttonArrayList.get(0).setOnAction(add);
        buttonArrayList.add(createButton("-"));
        EventHandler<ActionEvent> subtract = e -> {
            operator = "-";
            toggleButtons("disable");
            numOne = field.toString();
            field.clear();
        };
        buttonArrayList.get(1).setOnAction(subtract);
        buttonArrayList.add(createButton("*"));
        EventHandler<ActionEvent> multiply = e -> {
            operator = "*";
            toggleButtons("disable");
            numOne = field.toString();
            field.clear();
        };
        buttonArrayList.get(2).setOnAction(multiply);
        buttonArrayList.add(createButton("/"));
        EventHandler<ActionEvent> divide = e -> {
            operator = "/";
            toggleButtons("disable");
            numOne = field.toString();
            field.clear();
        };
        buttonArrayList.get(0).setOnAction(divide);
        buttonArrayList.add(createButton("X\u00B2")); //Square
        buttonArrayList.add(createButton("\u221A")); //Square Root
        buttonArrayList.add(createButton("="));
        buttonArrayList.add(createButton("C"));
        EventHandler<ActionEvent> clear = e -> {
            field.clear();
            toggleButtons("enable");
        };
        buttonArrayList.get(7).setOnAction(clear);
        buttonArrayList.add(createButton("0"));
        EventHandler<ActionEvent> zero = e -> field.appendText("0");
        buttonArrayList.get(8).setOnAction(zero);
        buttonArrayList.add(createButton("1"));
        EventHandler<ActionEvent> one = e -> field.appendText("1");
        buttonArrayList.get(9).setOnAction(one);
        buttonArrayList.add(createButton("2"));
        EventHandler<ActionEvent> two = e -> field.appendText("2");
        buttonArrayList.get(10).setOnAction(two);
        buttonArrayList.add(createButton("3"));
        EventHandler<ActionEvent> three = e -> field.appendText("3");
        buttonArrayList.get(11).setOnAction(three);
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

    public void toggleButtons(String toggle) {
        if (toggle == "disable") {
            buttonArrayList.get(0).setDisable(true);
            buttonArrayList.get(1).setDisable(true);
            buttonArrayList.get(2).setDisable(true);
            buttonArrayList.get(3).setDisable(true);
            buttonArrayList.get(4).setDisable(true);
            buttonArrayList.get(5).setDisable(true);
        } else {
            buttonArrayList.get(0).setDisable(false);
            buttonArrayList.get(1).setDisable(false);
            buttonArrayList.get(2).setDisable(false);
            buttonArrayList.get(3).setDisable(false);
            buttonArrayList.get(4).setDisable(false);
            buttonArrayList.get(5).setDisable(false);
        }
    }
}
