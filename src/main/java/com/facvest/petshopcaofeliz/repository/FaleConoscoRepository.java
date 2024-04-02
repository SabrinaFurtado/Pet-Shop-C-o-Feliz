package com.facvest.petshopcaofeliz.repository;

import com.facvest.petshopcaofeliz.model.FaleConosco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaleConoscoRepository extends JpaRepository <FaleConosco, Long> {

}
