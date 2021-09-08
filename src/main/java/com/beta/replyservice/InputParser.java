package com.beta.replyservice;

public class InputParser {
    public static String[] parser(String message){
        String[] arr = message.split("-");
        return arr;
    }
}
