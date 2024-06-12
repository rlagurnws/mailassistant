package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.InitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/init")
@RequiredArgsConstructor
public class InitController {

	private final InitService initService;
	
	@GetMapping
	public void init() {
		initService.PersonInit();
		initService.MailInit();
		initService.ContentInit();
	}
}
