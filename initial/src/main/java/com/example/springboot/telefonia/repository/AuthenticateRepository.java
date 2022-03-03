package com.example.springboot.telefonia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.telefonia.Entity.*;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface AuthenticateRepository extends CrudRepository<DefinitivasCuentas, Long>{
}
