package seproject;
import java.util.*;
import seproject.Piece;

public abstract class Square {
	/* �����ǿ��� ��ϵ� */
	ArrayList<Piece> inPiece = new ArrayList<>();
}

class NormalSquare extends Square {
	/* �б����� ���� ��ϵ� */
}

class IntersectionSquare extends Square {
	/* ������ ��ϵ� */
}