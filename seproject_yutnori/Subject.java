package sample;

public interface Subject {
    public static final Observer observer = null;
    void registerObserver(Observer init);
    void notify(YutnoriModel yutnoriModels);
    Observer getObserver();
}
