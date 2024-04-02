package com.facvest.petshopcaofeliz.controller;

import com.facvest.petshopcaofeliz.model.FaleConosco;
import com.facvest.petshopcaofeliz.repository.FaleConoscoRepository;
import com.facvest.petshopcaofeliz.service.FaleConoscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contato")
public class FaleConoscoController {

    private final FaleConoscoService faleConoscoService;

    private FaleConoscoRepository faleConoscoRepository;

    @Autowired
    public FaleConoscoController(FaleConoscoService contatoService) {
        this.faleConoscoService = contatoService;
    }

    @GetMapping("/all")
    public ResponseEntity <List<FaleConosco>> getAll(){

        return ResponseEntity.ok(faleConoscoRepository.findAll());

    }
    @PostMapping("/enviar")
    @ResponseBody
    public String enviarContato(@RequestBody FaleConosco faleConosco) {
        faleConoscoService.salvarContato(faleConosco);
        return "Mensagem enviada com sucesso!";
    }
}
