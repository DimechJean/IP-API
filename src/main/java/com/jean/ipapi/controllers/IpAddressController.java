package com.jean.ipapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpAddressController {
	
	@RequestMapping("/generate")
	public String generate() {
		return "Generating and reserving IP address";
	}
}
