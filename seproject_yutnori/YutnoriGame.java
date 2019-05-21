package sample;

public class YutnoriGame {
    public static void main(String[] args) {

        View view = new View();
        YutnoriModel yutnoriModel = new YutnoriModel();
        Controller controller = new Controller(view, yutnoriModel);
    }
}
