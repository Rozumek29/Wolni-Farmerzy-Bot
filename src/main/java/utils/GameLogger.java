package utils;

import com.sun.tools.javac.Main;

import java.util.logging.Logger;

public class GameLogger {
    private static GameLogger instance;
    private Logger logger;
    private GameLogger(){
        logger = Logger.getLogger(Main.class.getName());
    }

    public static GameLogger getLogger(){
        if (instance == null){
            instance = new GameLogger();
        }
        return instance;
    }

    public void info(String message){
        logger.info(message);
    }

    public void warning(String message){
        logger.warning(message);
    }
}
