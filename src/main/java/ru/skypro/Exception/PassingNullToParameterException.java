package ru.skypro.Exception;

public class PassingNullToParameterException extends RuntimeException{
    public PassingNullToParameterException(String message) {
        super(message);
    }
}
