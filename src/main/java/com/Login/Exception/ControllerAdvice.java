package com.Login.Exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ControllerAdvice extends ResponseEntityExceptionHandler {

		 

        @ExceptionHandler(NoContentException.class)
        public ResponseEntity<Object> handleCityNotFoundException(NoContentException ex, WebRequest request) {

 

            Map<String, Object> body = new LinkedHashMap<>();
            body.put("Error", "No Data found");
            return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
        }
}
