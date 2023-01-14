package br.com.estudandoemcasa.clinica.controller;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.repository.DoutorRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private DoutorRepository doutorRepository;
    @PostMapping
    @Transactional
    public void cadastraMedico(@RequestBody @Valid Doutor doutor){
        log.info("Cadastrando novo médico = " + doutor.toString());
        doutorRepository.save(new DoutorEntity(doutor));
    }
}
