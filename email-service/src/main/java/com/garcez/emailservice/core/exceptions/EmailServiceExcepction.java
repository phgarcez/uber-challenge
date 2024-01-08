package com.garcez.emailservice.core.exceptions;

public class EmailServiceExcepction  extends RuntimeException{
    public EmailServiceExcepction(String message){
        super(message);
    }

    public  EmailServiceExcepction (String message, Throwable cause){
        super(message, cause);
    }
}
