package com.projectintegration.projetoappint.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectintegration.projetoappint.domain.ResponseDomain;

@RestController
public class HelloWorldRest {
	@RequestMapping(value = "/hello-world", headers="Accept=*/*", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<ResponseDomain> hello() {
		var body = new ResponseDomain();
		body.setMensagem("Hello World");
		body.setStatusCode(200);
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
}
