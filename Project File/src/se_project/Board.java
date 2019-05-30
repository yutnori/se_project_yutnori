package se_project;

import java.util.ArrayList;

public class Board {
    /* 보드판 */
    Square[] squares;
    ArrayList<Player> players;
    int finishCount;
    // Square[] normalSquares = new NormalSquare[26];
    // Square[] intersectionSquare = new IntersectionSquare[3];

    Board(ArrayList<Player> players){
        finishCount = 0;
        this.players = players;
        squares = new Square[30];
        for(int i = 1; i <= 29; i++){
            squares[i] = new Square();
            if(i == 6 || i == 11){
                squares[i].intersection = true;
            }
        }
    }

    void addPiece(int currentSquare, Piece piece){
        squares[currentSquare].pieces.add(piece);
    }

    void deletePieces(int currentSquare){
        squares[currentSquare].pieces.clear();
    }

    int movePiece(int currentSquare, int moveDistance, int turn) { // 말을 움직이는 함수

        int size = squares[currentSquare].pieces.size();
        boolean goalIn = false;
        boolean almostGoal = false;
        int nextSquare = -1;

        if(moveDistance != -1){ // 빽도 아닐때
            if(1 <= currentSquare && currentSquare <= 20 && currentSquare != 6 && currentSquare != 11){ // 정상 라인에서 진행 될때
                nextSquare = currentSquare + moveDistance;
                if(nextSquare == 21) { // 원점에서 딱 멈췄을때
                    nextSquare = 1;
                    almostGoal = true;
                }
                else if(nextSquare > 21) { // 골인
                    goalIn = true;
                    nextSquare = -1;
                    players.get(turn).addGoalInNumber();
                }
                else if(currentSquare == 1 && squares[currentSquare].pieces.get(0).almostGoal && moveDistance != -1) { // 시작점에 있는데 한바퀴 이미 돌았을때 골인. 백도일경우는 안됨.
                    goalIn = true;
                    nextSquare = -1;
                    players.get(turn).addGoalInNumber();
                }
            }
            else if(currentSquare == 6){   // 오른쪽 위에 칸에서 시작할때
                nextSquare = 21;
                moveDistance--;
                nextSquare = nextSquare + moveDistance;
            }
            else if(currentSquare == 11){  // 왼쪽 위에 칸에서 시작할때
                nextSquare = 26;
                moveDistance--;
                nextSquare = nextSquare + moveDistance;
                if(nextSquare == 28){ // 만약 목표 칸이 정중앙이면 정중앙 인덱스로 변환
                    nextSquare = 23;
                }
                else if(29 <= nextSquare && nextSquare <= 30) { // 만약 목표 칸이 아래 부분일 경우. 골인 아님
                    nextSquare--;
                }
            }
            else if(currentSquare == 23){  // 정중앙 칸에서 시작할때
                nextSquare = 28;
                moveDistance--;
                nextSquare = nextSquare + moveDistance;
                if(nextSquare == 30) {     // 원점에서 멈췄을때
                    nextSquare = 1;
                    almostGoal = true;
                }
                else if(nextSquare > 30) { // 골인
                    goalIn = true;
                    nextSquare = -1;
                    players.get(turn).addGoalInNumber();
                }
            }
            else if(21 <= currentSquare && currentSquare <= 25 && currentSquare != 23){ // 오른쪽 위에서 왼쪽 아래로 내려가는 대각선상에 있을때. 정중앙은 아님
                nextSquare = currentSquare + moveDistance;
                if(nextSquare > 25){ // 만약 그 대각선을 탈출하면 왼쪽 아래 칸으로 변형한 후 이동 진행
                    moveDistance = nextSquare - 25;
                    moveDistance--;
                    nextSquare = 16;
                    nextSquare = nextSquare + moveDistance;
                }
            }
            else if(26 <= currentSquare && currentSquare <= 27){ // 왼쪽 위에서 오른쪽 아래로 내려가는 대각선상중 윗 부분에 있을때. 정중앙은 아님
                nextSquare = currentSquare + moveDistance;
                if(nextSquare == 27){ // 똑같이 윗부분에 남아있을 경우
                }
                else if(nextSquare == 28){ // 만약 목표 칸이 정중앙이면 정중앙 인덱스로 변환
                    nextSquare = 23;
                }
                else if(29 <= nextSquare && nextSquare <= 30) { // 만약 목표 칸이 아래 부분일 경우. 골인 아님
                    nextSquare--;
                }
                else if(nextSquare == 31){ // 시작 칸에서 딱 멈출 경우
                    nextSquare = 1;
                    almostGoal = true;
                }
                else{ // 골인
                    goalIn = true;
                    nextSquare = -1;
                    players.get(turn).addGoalInNumber();
                }
            }
            else if(28 <= currentSquare && currentSquare <= 29){ // 왼쪽 위에서 오른쪽 아래로 내려가는 대각선상중 아래 부분에 있을때. 정중앙은 아님
                nextSquare = currentSquare + moveDistance;
                if(nextSquare == 29) { // 똑같이 아래 부분에 남아있을 경우

                }
                else if(nextSquare == 30){ // 시작 칸에서 딱 멈출 경우
                    nextSquare = 1;
                    almostGoal = true;
                }
                else{ // 골인
                    goalIn = true;
                    nextSquare = -1;
                    players.get(turn).addGoalInNumber();
                }
            }
        }
        else {                  // 빽도 일때
            if(1 <= currentSquare && currentSquare <= 20 && currentSquare != 6 && currentSquare != 11){ // 정상 라인에서 진행 될때
                if(currentSquare == 1){                                             // 첫번째 칸에 있는데
                    if(squares[currentSquare].pieces.get(0).almostGoal == true){    // 한바퀴 이미 돌았을때
                        nextSquare = 20;
                    }
                    else{                                                           // 완전 처음 시작했을때
                        nextSquare = currentSquare;
                    }
                }
                else{                                                               // 첫번째 칸이 아닌 나머지 칸들
                    nextSquare = currentSquare + moveDistance;
                }
            }
            else if(currentSquare == 23) {  // 정중앙 칸에서 시작할때
                nextSquare = 27;
            }
            else if(currentSquare == 21) {  // 오른쪽 윗 부분 시작에 있을때 오른쪽 위쪽 칸으로 백
                nextSquare = 6;
            }
            else if(currentSquare == 26) {  // 왼쪽 윗 부분 시작에 있을때 왼쪽 위쪽 칸으로 백
                nextSquare = 11;
            }
            else if(currentSquare == 24){   // 정중앙 바로 앞 왼쪽에 있을때 정중앙으로 백
                nextSquare = 23;
            }
            else if(currentSquare == 28){   // 정중앙 바로 앞 오른쪽에 있을때 정중앙으로 백
                nextSquare = 23;
            }
            else{                           // 나머지 칸들
                nextSquare = currentSquare + moveDistance;
            }
        }

        if(currentSquare == nextSquare)
            return currentSquare;                 // 방금 시작한 말이 백도가 나오면 무시하고 리턴

        removeEatenPieces(nextSquare, goalIn);    // 말이 먹힌 경우 먹힌 말들을 제거

        for(int i = 0; i < size; i++){            // 원래 있던 square의 piece를 삭제하고 목표 square의 piece로 이동
            deletePieces(currentSquare);
            if(goalIn == false){                  // 골인 안한 경우에만 다음 칸에 piece를 이동
                if(almostGoal == true)
                    addPiece(nextSquare, new Piece(turn, almostGoal));
                else
                    addPiece(nextSquare, new Piece(turn));
            }
        }

        checkFinishedPlayers();
        boolean finished = checkAllFinished();
        if(finished == true){
            return -2;
        }

        if(goalIn == true) {
            return -1;
        }

        return nextSquare;
    }

