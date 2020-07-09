package com.datacubik.springboot.escuela.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ConfiguracionController {
	
	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/getConfiguracion")
	public ResponseEntity<?> getConfiguracion() {
		Map<String, String> json = new HashMap<>();
		json.put("port", port);
		json.put("texto", env.getProperty("configuracion.texto"));		
		return new ResponseEntity<Map<String, String>>(json, HttpStatus.OK);
	}
}
