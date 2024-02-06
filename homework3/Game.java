package homeworks.homework3;

public interface Game {
    void start(Integer wordSize, Integer tryCount);
    Answer inputValue(String value);
    GameStatus getGameStatus();

    void stop();

    void exit();

    void restart();

}