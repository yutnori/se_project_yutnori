package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

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
    private TextField playerNumInput;
    @FXML
    private TextField pieceNumInput;

    @FXML
    private void initialize() {
        // 연락처 테이블의 두 열을 초기화한다.
        // firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        // lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
}
