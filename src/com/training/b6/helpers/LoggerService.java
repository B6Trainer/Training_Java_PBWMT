package com.training.b6.helpers;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerService {
    public static void main(String[] args) {
        // Create a Logger instance
        Logger logger = getLogger(LoggerService.class.getSimpleName());

        // Log some messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }

    private static String logLocation="C:/software/Projects/Local Workspace/GitHubLocation/Logs/";
    private static String log_fileName="Training_app_logs.log";


    public static Logger getLogger(String _className){
        // Create a Logger instance
        Logger logger = Logger.getLogger(LoggerService.class.getSimpleName());

        // Set the log level to control which messages are logged
        logger.setLevel(Level.INFO);

        // Create a FileHandler to write log messages to a file
        try {
            FileHandler fileHandler = new FileHandler(logLocation+log_fileName);
            logger.addHandler(fileHandler);

            // Create a SimpleFormatter to format the log messages
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return logger;
    }
}