    boolean initializePiece(int turn){ // 플레이어의 말이 보드위에 하나도 없고 남은 말이 존재할 경우
        if(players.get(turn).notOnBoardPieceNumber > 0 && players.get(turn).onBoardPieceNumber == 0 ){
            removeEatenPieces(1, false);
            addPiece(1, new Piece(turn));
            players.get(turn).addPieceOnBoard();
            return true;
        }
        return false;
    }

    void removeEatenPieces(int nextSquare, boolean goalIn) { // 잡힌 말을 제거하는 메소드
        if(nextSquare == -1)
            return;
        if(squares[nextSquare].pieces.size() > 0 && goalIn == false){ // 다른 플레이어의 말을 먹었을때
            int deletedPlayer = squares[nextSquare].pieces.get(0).player;
            deletePieces(nextSquare);
            players.get(deletedPlayer).deletePieceOnBoard();
        }
    }

    void checkFinishedPlayers(){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).onBoardPieceNumber == 0 && players.get(i).notOnBoardPieceNumber == 0){
                players.get(i).finish = true;
                players.get(i).finishOrder = finishCount;
                finishCount++;
            }
        }
    }

    boolean checkAllFinished(){
        boolean check = true;
        for(int i = 0; i < players.size(); i++){
            check = players.get(i).finish;
        }
        return check;
    }
}