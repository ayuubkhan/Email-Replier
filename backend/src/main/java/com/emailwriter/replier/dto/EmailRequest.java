package com.emailwriter.replier.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
