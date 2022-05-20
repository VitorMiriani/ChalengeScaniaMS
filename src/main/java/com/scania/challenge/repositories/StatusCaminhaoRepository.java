package com.scania.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scania.challenge.model.StatusCaminhao;
@Repository
public interface StatusCaminhaoRepository extends JpaRepository<StatusCaminhao,Integer> {

}
