package com.ufpso.tienda.exception;

public class NotFoundException  extends  RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}