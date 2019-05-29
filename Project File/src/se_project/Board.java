package se_project;

public class Board {
    /* 보드판 */
    Square[] squares;
    // Square[] normalSquares = new NormalSquare[26];
    // Square[] intersectionSquare = new IntersectionSquare[3];

    Board(){
        squares = new Square[29];
        for(int i = 1; i <= 28; i++){
            squares[i] = new Square();
            if(i == 6 || i == 11){
                squares[i].intersection = true;
            }
        }
    }

    void movePiece(int pieceStart, int moveDistance) {
        /* 말을 움직이는 메소드 */
        squares[pieceStart + moveDistance].pieces = squares[pieceStart].pieces;
        squares[pieceStart].pieces = 0;
    }
    void removePiece() {
        /* 잡힌 말을 제거하는 메소드 */
    }
    void detectPiece() {
        /* 말의 위치를 찾는 메소드 */
    }
}