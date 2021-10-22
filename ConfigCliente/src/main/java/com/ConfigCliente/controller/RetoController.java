package com.ConfigCliente.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RetoController {

	@Value("${some.value}")
	private String reto;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.reto;
	}
}
