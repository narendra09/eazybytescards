package com.example.cards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cards.entity.Cards;
import com.example.cards.repository.CardsRepository;

@Service
public class CardsService {
	
	@Autowired
	private CardsRepository repo;

	public List<Cards> findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repo.findByCustomerId(customerId);
		
	}

}
