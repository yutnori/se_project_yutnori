package se_project;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.*;

public class Piece{
    /* 말 */
    int player; // 어떤 플레이어가 소유하고 있는지
    boolean almostGoal;
    // boolean onBoard; // 보드판 위에 존재하는지

    Piece(int player) { // boolean onBoard){
        this.player = player;
        this.almostGoal = false;
    }

    Piece(int player, boolean almostGoal){
        this.player = player;
        this.almostGoal = almostGoal;
    }

    // LinkedList<Piece> pieceList = new LinkedList<Piece>();	// 업혀있는 말들(다시 생각해봐야 함)

    void groupePiece() {
        /* 말을 업는 메소드 */
    }
}