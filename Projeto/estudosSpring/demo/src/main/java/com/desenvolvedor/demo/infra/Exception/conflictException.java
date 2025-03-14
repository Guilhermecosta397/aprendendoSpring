package com.desenvolvedor.demo.infra.Exception;

public class conflictException extends RuntimeException{
    public conflictException(String mensagem){
        super (mensagem);
    }

    public conflictException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
