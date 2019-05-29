package se_project;

public class Board {
    /* 보드판 */
    Square[] squares;
    // Square[] normalSquares = new NormalSquare[26];
    // Square[] intersectionSquare = new IntersectionSquare[3];

    Board(){
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

    void movePiece(int position, int moveDistance) {
        /* 말을 움직이는 메소드 */
        int size = squares[position].pieces.size();
        Piece p;
        for(int i = 0; i < size; i++){                  // 원래 있던 square의 piece를 목표 square의 piece로 이동
            p = squares[position].pieces.get(i);
            squares[position + moveDistance].pieces.add(p);
        }
        squares[position].pieces.clear();
    }
    void removePiece() {
        /* 잡힌 말을 제거하는 메소드 */
    }
    void detectPiece() {
        /* 말의 위치를 찾는 메소드 */
    }
}