package com.facvest.petshopcaofeliz.service;

import com.facvest.petshopcaofeliz.controller.FaleConoscoController;
import com.facvest.petshopcaofeliz.model.FaleConosco;
import com.facvest.petshopcaofeliz.repository.FaleConoscoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaleConoscoService {

    private FaleConoscoRepository faleConoscoRepository;

    @Autowired
    public FaleConoscoService(FaleConoscoRepository faleConoscoRepository) {
        this.faleConoscoRepository = faleConoscoRepository;
    }

    public FaleConosco salvarContato(FaleConosco faleConosco) {
        return faleConoscoRepository.save(faleConosco);
    }
}
