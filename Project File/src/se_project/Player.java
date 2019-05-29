package se_project;
import javafx.scene.paint.Color;

import java.util.*;

public class Player {
    int onBoardPieceNumber;
    int notOnBoardPieceNumber;
    boolean turn;
    Color color;

    Player(int pieceNumber, int player){
        onBoardPieceNumber = 0;
        notOnBoardPieceNumber = pieceNumber;
        turn = false;
        switch (player){
            case 0: color = Color.ORANGE;
                break;
            case 1: color = Color.GREEN;
                break;
            case 2: color = Color.PURPLE;
                break;
            case 3: color = Color.PINK;
                break;
        }
    }

    void addPieceOnBoard(){
        onBoardPieceNumber++;
        notOnBoardPieceNumber--;
    }

    void deletePieceOnBoard(){
        onBoardPieceNumber--;
    }

    Color getColor(){
        return color;
    }
}