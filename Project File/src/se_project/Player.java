package se_project;
import javafx.scene.paint.Color;

import java.util.*;

public class Player implements Comparable<Player>{
    int playerID;
    int onBoardPieceNumber;
    int notOnBoardPieceNumber;
    int goalInNumber;
    boolean turn;
    Color color;
    boolean finish;
    int finishOrder;

    Player(int pieceNumber, int player){
        playerID = player;
        onBoardPieceNumber = 0;
        notOnBoardPieceNumber = pieceNumber;
        goalInNumber = 0;
        turn = false;
        finish = false;
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

    void addGoalInNumber(){
        goalInNumber++;
        onBoardPieceNumber--;
    }

    Color getColor(){
        return color;
    }

    @Override
    public int compareTo(Player p) {
        if(this.goalInNumber < p.goalInNumber) {
            return 1; // x에 대해서는 내림차순
        }
        else if(this.goalInNumber == p.goalInNumber) {
            if(this.finishOrder > p.finishOrder) { // y에 대해서는 오름차순
                return 1;
            }
        }
        return -1;
    }
}