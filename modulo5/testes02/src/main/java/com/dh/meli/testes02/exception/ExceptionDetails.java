package com.dh.meli.testes02.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data

public class ExceptionDetails {
    private String title;
    private String message;
    private String field;
    private String fieldMessage;
    private LocalDateTime timestamp;
}
