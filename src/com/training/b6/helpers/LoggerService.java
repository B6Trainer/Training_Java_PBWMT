package com.training.b6.helpers;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerService {
    public static void main(String[] args) {
        // Create a Logger instance
        Logger logger = Logger.getLogger(LoggerService.class.getName());

        // Set the log level to control which messages are logged
        logger.setLevel(Level.INFO);

        // Create a FileHandler to write log messages to a file
        try {
            FileHandler fileHandler = new FileHandler("E:/Training/logs/javalogs.log");
            logger.addHandler(fileHandler);

            // Create a SimpleFormatter to format the log messages
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Log some messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }
}
