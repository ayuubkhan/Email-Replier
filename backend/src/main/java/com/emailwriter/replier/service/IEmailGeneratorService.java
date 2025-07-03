package com.emailwriter.replier.service;

import com.emailwriter.replier.dto.EmailRequest;

public interface IEmailGeneratorService {

    String generateEmailReply(EmailRequest emailRequest);
}
