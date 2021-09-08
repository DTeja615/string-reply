package com.beta.replyservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InputValidator {
    public static String validate(String[] arr){
        if ((arr[0].equals("11") || arr[0].equals("12") || arr[0].equals("21") || arr[0].equals("22")) && (arr.length == 2)){
            return "Input Validated";
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Input").toString();
    }
}
