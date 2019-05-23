package se_project;
import java.util.*;

public class Square {
    /* 보드판에서 블록들 */
    public ArrayList<Piece> inPiece;
    public boolean intersection;

    Square(){
        inPiece = new ArrayList<>();
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