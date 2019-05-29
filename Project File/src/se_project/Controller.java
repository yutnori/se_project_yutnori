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

    Circle[][] squaresView;
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
                yutnoriModel.startGame(tempPlayerNum, tempPieceNum);    // 모델을 초기화
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

                squaresView[1][1].setVisible(true);               // 첫번째 square를 보이게 설정하고

                yutnoriModel.playingPlayer.get(0).pieces.get(0).onBoard = true; // 첫번째 플레이어의 첫번쩌 piece가 board 위에 있게 설정
                Piece p = yutnoriModel.playingPlayer.get(0).pieces.get(0);
                yutnoriModel.board.addPiece(1, yutnoriModel.playingPlayer.get(0).pieces.get(0));
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
        // squaresView.get(1 + 3);
        for(int i = 1; i <= (yutnoriModel.board.squares)[1].pieces.size(); i++){ // 원래 있던 square의 circle들을 안보이게
            squaresView[1][i].setVisible(false);
        }
        yutnoriModel.board.movePiece(1, 3);
        for(int i = 1; i <= (yutnoriModel.board.squares)[1 + 3].pieces.size(); i++){ // 도착 square의 circle들을 보이게
            squaresView[1 + 3][i].setVisible(true);
        }
    }

    @FXML
    private void rgergdrgdr(ActionEvent event){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        squaresView = new Circle[30][6];

        squaresView[1][1] = (square1_1); // 윷 자료구조에 집어넣기
        squaresView[1][2] = (square1_2);
        squaresView[1][3] = (square1_3);
        squaresView[1][4] = (square1_4);
        squaresView[1][5] = (square1_5);
        squaresView[2][1] = (square2_1);
        squaresView[2][2] = (square2_2);
        squaresView[2][3] = (square2_3);
        squaresView[2][4] = (square2_4);
        squaresView[2][5] = (square2_5);
        squaresView[3][1] = (square3_1);
        squaresView[3][2] = (square3_2);
        squaresView[3][3] = (square3_3);
        squaresView[3][4] = (square3_4);
        squaresView[3][5] = (square3_5);
        squaresView[4][1] = (square4_1);
        squaresView[4][2] = (square4_2);
        squaresView[4][3] = (square4_3);
        squaresView[4][4] = (square4_4);
        squaresView[4][5] = (square4_5);
        squaresView[5][1] = (square5_1);
        squaresView[5][2] = (square5_2);
        squaresView[5][3] = (square5_3);
        squaresView[5][4] = (square5_4);
        squaresView[5][5] = (square5_5);
        squaresView[6][1] = (square6_1);
        squaresView[6][2] = (square6_2);
        squaresView[6][3] = (square6_3);
        squaresView[6][4] = (square6_4);
        squaresView[6][5] = (square6_5);
        squaresView[7][1] = (square7_1);
        squaresView[7][2] = (square7_2);
        squaresView[7][3] = (square7_3);
        squaresView[7][4] = (square7_4);
        squaresView[7][5] = (square7_5);
        squaresView[8][1] = (square8_1);
        squaresView[8][2] = (square8_2);
        squaresView[8][3] = (square8_3);
        squaresView[8][4] = (square8_4);
        squaresView[8][5] = (square8_5);
        squaresView[9][1] = (square9_1);
        squaresView[9][2] = (square9_2);
        squaresView[9][3] = (square9_3);
        squaresView[9][4] = (square9_4);
        squaresView[9][5] = (square9_5);
        squaresView[10][1] = (square10_1);
        squaresView[10][2] = (square10_2);
        squaresView[10][3] = (square10_3);
        squaresView[10][4] = (square10_4);
        squaresView[10][5] = (square10_5);
        squaresView[11][1] = (square11_1);
        squaresView[11][2] = (square11_2);
        squaresView[11][3] = (square11_3);
        squaresView[11][4] = (square11_4);
        squaresView[11][5] = (square11_5);
        squaresView[12][1] = (square12_1);
        squaresView[12][2] = (square12_2);
        squaresView[12][3] = (square12_3);
        squaresView[12][4] = (square12_4);
        squaresView[12][5] = (square12_5);
        squaresView[13][1] = (square13_1);
        squaresView[13][2] = (square13_2);
        squaresView[13][3] = (square13_3);
        squaresView[13][4] = (square13_4);
        squaresView[13][5] = (square13_5);
        squaresView[14][1] = (square14_1);
        squaresView[14][2] = (square14_2);
        squaresView[14][3] = (square14_3);
        squaresView[14][4] = (square14_4);
        squaresView[14][5] = (square14_5);
        squaresView[15][1] = (square15_1);
        squaresView[15][2] = (square15_2);
        squaresView[15][3] = (square15_3);
        squaresView[15][4] = (square15_4);
        squaresView[15][5] = (square15_5);
        squaresView[16][1] = (square16_1);
        squaresView[16][2] = (square16_2);
        squaresView[16][3] = (square16_3);
        squaresView[16][4] = (square16_4);
        squaresView[16][5] = (square16_5);
        squaresView[17][1] = (square17_1);
        squaresView[17][2] = (square17_2);
        squaresView[17][3] = (square17_3);
        squaresView[17][4] = (square17_4);
        squaresView[17][5] = (square17_5);
        squaresView[18][1] = (square18_1);
        squaresView[18][2] = (square18_2);
        squaresView[18][3] = (square18_3);
        squaresView[18][4] = (square18_4);
        squaresView[18][5] = (square18_5);
        squaresView[19][1] = (square19_1);
        squaresView[19][2] = (square19_2);
        squaresView[19][3] = (square19_3);
        squaresView[19][4] = (square19_4);
        squaresView[19][5] = (square19_5);
        squaresView[20][1] = (square20_1);
        squaresView[20][2] = (square20_2);
        squaresView[20][3] = (square20_3);
        squaresView[20][4] = (square20_4);
        squaresView[20][5] = (square20_5);
        squaresView[21][1] = (square21_1);
        squaresView[21][2] = (square21_2);
        squaresView[21][3] = (square21_3);
        squaresView[21][4] = (square21_4);
        squaresView[21][5] = (square21_5);
        squaresView[22][1] = (square22_1);
        squaresView[22][2] = (square22_2);
        squaresView[22][3] = (square22_3);
        squaresView[22][4] = (square22_4);
        squaresView[22][5] = (square22_5);
        squaresView[23][1] = (square23_1);
        squaresView[23][2] = (square23_2);
        squaresView[23][3] = (square23_3);
        squaresView[23][4] = (square23_4);
        squaresView[23][5] = (square23_5);
        squaresView[24][1] = (square24_1);
        squaresView[24][2] = (square24_2);
        squaresView[24][3] = (square24_3);
        squaresView[24][4] = (square24_4);
        squaresView[24][5] = (square24_5);
        squaresView[25][1] = (square25_1);
        squaresView[25][2] = (square25_2);
        squaresView[25][3] = (square25_3);
        squaresView[25][4] = (square25_4);
        squaresView[25][5] = (square25_5);
        squaresView[26][1] = (square26_1);
        squaresView[26][2] = (square26_2);
        squaresView[26][3] = (square26_3);
        squaresView[26][4] = (square26_4);
        squaresView[26][5] = (square26_5);
        squaresView[27][1] = (square27_1);
        squaresView[27][2] = (square27_2);
        squaresView[27][3] = (square27_3);
        squaresView[27][4] = (square27_4);
        squaresView[27][5] = (square27_5);
        squaresView[28][1] = (square28_1);
        squaresView[28][2] = (square28_2);
        squaresView[28][3] = (square28_3);
        squaresView[28][4] = (square28_4);
        squaresView[28][5] = (square28_5);
        squaresView[29][1] = (square29_1);
        squaresView[29][2] = (square29_2);
        squaresView[29][3] = (square29_3);
        squaresView[29][4] = (square29_4);
        squaresView[29][5] = (square29_5);

        for(int i = 1; i <= 29; i++){       // 윷 안보이게 초기화
            for(int j = 1; j <= 5; j++){
                squaresView[i][j].setVisible(false);
            }
        }
    }
}
