package com.converter.forex.forexService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.converter.forex.forexService.entities.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
