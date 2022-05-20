package com.scania.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scania.challenge.model.Localizacao;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao,Integer> {

	
	
}
