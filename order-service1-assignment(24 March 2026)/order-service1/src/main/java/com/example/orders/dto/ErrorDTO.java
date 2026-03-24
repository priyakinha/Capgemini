package com.example.orders.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ErrorDTO {
    private String message;
    private String uri;
    private LocalDate timestamp;
    public ErrorDTO(){}

    public ErrorDTO(LocalDate timestamp, String message, String uri) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.uri = uri;
    }


}
