package com.scania.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scania.challenge.model.Caminhao;

@Repository
public interface CaminhaoRepository extends JpaRepository<Caminhao, Integer>  {

	
}
