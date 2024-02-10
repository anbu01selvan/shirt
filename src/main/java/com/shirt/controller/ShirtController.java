package com.shirt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShirtController {

	@GetMapping("msg")
	public String getMsg() {
		return "this is shirt";
	}
}
