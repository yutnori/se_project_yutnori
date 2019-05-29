package se_project;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class YutnoriModel{
    /* 시스템의 역할 */
    int pieceNum;
    int playerNum;
    ArrayList<Player> playingPlayer;
    Yut[] yuts = new Yut[4];	// 빽도 일 때를 다시 생각해보자...
    Board board;

    public ArrayList<ArrayList<Square>> squaresModel = new ArrayList<>();

    // private models;

    YutnoriModel(){
        playingPlayer = new ArrayList<>();
        board = new Board(playingPlayer);
        for(int i = 0; i < 4; i++){
            yuts[i] = new Yut();        // yut 초기화
        }
    }

    int rollYuts() {
        /* 빽도, 도, 개, 결, 윷, 모의 결과를 반환 */

        int yutResult = 0;	// 1이면 도(만약 점이 있는 윷이면 빽도), 2면 개, 3면 걸..
        for(int i = 0; i < 4; i++){
            yutResult += yuts[i].rollYut();     // 윷을 각각 던져 윷 결과를 얻음
        }
        if(yuts[0].status == 1 && yutResult == 1) return 5; // yut[0]은 빽도를 나타내는 윷
        return yutResult;
    }

    void startGame(int playerNum, int pieceNum) {
        this.playerNum = playerNum;         // 모델에다 플레이어, 말의 수 설정
        this.pieceNum = pieceNum;

        /* 게임 시작 */
        System.out.println("startGame 실행");

        for(int i = 0; i < playerNum; i++) {
            playingPlayer.add(new Player(pieceNum, i));                         // 플레이어 수만큼 arraylist 공간 할당
        }

        board.addPiece(1, new Piece(0));
        playingPlayer.get(0).addPieceOnBoard();

        System.out.println("게임 시작 완료");
    }

    int switchYut(String yut){
        int distance = 0;
        switch(yut){        // 선택한 말과 윷 목록을 통해 시작지점과 움직일 거리 초기화
            case "빽도":
                distance =  -1;
                break;
            case "도":
                distance = 1;
                break;
            case "개":
                distance = 2;
                break;
            case "걸":
                distance = 3;
                break;
            case "윷":
                distance = 4;
                break;
            case "모":
                distance = 5;
                break;
        }
        return distance;
    }

    int nextTurn() {
        /* 해당하는 플레이어의 턴을 시작하는 메소드 */
        for(int i = 0; i < playingPlayer.size(); i++){
            if(playingPlayer.get(i).turn == true && i <  playingPlayer.size() - 1){
                playingPlayer.get(i).turn = false;
                playingPlayer.get(i + 1).turn = true;
                return i + 1;
            }
        }
        playingPlayer.get(playingPlayer.size() - 1).turn = false;
        playingPlayer.get(0).turn = true;
        return 0;
    }

    int currentTurn(){
        for(int i = 0; i < playingPlayer.size(); i++) {
            if(playingPlayer.get(i).turn == true)
                return i;
        }
        return 0;
    }

    Color currentColor(int turn){
        return playingPlayer.get(turn).getColor();
    }

    void showRanking() {
        /* 게임 랭킹을 보여주는 메소드 */
    }
    void endGame() {
        /* 게임 종료 */
        playingPlayer.clear();
    }
}
