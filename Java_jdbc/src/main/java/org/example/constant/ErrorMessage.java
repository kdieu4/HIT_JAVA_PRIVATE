package org.example.constant;

public class ErrorMessage {
    public static String connectionFail(String message) {
        return "Connection fail, error: " + message;
    }
    public static String closeFail(String message) {
        return "Close fail, error: " + message;
    }
}
