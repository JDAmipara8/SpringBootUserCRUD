package com.springBootApk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springBootApk.model.RequestPayload;
import com.springBootApk.model.ResponseTransfer;

@Controller
@ResponseBody
public class TestController1 {

	@RequestMapping("/test")
	public String firstHander() {
		return " Just for Testing....";
		
	}
	
	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String postResponseJsonContent() {
	    return "Helo from SpringBoot";
	}
	
	@PostMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseTransfer postResponseJsonContent(
			@RequestBody RequestPayload requestPayload) {
		ResponseTransfer responseTransfer = new ResponseTransfer();
		responseTransfer.setText(requestPayload.getText());
	    return responseTransfer;
	}
	
	@GetMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseTransfer getResponseJsonContent(
			HttpServletRequest request) {
		ResponseTransfer responseTransfer = new ResponseTransfer();
		responseTransfer.setText("Test");
	    return responseTransfer;
	}
	
	
}
