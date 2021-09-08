package com.beta.replyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@RestController
public class ReplyController {

	@GetMapping("/v2/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

//	@GetMapping("/reply/{message}")
//	public ReplyMessage replying(@PathVariable String message) {
//		return new ReplyMessage(message);
//	}

	@GetMapping("/v2/reply/{message}")
	public String replying(@PathVariable String message) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		return (ReplyMessage.getMessage(message));
		//return new ReplyMessage(message);
	}
}