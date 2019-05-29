package se_project;
import java.util.Random;

public class Yut {
    /* 윷을 나타냄 */
    int status;					// 0 또는 1로 윗면, 뒷면 구분

    public int rollYut(){
        Random random = new Random();
        status = random.nextInt(2);
        System.out.println(status);
        return status;
    }
}