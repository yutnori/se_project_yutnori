package se_project;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class BoardTest {
    ArrayList<Player> playingPlayerTest = new ArrayList<>();

    @Test
    public void movePieceTestInGeneralSquare(){
        /* 교차점이나 시작점이 아닌 일반적인 위치에서 움직일 때 */
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int square = 2; square <= 20; square++) {
            if(square == 6 || square == 11)
                continue;   // 교차점이므로 여기서 테스트 안함
            for (int yut = 1; yut < 6; yut++) {
                int nextSquare = square + yut;
                int result = b.movePiece(square, yut, 0);

                if(nextSquare == 21)                        // 도착지가 시작점일 경우
                    assertEquals(1, result);
                else if(nextSquare > 21)                    // 골인일 경우
                    assertEquals(-1, result);
                else                                        // 그 외
                    assertEquals(nextSquare, result);
            }
        }
    }

    @Test
    public void movePieceTestInRightIntersection(){
        /* 오른쪽 위 교차점에서 움직일 때 */
        int diagonalSquareIndex = 21;
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int yut = 1; yut < 6; yut++) {
            int nextSquare = diagonalSquareIndex + yut - 1;
            int result = b.movePiece(6, yut, 0);
            assertEquals(nextSquare, result);
        }
    }

    @Test
    public void movePieceTestInLeftIntersection(){
        /* 왼쪽 위 교차점에서 움직일 때 */
        int diagonalSquareIndex = 26;
        int centerIntersection = 23;
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int yut = 1; yut < 6; yut++){
            int nextSquare = diagonalSquareIndex + yut - 1;
            int result = b.movePiece(11, yut, 0);

            if(nextSquare == 28)
                assertEquals(centerIntersection, result);           // 도착점이 중앙 교차점일 때
            else if(29 <= nextSquare && nextSquare <= 30)
                assertEquals(nextSquare - 1, result);     // 도착점이 중앙 교차점 아래 부분일 때
            else
                assertEquals(nextSquare, result);                   // 그 외
        }
    }

    @Test
    public void movePieceTestInCenterIntersection(){
        /* 중앙 교차점에서 움직일 때 */
        int diagonalSquareIndex = 28;
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int yut = 1; yut < 6; yut++) {
            int nextSquare = diagonalSquareIndex + yut - 1;
            int result = b.movePiece(23, yut, 0);

            if(nextSquare == 30)        // 도착점이 사작점일 때
                assertEquals(1, result);
            else if(nextSquare > 30)    // 골인했을 때
                assertEquals(-1, result);
            else
                assertEquals(nextSquare, result);
        }
    }

    @Test
    public void movePieceTestInDiagonalRightToLeft(){
        /* 오른쪽 위에서 왼쪽 아래로 내려가는 대각선에서 움직일 때 */
        int diagonalSquareIndex = 16;
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int square = 21; square <= 25; square++) {
            if(square == 23)
                continue;;
            for (int yut = 1; yut < 6; yut++) {
                int result = b.movePiece(square, yut, 0);
                int nextSquare = square + yut;
                if(nextSquare > 25)     // 대각선을 탈출 할 때
                    assertEquals(diagonalSquareIndex + nextSquare - 26, result);
                else
                    assertEquals(nextSquare, result);
            }
        }
    }

    @Test
    public void movePieceTestInDiagonalLeftToRightUpper(){
        /* 왼쪽 위에서 오른쪽 아래로 내려가는 대각선의 위쪽에서 움직일 때 */
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);
        int centerIntersection = 23;

        for(int square = 26; square <= 27; square++){
            for(int yut = 1; yut < 6; yut++){
                int nextSquare = square + yut;
                int result = b.movePiece(square, yut, 0);

                if(nextSquare == 27)
                    assertEquals(nextSquare, result);
                else if(nextSquare == 28)
                    assertEquals(centerIntersection, result);
                else if(29 <= nextSquare && nextSquare <= 30)
                    assertEquals(nextSquare - 1, result);
                else if(nextSquare == 31)
                    assertEquals(1, result);
                else
                    assertEquals(-1, result);
            }
        }
    }

    @Test
    public void movePieceTestInDiagonalLeftToRightLower(){
        /* 왼쪽 위에서 오른쪽 아래로 내려가는 대각선의 아랫쪽에서 움직일 때 */
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int square = 28; square <= 29; square++){
            for(int yut = 1; yut < 6; yut++){
                int nextSquare = square + yut;
                int result = b.movePiece(square, yut, 0);

                if(nextSquare == 29)
                    assertEquals(nextSquare, result);
                else if(nextSquare == 30)
                    assertEquals(1, result);
                else
                    assertEquals(-1, result);
            }
        }
    }

    @Test
    public void movePieceTestInStartSquare(){
        /* 시작점에서 멈춰있다가 출발할 때(한 바퀴 돌기 직전인 상황) */
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int yut = 1; yut < 6; yut++){
            int result;
            Piece notEmptyPieceInStart = new Piece(0, true);
            b.squares[1].pieces.add(notEmptyPieceInStart);
            result = b.movePiece(1, yut, 0);
            assertEquals(-1, result);
        }
    }

    @Test
    public void movePieceTestGetMinusYut(){
        /* 빽도가 나왔을 경우 */
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        for(int square = 2; square <= 29; square++){
            int result = b.movePiece(square, -1, 0);
            int nextSquare = square - 1;
            if(square == 6 || square == 11)
                continue;
            if(square == 23)
                assertEquals(27, result);
            else if(square == 21)
                assertEquals(6, result);
            else if(square == 26)
                assertEquals(11, result);
            else if(square == 28)
                assertEquals(23, result);
            else if(square == nextSquare)
                assertEquals(square, result);
            else
                assertEquals(nextSquare, result);
        }
    }

    @Test
    public void movePieceTestGetMinusYutInStartSquare(){
        /* 시작과 동시에 빽도가 나왔을 경우 */
        int result;
        playingPlayerTest.add(new Player(5,0));
        Board b = new Board(playingPlayerTest);

        Piece startingPiece = new Piece(0, false);
        b.squares[1].pieces.add(startingPiece);
        result = b.movePiece(1, -1, 0);
        assertEquals(1, result);
    }

    @Test
    public void movePieceTestGetMinusYutInStartSquare_AlmostGoal(){
        /* 시작점에서 빽도가 나왔을 때(한 바퀴 돌기 직전인 상황) */
        int result;
        playingPlayerTest.add(new Player(5, 0));
        Board b = new Board(playingPlayerTest);

        Piece almostGoalPiece = new Piece(0, true);
        b.squares[1].pieces.add(almostGoalPiece);
        result = b.movePiece(1, -1, 0);
        assertEquals(20, result);
    }
}