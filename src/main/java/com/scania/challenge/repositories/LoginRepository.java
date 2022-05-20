package com.scania.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scania.challenge.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {

}
