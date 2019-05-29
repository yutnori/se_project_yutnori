package se_project;
import java.util.*;

public class Player {
    int onBoardPieceNumber;
    int notOnBoardPieceNumber;

    Player(int pieceNumber){
        onBoardPieceNumber = 0;
        notOnBoardPieceNumber = pieceNumber;
    }

    void addPieceOnBoard(){
        onBoardPieceNumber++;
        notOnBoardPieceNumber--;
    }
}