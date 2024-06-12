package com.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.MailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class Controller {
	
	private final MailService service;
	
	@GetMapping
	public ResponseEntity<?> getMailList() {
		log.info("mail list 받기 시작");
		
		return new ResponseEntity<>(service.getMailList(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> getMailFile(@RequestBody String num){
		log.info("mail 요약 시작");
//		log.info("num : " + num);
//		return new ResponseEntity<>(HttpStatus.OK);
		return new ResponseEntity<>(service.getSummery(num),HttpStatus.OK);
	}
}
