package com.garcez.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
