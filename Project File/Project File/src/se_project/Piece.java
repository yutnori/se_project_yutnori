package se_project;
import java.util.*;

public class Piece {
    /* 말 */
    int player; // 어떤 플레이어가 소유하고 있는지
    boolean onBoard; // 보드판 위에 존재하는지

    Piece(int player, boolean onBoard){
        this.player = player;
        this.onBoard = onBoard;
    }

    // LinkedList<Piece> pieceList = new LinkedList<Piece>();	// 업혀있는 말들(다시 생각해봐야 함)

    void groupePiece() {
        /* 말을 업는 메소드 */
    }
}