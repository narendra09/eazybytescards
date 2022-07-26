package com.example.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cards.entity.Cards;

public interface CardsRepository extends JpaRepository<Cards, Integer> {

	List<Cards> findByCustomerId(int customerId);
}
