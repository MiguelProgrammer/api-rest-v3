package br.com.estudandoemcasa.clinica.controller;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.dto.DoutorDTO;
import br.com.estudandoemcasa.clinica.repository.DoutorRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/listar")
    public Page<DoutorDTO> listar(Pageable pageable){
        return doutorRepository.findAll(pageable).map(dt -> {
            return new DoutorDTO(dt.getNome(), dt.getEmail(), dt.getCrm(), dt.getEspecialidade());
        });
    }
}
