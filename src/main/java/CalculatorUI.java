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
    private TextField field = new TextField();
    private ArrayList<Button> buttonArrayList = new ArrayList<>();
    private String numOne;
    private String numTwo;
    private int total;
    private String operator;
    private Main main = new Main();
    private Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) {

        field.setPrefSize(50, 70);
        BorderPane root = new BorderPane();
        TilePane tile = createTile(createAllButtons());
        root.setTop(field);
        root.setCenter(tile);
        Scene scene = new Scene(root, 431, 510);
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
        //add button
        buttonArrayList.add(createButton("+"));
        EventHandler<ActionEvent> add = e -> {
            operator = "+";
            toggleButtons("disable");
            numOne = field.getText();
            field.clear();
        };
        buttonArrayList.get(0).setOnAction(add);
        //subtract button
        buttonArrayList.add(createButton("-"));
        EventHandler<ActionEvent> subtract = e -> {
            operator = "-";
            toggleButtons("disable");
            numOne = field.getText();
            field.clear();
        };
        buttonArrayList.get(1).setOnAction(subtract);
        //multiply button
        buttonArrayList.add(createButton("*"));
        EventHandler<ActionEvent> multiply = e -> {
            operator = "*";
            toggleButtons("disable");
            numOne = field.getText();
            field.clear();
        };
        buttonArrayList.get(2).setOnAction(multiply);
        //divide button
        buttonArrayList.add(createButton("/"));
        EventHandler<ActionEvent> divide = e -> {
            operator = "/";
            toggleButtons("disable");
            numOne = field.getText();
            field.clear();
        };
        buttonArrayList.get(3).setOnAction(divide);
        //square button
        buttonArrayList.add(createButton("X\u00B2")); //Square
        EventHandler<ActionEvent> square = e -> {
            operator = "square";
            toggleButtons("enable");
            numOne = field.getText();
            field.clear();
            total = calc.square(numOne);
            field.setText(String.valueOf(total));
        };
        buttonArrayList.get(4).setOnAction(square);
        //square root button
        buttonArrayList.add(createButton("\u221A")); //Square Root
        EventHandler<ActionEvent> root = e -> {
            operator = "root";
            numOne = field.getText();
            field.clear();
            total = calc.squareRoot(numOne);
            if (total == 0){
                toggleButtons("all-disable");
                field.setText("Error");
            }
            else{
                field.setText(String.valueOf(total));
            }
        };
        buttonArrayList.get(5).setOnAction(root);
        //equals button
        buttonArrayList.add(createButton("="));
        EventHandler<ActionEvent> equals = e -> {
            toggleButtons("enable");
            numTwo = field.getText();
            field.clear();
            total = main.calculateExpression(numOne,operator,numTwo);
            field.setText(String.valueOf(total));
        };
        buttonArrayList.get(6).setOnAction(equals);
        //clear button
        buttonArrayList.add(createButton("C"));
        EventHandler<ActionEvent> clear = e -> {
            field.clear();
            toggleButtons("enable");
        };
        buttonArrayList.get(7).setOnAction(clear);
        // zero button
        buttonArrayList.add(createButton("0"));
        EventHandler<ActionEvent> zero = e -> field.appendText("0");
        buttonArrayList.get(8).setOnAction(zero);
        //one button
        buttonArrayList.add(createButton("1"));
        EventHandler<ActionEvent> one = e -> field.appendText("1");
        buttonArrayList.get(9).setOnAction(one);
        //two button
        buttonArrayList.add(createButton("2"));
        EventHandler<ActionEvent> two = e -> field.appendText("2");
        buttonArrayList.get(10).setOnAction(two);
        //three button
        buttonArrayList.add(createButton("3"));
        EventHandler<ActionEvent> three = e -> field.appendText("3");
        buttonArrayList.get(11).setOnAction(three);

        //bases
        buttonArrayList.add(createButton("b4"));
        buttonArrayList.get(12).setDisable(true);
        EventHandler<ActionEvent> base4 = e -> {
            buttonArrayList.get(12).setDisable(true);
            buttonArrayList.get(13).setDisable(false);
            toggleButtons("enable");
            numTwo = field.getText();
            field.clear();
            total = Convertor.revert(Integer.parseInt(numTwo));
            field.setText(String.valueOf(total));
        };
        buttonArrayList.get(12).setOnAction(base4);

        buttonArrayList.add(createButton("b10"));
        EventHandler<ActionEvent> base10 = e -> {
            buttonArrayList.get(12).setDisable(false);
            buttonArrayList.get(13).setDisable(true);
            toggleButtons("all-disable");
            numTwo = field.getText();
            field.clear();
            total = Convertor.convert(numTwo);
            field.setText(String.valueOf(total));
        };
        buttonArrayList.get(13).setOnAction(base10);
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
        if (toggle.equals("disable")) {
            buttonArrayList.get(0).setDisable(true);
            buttonArrayList.get(1).setDisable(true);
            buttonArrayList.get(2).setDisable(true);
            buttonArrayList.get(3).setDisable(true);
            buttonArrayList.get(4).setDisable(true);
            buttonArrayList.get(5).setDisable(true);
        } else if (toggle.equals("all-disable")) {
            buttonArrayList.get(0).setDisable(true);
            buttonArrayList.get(1).setDisable(true);
            buttonArrayList.get(2).setDisable(true);
            buttonArrayList.get(3).setDisable(true);
            buttonArrayList.get(4).setDisable(true);
            buttonArrayList.get(5).setDisable(true);
            buttonArrayList.get(6).setDisable(true);
            buttonArrayList.get(8).setDisable(true);
            buttonArrayList.get(9).setDisable(true);
            buttonArrayList.get(10).setDisable(true);
            buttonArrayList.get(11).setDisable(true);
        } else {
            buttonArrayList.get(0).setDisable(false);
            buttonArrayList.get(1).setDisable(false);
            buttonArrayList.get(2).setDisable(false);
            buttonArrayList.get(3).setDisable(false);
            buttonArrayList.get(4).setDisable(false);
            buttonArrayList.get(5).setDisable(false);
            buttonArrayList.get(6).setDisable(false);
            buttonArrayList.get(7).setDisable(false);
            buttonArrayList.get(8).setDisable(false);
            buttonArrayList.get(9).setDisable(false);
            buttonArrayList.get(10).setDisable(false);
            buttonArrayList.get(11).setDisable(false);
        }
    }
}
