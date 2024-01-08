package com.garcez.emailservice.adapters;

// Aplicação para interagir com os serviços de email services providers AWS SES ou Send Grid

public interface EmailSenderGateway {
    void sendEmail (String to, String subject, String body);
}
