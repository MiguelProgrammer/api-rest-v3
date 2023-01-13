package br.com.estudandoemcasa.clinica.controller;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.repository.DoutorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private DoutorRepository doutorRepository;
    @PostMapping
    public void cadastraMedico(@RequestBody Doutor doutor){
        log.info("Cadastrando novo médico = " + doutor.toString());
        doutorRepository.save(new DoutorEntity(doutor));
    }
}
