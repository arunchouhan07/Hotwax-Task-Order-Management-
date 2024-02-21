package com.hotwax.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CoustomException extends RuntimeException {
    public CoustomException(String message){
        super(message);
    }
}
