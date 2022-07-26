package com.example.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cards.entity.Cards;
import com.example.cards.service.CardsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CardsController {
	

	@Autowired
	private CardsService cardsService;

	@GetMapping("/myCard/{customerId}")
	public ResponseEntity<List<Cards>> getAccountDetails(@PathVariable int customerId) {

		log.info("inside cards controller");
		List<Cards> loans = cardsService.findByCustomerId(customerId);
		log.info("end of cards controller");
		return  new ResponseEntity<List<Cards>>(loans, HttpStatus.OK) ;
		

	}

}
