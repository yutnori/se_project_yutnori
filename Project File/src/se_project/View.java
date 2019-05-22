package se_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class View extends Application implements Observer{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("yut_board.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 932, 647));
        primaryStage.show();
    }

    @Override
    public void update(){

    }

    @Override
    public Subject getSubject(){
        return null;
    }

    @FXML
    private void startGameButtonClicked(ActionEvent event) {

    }

    @FXML
    private void rollYutButtonClicked(ActionEvent event) {

    }

    public static void main(String[] args) {
        YutnoriGame yutnoriGame = new YutnoriGame();
        launch(args);
    }

    @FXML
    private TextField playerNumInput;
    @FXML
    private TextField pieceNumInput;
    @FXML
    private Button startGame;
    @FXML
    private Button rollYut;
    @FXML
    private Label showPlayerTurn;
    @FXML
    private Label showInfo;
    @FXML
    private ListView yutList;
    @FXML
    private Circle square1;
    @FXML
    private Circle square1_1;
    @FXML
    private Circle square1_2;
    @FXML
    private Circle square1_3;
    @FXML
    private Circle square1_4;
    @FXML
    private Circle square1_5;
    @FXML
    private Circle square2;
    @FXML
    private Circle square2_1;
    @FXML
    private Circle square2_2;
    @FXML
    private Circle square2_3;
    @FXML
    private Circle square2_4;
    @FXML
    private Circle square2_5;
    @FXML
    private Circle square3;
    @FXML
    private Circle square3_1;
    @FXML
    private Circle square3_2;
    @FXML
    private Circle square3_3;
    @FXML
    private Circle square3_4;
    @FXML
    private Circle square3_5;
    @FXML
    private Circle square4;
    @FXML
    private Circle square4_1;
    @FXML
    private Circle square4_2;
    @FXML
    private Circle square4_3;
    @FXML
    private Circle square4_4;
    @FXML
    private Circle square4_5;
    @FXML
    private Circle square5;
    @FXML
    private Circle square5_1;
    @FXML
    private Circle square5_2;
    @FXML
    private Circle square5_3;
    @FXML
    private Circle square5_4;
    @FXML
    private Circle square5_5;
    @FXML
    private Circle square6;
    @FXML
    private Circle square6_1;
    @FXML
    private Circle square6_2;
    @FXML
    private Circle square6_3;
    @FXML
    private Circle square6_4;
    @FXML
    private Circle square6_5;
    @FXML
    private Circle square7;
    @FXML
    private Circle square8;
    @FXML
    private Circle square9;
    @FXML
    private Circle square10;
    @FXML
    private Circle square11;
    @FXML
    private Circle square12;
    @FXML
    private Circle square13;
    @FXML
    private Circle square14;
    @FXML
    private Circle square15;
    @FXML
    private Circle square16;
    @FXML
    private Circle square17;
    @FXML
    private Circle square18;
    @FXML
    private Circle square19;
    @FXML
    private Circle square20;
    @FXML
    private Circle square21;
    @FXML
    private Circle square22;
    @FXML
    private Circle square23;
    @FXML
    private Circle square24;
    @FXML
    private Circle square25;
    @FXML
    private Circle square26;
    @FXML
    private Circle square27;
    @FXML
    private Circle square28;
    @FXML
    private Circle square29;

}
