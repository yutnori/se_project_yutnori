package se_project;

public class YutnoriGame {

    YutnoriGame(){
        View view = new View();
        YutnoriModel yutnoriModel = new YutnoriModel();
        Controller controller = new Controller(view, yutnoriModel);
    }
}
