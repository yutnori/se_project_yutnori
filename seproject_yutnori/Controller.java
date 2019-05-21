package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class Controller {

    private YutnoriModel yutnoriModel;
    private View view;

    /**
     * 생성자.
     * initialize() 메서드 이전에 호출된다.
     */
    public Controller(View view, YutnoriModel yutnoriModel) {
        this.yutnoriModel = yutnoriModel;
        this.view = view;
    }

    /**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */

    /**
     * 참조를 다시 유지하기 위해 메인 애플리케이션이 호출한다.
     *
     * @param yutnoriModel
     */
    public void setYutnoriGame(YutnoriModel yutnoriModel) {
        this.yutnoriModel = yutnoriModel;

        // 테이블에 observable 리스트 데이터를 추가한다.
        // personTable.setItems(mainApp.getPersonData());
    }
}
