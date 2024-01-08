package com.garcez.emailservice.core;

public interface EmailSenderUserCase { //Interface que definirá os casos de uso
    void sendEmail (String to, String subject, String body); //Método que recebe to, from e body do email
}
