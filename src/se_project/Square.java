package se_project;
import java.util.*;

public abstract class Square {
    /* 보드판에서 블록들 */
    ArrayList<Piece> inPiece = new ArrayList<>();
}

class NormalSquare extends Square {
    /* 분기점이 없는 블록들 */
}

class IntersectionSquare extends Square {
    /* 교차로 블록들 */
}