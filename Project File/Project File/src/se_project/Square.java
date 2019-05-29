package se_project;
import java.util.*;

public class Square {
    /* 보드판에서 블록들 */
    // public int pieces;
    ArrayList<Piece> onSquarePieces;
    public boolean intersection;

    Square(){
        onSquarePieces = new ArrayList<>();
        intersection = false;
    }
}
/*
class NormalSquare extends Square {
    // 분기점이 없는 블록들
}

class IntersectionSquare extends Square {
    // 교차로 블록들
}
*/