package com.ContaBancariaSpring.Ex02.repository;

import com.ContaBancariaSpring.Ex02.model.ContaBancariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaModel, Long>  {

}
