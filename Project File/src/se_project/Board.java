package se_project;

import java.util.ArrayList;

public class Board {
    /* 보드판 */
    Square[] squares;
    ArrayList<Player> players;
    // Square[] normalSquares = new NormalSquare[26];
    // Square[] intersectionSquare = new IntersectionSquare[3];

    Board(ArrayList<Player> players){
        this.players = players;
        squares = new Square[30];
        for(int i = 1; i <= 29; i++){
            squares[i] = new Square();
            if(i == 6 || i == 11){
                squares[i].intersection = true;
            }
        }
    }

    void addPiece(int position, Piece piece){   // 유저가 갖고 있는 Piece의 인스턴스를 여기다가도 reference
        squares[position].pieces.add(piece);
    }

    void deletePieces(int position){
        for(int i = 0; i < squares[position].pieces.size(); i++){
            squares[position].pieces.remove(i);
        }
    }

    void movePiece(int position, int moveDistance, int turn) {
        /* 말을 움직이는 메소드 */
        int size = squares[position].pieces.size();
        Piece p;
        int deletedPlayer = -1;
        if(squares[position + moveDistance].pieces.size() > 0){
            deletedPlayer = squares[position + moveDistance].pieces.get(0).player;
            deletePieces(position + moveDistance);
            players.get(deletedPlayer).deletePieceOnBoard();
        }
        for(int i = 0; i < size; i++){                  // 원래 있던 square의 piece를 목표 square의 piece로 이동
            addPiece(position + moveDistance, new Piece(turn));
            deletePieces(position);
        }
    }

    boolean initializePiece(int turn, int totalPieceNumber){
        if(players.get(turn).notOnBoardPieceNumber == totalPieceNumber || players.get(turn).onBoardPieceNumber == 0 ){
            addPiece(1, new Piece(turn));
            players.get(turn).addPieceOnBoard();
            return true;
        }
        return false;
    }

    void removePiece() {
        /* 잡힌 말을 제거하는 메소드 */
    }
    void detectPiece() {
        /* 말의 위치를 찾는 메소드 */
    }
}