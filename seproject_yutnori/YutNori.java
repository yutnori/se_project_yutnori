package seproject;
import java.util.*;
import seproject.Player;
import seproject.Yut;
import seproject.Board;

public class YutNori {
	/* 시스템의 역할 */
	ArrayList<Player> playingPlayer = new ArrayList<Player>();
	Yut[] yuts = new Yut[4];	// 빽도 일 때를 다시 생각해보자...
	Board board = new Board();
	
	void createPlayer() {
		/* 게임을 진행할 플레이어를 정함  */
	}
	int rollYut() {
		/* 뺵도, 도, 개, 결, 윷, 모의 결과를 반환 */
		int yutResult = 0;	// 1이면 도(만약 점이 있는 윷이면 빽도), 2면 개, 3면 걸...
		return yutResult;
	}
	void startGame() {
		/* 게임 시작 */
	}
	void startTurn(Player playerN) {
		/* 해당하는 플레이어의 턴을 시작하는 메소드 */
	}
	void showRanking() {
		/* 게임 랭킹을 보여주는 메소드 */
	}
	void endGame() {
		/* 게임 종료 */
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
	}

}
