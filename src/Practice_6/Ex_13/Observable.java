package Practice_6.Ex_13;

// можно за классом наблюдать
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
