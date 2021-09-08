package com.beta.replyservice;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class ReplyMessage {

	private static String message;

	public ReplyMessage(String message) {
		this.message = message;
	}

	public static String getMessage(String message) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String[] parsedInput = InputParser.parser(message);
		String validate = InputValidator.validate(parsedInput);
		String output;
		if (validate == "Input Validated"){
			output = RuleApplier.ruleApplier(parsedInput);
		}
		else
			return validate;
		return "data : " + output;
	}
}