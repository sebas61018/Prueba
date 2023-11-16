package com.ufpso.tienda.exception;

public class AlreadyExistsException extends  RuntimeException {
    public AlreadyExistsException(String message){
        super(message);
    }
}