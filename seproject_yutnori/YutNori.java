package seproject;
import java.util.*;
import seproject.Player;
import seproject.Yut;
import seproject.Board;

public class YutNori {
	/* �ý����� ���� */
	ArrayList<Player> playingPlayer = new ArrayList<Player>();
	Yut[] yuts = new Yut[4];	// ���� �� ���� �ٽ� �����غ���...
	Board board = new Board();
	
	void createPlayer() {
		/* ������ ������ �÷��̾ ����  */
	}
	int rollYut() {
		/* ����, ��, ��, ��, ��, ���� ����� ��ȯ */
		int yutResult = 0;	// 1�̸� ��(���� ���� �ִ� ���̸� ����), 2�� ��, 3�� ��...
		return yutResult;
	}
	void startGame() {
		/* ���� ���� */
	}
	void startTurn(Player playerN) {
		/* �ش��ϴ� �÷��̾��� ���� �����ϴ� �޼ҵ� */
	}
	void showRanking() {
		/* ���� ��ŷ�� �����ִ� �޼ҵ� */
	}
	void endGame() {
		/* ���� ���� */
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
	}

}
