package se_project;

import java.util.ArrayList;

public class YutnoriModel{
    /* 시스템의 역할 */
    public int pieceNum;
    public int playerNum;
    public ArrayList<Player> playingPlayer;
    public Yut[] yuts = new Yut[4];	// 빽도 일 때를 다시 생각해보자...
    public Board board;

    public ArrayList<ArrayList<Square>> squaresModel = new ArrayList<>();

    // private models;

    YutnoriModel(){

    }

    void createPlayer() {
        /* 게임을 진행할 플레이어를 정함
        * 그러나 게임 진행을 온라인에서 하는 것이 아닌
        * 하나의 컴퓨터에서 진행되므로
        * 필요없다고 생각됨 -성현-
        * */
    }
    int rollYut() {
        /* 빽도, 도, 개, 결, 윷, 모의 결과를 반환 */
        int yutResult = 0;	// 1이면 도(만약 점이 있는 윷이면 빽도), 2면 개, 3면 걸...
        return yutResult;
    }
    void startGame(int playerNum, int pieceNum) {
        this.playerNum = playerNum;         // 모델에다 플레이어, 말의 수 설정
        this.pieceNum = pieceNum;

        /* 게임 시작 */
        System.out.println("startGame 실행");
        playingPlayer = new ArrayList<>();
        this.board = new Board();

        for(int i = 0; i < playerNum; i++) {
            playingPlayer.add(new Player(pieceNum));                         // 플레이어 수만큼 arraylist 공간 할당
        }

        board.addPiece(1, new Piece(1));
        playingPlayer.get(0).addPieceOnBoard();

        System.out.println("게임 시작 완료");
    }
    void startTurn(Player playerN) {
        /* 해당하는 플레이어의 턴을 시작하는 메소드 */
    }
    void showRanking() {
        /* 게임 랭킹을 보여주는 메소드 */
    }
    void endGame() {
        /* 게임 종료 */
        playingPlayer.clear();
    }
}
