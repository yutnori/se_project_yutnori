package se_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private YutnoriModel yutnoriModel = new YutnoriModel();
    private Alert alert;

    ArrayList<ArrayList<Circle>> squaresView = new ArrayList<>();
    //public Main view;                     // 현재 필요 없다고 판단됨 -성현-

    /**
     * 생성자.
     * initialize() 메서드 이전에 호출된다.
     */
    // 현재 필요 없다고 판단됨 -성현-
    //public Controller(Main view, YutnoriModel yutnoriModel) {
    //    this.yutnoriModel = yutnoriModel;
    //    this.view = view;
    //}

    /**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */

    /**
     * 참조를 다시 유지하기 위해 메인 애플리케이션이 호출한다.
     *
     * @param yutnoriModel
     */
    // 필요 없다고 판단됨 -성현-
    //public void setView(YutnoriModel yutnoriModel) {
    //    this.yutnoriModel = yutnoriModel;

        // 테이블에 observable 리스트 데이터를 추가한다.
        // personTable.setItems(mainApp.getPersonData());
    //}

    @FXML
    private TextField playerNumInput;
    @FXML
    private TextField pieceNumInput;
    @FXML
    private Button startGame;
    @FXML
    private Label pieceNumOnBoard;
    @FXML
    private Label pieceNumRemaining;
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
    private Circle square7_1;
    @FXML
    private Circle square7_2;
    @FXML
    private Circle square7_3;
    @FXML
    private Circle square7_4;
    @FXML
    private Circle square7_5;
    @FXML
    private Circle square8;
    @FXML
    private Circle square8_1;
    @FXML
    private Circle square8_2;
    @FXML
    private Circle square8_3;
    @FXML
    private Circle square8_4;
    @FXML
    private Circle square8_5;
    @FXML
    private Circle square9;
    @FXML
    private Circle square9_1;
    @FXML
    private Circle square9_2;
    @FXML
    private Circle square9_3;
    @FXML
    private Circle square9_4;
    @FXML
    private Circle square9_5;
    @FXML
    private Circle square10;
    @FXML
    private Circle square10_1;
    @FXML
    private Circle square10_2;
    @FXML
    private Circle square10_3;
    @FXML
    private Circle square10_4;
    @FXML
    private Circle square10_5;
    @FXML
    private Circle square11;
    @FXML
    private Circle square11_1;
    @FXML
    private Circle square11_2;
    @FXML
    private Circle square11_3;
    @FXML
    private Circle square11_4;
    @FXML
    private Circle square11_5;
    @FXML
    private Circle square12;
    @FXML
    private Circle square12_1;
    @FXML
    private Circle square12_2;
    @FXML
    private Circle square12_3;
    @FXML
    private Circle square12_4;
    @FXML
    private Circle square12_5;
    @FXML
    private Circle square13;
    @FXML
    private Circle square13_1;
    @FXML
    private Circle square13_2;
    @FXML
    private Circle square13_3;
    @FXML
    private Circle square13_4;
    @FXML
    private Circle square13_5;
    @FXML
    private Circle square14;
    @FXML
    private Circle square14_1;
    @FXML
    private Circle square14_2;
    @FXML
    private Circle square14_3;
    @FXML
    private Circle square14_4;
    @FXML
    private Circle square14_5;
    @FXML
    private Circle square15;
    @FXML
    private Circle square15_1;
    @FXML
    private Circle square15_2;
    @FXML
    private Circle square15_3;
    @FXML
    private Circle square15_4;
    @FXML
    private Circle square15_5;
    @FXML
    private Circle square16;
    @FXML
    private Circle square16_1;
    @FXML
    private Circle square16_2;
    @FXML
    private Circle square16_3;
    @FXML
    private Circle square16_4;
    @FXML
    private Circle square16_5;
    @FXML
    private Circle square17;
    @FXML
    private Circle square17_1;
    @FXML
    private Circle square17_2;
    @FXML
    private Circle square17_3;
    @FXML
    private Circle square17_4;
    @FXML
    private Circle square17_5;
    @FXML
    private Circle square18;
    @FXML
    private Circle square18_1;
    @FXML
    private Circle square18_2;
    @FXML
    private Circle square18_3;
    @FXML
    private Circle square18_4;
    @FXML
    private Circle square18_5;
    @FXML
    private Circle square19;
    @FXML
    private Circle square19_1;
    @FXML
    private Circle square19_2;
    @FXML
    private Circle square19_3;
    @FXML
    private Circle square19_4;
    @FXML
    private Circle square19_5;
    @FXML
    private Circle square20;
    @FXML
    private Circle square20_1;
    @FXML
    private Circle square20_2;
    @FXML
    private Circle square20_3;
    @FXML
    private Circle square20_4;
    @FXML
    private Circle square20_5;
    @FXML
    private Circle square21;
    @FXML
    private Circle square21_1;
    @FXML
    private Circle square21_2;
    @FXML
    private Circle square21_3;
    @FXML
    private Circle square21_4;
    @FXML
    private Circle square21_5;
    @FXML
    private Circle square22;
    @FXML
    private Circle square22_1;
    @FXML
    private Circle square22_2;
    @FXML
    private Circle square22_3;
    @FXML
    private Circle square22_4;
    @FXML
    private Circle square22_5;
    @FXML
    private Circle square23;
    @FXML
    private Circle square23_1;
    @FXML
    private Circle square23_2;
    @FXML
    private Circle square23_3;
    @FXML
    private Circle square23_4;
    @FXML
    private Circle square23_5;
    @FXML
    private Circle square24;
    @FXML
    private Circle square24_1;
    @FXML
    private Circle square24_2;
    @FXML
    private Circle square24_3;
    @FXML
    private Circle square24_4;
    @FXML
    private Circle square24_5;
    @FXML
    private Circle square25;
    @FXML
    private Circle square25_1;
    @FXML
    private Circle square25_2;
    @FXML
    private Circle square25_3;
    @FXML
    private Circle square25_4;
    @FXML
    private Circle square25_5;
    @FXML
    private Circle square26;
    @FXML
    private Circle square26_1;
    @FXML
    private Circle square26_2;
    @FXML
    private Circle square26_3;
    @FXML
    private Circle square26_4;
    @FXML
    private Circle square26_5;
    @FXML
    private Circle square27;
    @FXML
    private Circle square27_1;
    @FXML
    private Circle square27_2;
    @FXML
    private Circle square27_3;
    @FXML
    private Circle square27_4;
    @FXML
    private Circle square27_5;
    @FXML
    private Circle square28;
    @FXML
    private Circle square28_1;
    @FXML
    private Circle square28_2;
    @FXML
    private Circle square28_3;
    @FXML
    private Circle square28_4;
    @FXML
    private Circle square28_5;
    @FXML
    private Circle square29;
    @FXML
    private Circle square29_1;
    @FXML
    private Circle square29_2;
    @FXML
    private Circle square29_3;
    @FXML
    private Circle square29_4;
    @FXML
    private Circle square29_5;


    @FXML
    private void startGameButtonClicked(ActionEvent event) { // 숫자인 입력값일때
        String inputPlayerNumTextField = playerNumInput.getText();
        String inputPieceNumTextField = pieceNumInput.getText();
        ObservableList<String> yutListElement = FXCollections.observableArrayList();

        try {
            int tempPlayerNum = Integer.parseInt(inputPlayerNumTextField);
            int tempPieceNum = Integer.parseInt(inputPieceNumTextField);
            if(tempPlayerNum < 2 || tempPlayerNum > 4 || (tempPieceNum<2 || tempPieceNum > 5)){
                /* 플레이어 수와 말의 수의 범위를 벗어날 때 */
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("플레이어 수는 2에서 4 사이의 수로 입력하세요." +
                        "\n말의 수는 2에서 5 사이의 수로 입력하세요");
                alert.setHeaderText(null);
                alert.show();
                playerNumInput.setText("");
                pieceNumInput.setText("");
            }
            else {
                /* 정상적으로 진행될 때 */
                yutnoriModel.startGame(tempPlayerNum, tempPieceNum);
                playerNumInput.setDisable(true);
                pieceNumInput.setDisable(true);
                startGame.setDisable(true);
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Roll Yut");
                alert.setContentText("플레이어 1 순서입니다. 윷을 던져주세요!");
                alert.setHeaderText(null);
                alert.show();
                pieceNumRemaining.setText(Integer.toString(tempPieceNum * tempPlayerNum));
                yutList.setItems(yutListElement);

                squaresView.get(0).get(0).setVisible(true);       // 첫번째 square를 보이게 설정하고
                yutnoriModel.playerNum = tempPlayerNum;           // 모델에다 플레이어, 말의 수 설정
                yutnoriModel.pieceNum = tempPieceNum;
                for(int i = 0; i < tempPlayerNum; i++){
                    yutnoriModel.playingPlayer.add(new Player()); // 모델에다 플레이어 수만큼 new
                }
                for(int i = 0; i < tempPieceNum; i++){            // 모델에다 플레이서 말의 수만큼 new

                }
                (yutnoriModel.board.squares)[1].pieces = 1;
            }



        } catch (NumberFormatException e) { // 숫자가 아닌 입력값일때
            // Alert 유효한 숫자를 입력하세요
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("숫자로 다시 입력하시오");
            alert.setHeaderText(null);
            alert.show();
            playerNumInput.setText("");
            pieceNumInput.setText("");
        }
    }

    @FXML
    private void rollYutButtonClicked(ActionEvent event) {

        rollYut.setDisable(true);
        String[] yutResultList = {"빽도","도","개","걸","윷","모"};
        System.out.println(("윷 던지기 버튼 클릭"));
        int yutResult = yutnoriModel.rollYut();
        yutList.getItems().add(yutResultList[yutResult]);
        if(yutResult == 4 | yutResult == 5) rollYut.setDisable(false);

    }

    @FXML
    private void listViewSetOnMouseClicked(MouseEvent event){

        String yutType = yutList.getSelectionModel().getSelectedItem().toString();
        int moveDistance = 3;
        int pieceStart = 1;
        squaresView.get(1 + 3);
        for(int i = 0; i < (yutnoriModel.board.squares)[1].pieces; i++){ // 원래 있던 square의 circle들을 안보이게
            squaresView.get(0).get(i).setVisible(false);
        }
        yutnoriModel.board.movePiece(1, 3);
        for(int i = 0; i < (yutnoriModel.board.squares)[1 + 3].pieces; i++){ // 도착 square의 circle들을 보이게
            squaresView.get(1 + 3).get(i).setVisible(true);
        }
    }

    @FXML
    private void rgergdrgdr(ActionEvent event){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i = 0; i < 29; i++){
            squaresView.add(new ArrayList<Circle>());
            for(int j = 0; j < 5; j++){
                if(i == 0){
                    squaresView.get(i).add(square1_1);
                    squaresView.get(i).add(square1_2);
                    squaresView.get(i).add(square1_3);
                    squaresView.get(i).add(square1_4);
                    squaresView.get(i).add(square1_5);
                }
                else if(i == 1){
                    squaresView.get(i).add(square2_1);
                    squaresView.get(i).add(square2_2);
                    squaresView.get(i).add(square2_3);
                    squaresView.get(i).add(square2_4);
                    squaresView.get(i).add(square2_5);
                }
                else if(i == 2){
                    squaresView.get(i).add(square3_1);
                    squaresView.get(i).add(square3_2);
                    squaresView.get(i).add(square3_3);
                    squaresView.get(i).add(square3_4);
                    squaresView.get(i).add(square3_5);
                }
                else if(i == 3){
                    squaresView.get(i).add(square4_1);
                    squaresView.get(i).add(square4_2);
                    squaresView.get(i).add(square4_3);
                    squaresView.get(i).add(square4_4);
                    squaresView.get(i).add(square4_5);
                }
                else if(i == 4){
                    squaresView.get(i).add(square5_1);
                    squaresView.get(i).add(square5_2);
                    squaresView.get(i).add(square5_3);
                    squaresView.get(i).add(square5_4);
                    squaresView.get(i).add(square5_5);
                }
                else if(i == 5){
                    squaresView.get(i).add(square6_1);
                    squaresView.get(i).add(square6_2);
                    squaresView.get(i).add(square6_3);
                    squaresView.get(i).add(square6_4);
                    squaresView.get(i).add(square6_5);
                }
                else if(i == 6){
                    squaresView.get(i).add(square7_1);
                    squaresView.get(i).add(square7_2);
                    squaresView.get(i).add(square7_3);
                    squaresView.get(i).add(square7_4);
                    squaresView.get(i).add(square7_5);
                }
                else if(i == 7){
                    squaresView.get(i).add(square8_1);
                    squaresView.get(i).add(square8_2);
                    squaresView.get(i).add(square8_3);
                    squaresView.get(i).add(square8_4);
                    squaresView.get(i).add(square8_5);
                }
                else if(i == 8){
                    squaresView.get(i).add(square9_1);
                    squaresView.get(i).add(square9_2);
                    squaresView.get(i).add(square9_3);
                    squaresView.get(i).add(square9_4);
                    squaresView.get(i).add(square9_5);
                }
                else if(i == 9){
                    squaresView.get(i).add(square10_1);
                    squaresView.get(i).add(square10_2);
                    squaresView.get(i).add(square10_3);
                    squaresView.get(i).add(square10_4);
                    squaresView.get(i).add(square10_5);
                }
                else if(i == 10){
                    squaresView.get(i).add(square11_1);
                    squaresView.get(i).add(square11_2);
                    squaresView.get(i).add(square11_3);
                    squaresView.get(i).add(square11_4);
                    squaresView.get(i).add(square11_5);
                }
                else if(i == 11){
                    squaresView.get(i).add(square12_1);
                    squaresView.get(i).add(square12_2);
                    squaresView.get(i).add(square12_3);
                    squaresView.get(i).add(square12_4);
                    squaresView.get(i).add(square12_5);
                }
                else if(i == 12){
                    squaresView.get(i).add(square13_1);
                    squaresView.get(i).add(square13_2);
                    squaresView.get(i).add(square13_3);
                    squaresView.get(i).add(square13_4);
                    squaresView.get(i).add(square13_5);
                }
                else if(i == 13){
                    squaresView.get(i).add(square14_1);
                    squaresView.get(i).add(square14_2);
                    squaresView.get(i).add(square14_3);
                    squaresView.get(i).add(square14_4);
                    squaresView.get(i).add(square14_5);
                }
                else if(i == 14){
                    squaresView.get(i).add(square15_1);
                    squaresView.get(i).add(square15_2);
                    squaresView.get(i).add(square15_3);
                    squaresView.get(i).add(square15_4);
                    squaresView.get(i).add(square15_5);
                }
                else if(i == 15){
                    squaresView.get(i).add(square16_1);
                    squaresView.get(i).add(square16_2);
                    squaresView.get(i).add(square16_3);
                    squaresView.get(i).add(square16_4);
                    squaresView.get(i).add(square16_5);
                }
                else if(i == 16){
                    squaresView.get(i).add(square17_1);
                    squaresView.get(i).add(square17_2);
                    squaresView.get(i).add(square17_3);
                    squaresView.get(i).add(square17_4);
                    squaresView.get(i).add(square17_5);
                }
                else if(i == 17){
                    squaresView.get(i).add(square18_1);
                    squaresView.get(i).add(square18_2);
                    squaresView.get(i).add(square18_3);
                    squaresView.get(i).add(square18_4);
                    squaresView.get(i).add(square18_5);
                }
                else if(i == 18){
                    squaresView.get(i).add(square19_1);
                    squaresView.get(i).add(square19_2);
                    squaresView.get(i).add(square19_3);
                    squaresView.get(i).add(square19_4);
                    squaresView.get(i).add(square19_5);
                }
                else if(i == 19){
                    squaresView.get(i).add(square20_1);
                    squaresView.get(i).add(square20_2);
                    squaresView.get(i).add(square20_3);
                    squaresView.get(i).add(square20_4);
                    squaresView.get(i).add(square20_5);
                }
                else if(i == 20){
                    squaresView.get(i).add(square21_1);
                    squaresView.get(i).add(square21_2);
                    squaresView.get(i).add(square21_3);
                    squaresView.get(i).add(square21_4);
                    squaresView.get(i).add(square21_5);
                }
                else if(i == 21){
                    squaresView.get(i).add(square22_1);
                    squaresView.get(i).add(square22_2);
                    squaresView.get(i).add(square22_3);
                    squaresView.get(i).add(square22_4);
                    squaresView.get(i).add(square22_5);
                }
                else if(i == 22){
                    squaresView.get(i).add(square23_1);
                    squaresView.get(i).add(square23_2);
                    squaresView.get(i).add(square23_3);
                    squaresView.get(i).add(square23_4);
                    squaresView.get(i).add(square23_5);
                }
                else if(i == 23){
                    squaresView.get(i).add(square24_1);
                    squaresView.get(i).add(square24_2);
                    squaresView.get(i).add(square24_3);
                    squaresView.get(i).add(square24_4);
                    squaresView.get(i).add(square24_5);
                }
                else if(i == 24){
                    squaresView.get(i).add(square25_1);
                    squaresView.get(i).add(square25_2);
                    squaresView.get(i).add(square25_3);
                    squaresView.get(i).add(square25_4);
                    squaresView.get(i).add(square25_5);
                }
                else if(i == 25){
                    squaresView.get(i).add(square26_1);
                    squaresView.get(i).add(square26_2);
                    squaresView.get(i).add(square26_3);
                    squaresView.get(i).add(square26_4);
                    squaresView.get(i).add(square26_5);
                }
                else if(i == 26){
                    squaresView.get(i).add(square27_1);
                    squaresView.get(i).add(square27_2);
                    squaresView.get(i).add(square27_3);
                    squaresView.get(i).add(square27_4);
                    squaresView.get(i).add(square27_5);
                }
                else if(i == 27){
                    squaresView.get(i).add(square28_1);
                    squaresView.get(i).add(square28_2);
                    squaresView.get(i).add(square28_3);
                    squaresView.get(i).add(square28_4);
                    squaresView.get(i).add(square28_5);
                }
                else if(i == 28){
                    squaresView.get(i).add(square29_1);
                    squaresView.get(i).add(square29_2);
                    squaresView.get(i).add(square29_3);
                    squaresView.get(i).add(square29_4);
                    squaresView.get(i).add(square29_5);
                }
            }
        }
        for(int i = 0; i < 29; i++){
            for(int j = 0; j < 5; j++){
                squaresView.get(i).get(j).setVisible(false);
                // yutnoriModel.squaresModel.get(0).get(0).inPiece =
            }
        }
    }
}
