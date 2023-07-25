package com.bce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderbook")
public class OrderRestController {

	@GetMapping
	public String getStatus() {
		return "Success!";
	}

}
