package com.ericlouw.jinjectsu.jinjectsu.exceptions;

public class TypeAlreadyRegisteredException extends RuntimeException {
    public TypeAlreadyRegisteredException(String message){
        super(message);
    }
}
