package ru.sssii.java.api.OOP3.Seminar.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    private static final Logger LOGGER = Logger.getLogger(AbstractGame.class.getName());

    FileHandler fh = new FileHandler("C:\\Users\\Lebro\\Desktop\\GB.Education\\lesson1\\src\\main\\java\\ru\\sssii\\java\\api\\OOP3\\Seminar\\Task3\\LogFile.log");

    public Log() throws IOException {
    }

    void addLog() {
        LOGGER.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        LOGGER.setUseParentHandlers(false);
    }

    void addLogMove(String value) {
        LOGGER.log(Level.INFO, "Пользователський ввод: " + value);
    }

    void printLogConsole() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Lebro\\Desktop\\GB.Education\\lesson1\\src\\main\\java\\ru\\sssii\\java\\api\\OOP3\\Seminar\\Task3\\LogFile.log");
        BufferedReader in = new BufferedReader(fileReader);
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
    }
}
