package com.fatec.profissional_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.fatec.profissional_api.entities.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {

}
