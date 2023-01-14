package br.com.estudandoemcasa.clinica.controller;

import br.com.estudandoemcasa.clinica.dto.DoutorUpdateDTO;
import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import br.com.estudandoemcasa.clinica.entities.EnderecoEntity;
import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.dto.DoutorDTO;
import br.com.estudandoemcasa.clinica.repository.DoutorRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    public Page<DoutorDTO> listar(@PageableDefault(size = 7, sort = {"crm"}) Pageable pageable){
        return doutorRepository.findAll(pageable).map(dt -> {
            return new DoutorDTO(dt.getId(), dt.getNome(), dt.getEmail(), dt.getCrm(), dt.getEspecialidade(), dt.getAtivo());
        });
    }
    @GetMapping("/listar/ativos")
    public Page<DoutorDTO> listarAtivos(@PageableDefault(size = 7, sort = {"crm"}) Pageable pageable){
        return doutorRepository.findAllByAtivoTrue(pageable).map(dt -> {
            return new DoutorDTO(dt.getId(), dt.getNome(), dt.getEmail(), dt.getCrm(), dt.getEspecialidade(), dt.getAtivo());
        });
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DoutorUpdateDTO doutor){
        var dt =  doutorRepository.findById(doutor.id());
        if(dt.isPresent()){

            if(Objects.nonNull(doutor.nome())) {
                dt.get().setNome(doutor.nome());
            }

            if(Objects.nonNull(doutor.telefone())) {
                dt.get().setTelefone(doutor.telefone());
            }

            if(Objects.nonNull(doutor.endereco())) {
                dt.get().setEndereco(new EnderecoEntity(doutor.endereco()));
            }

            if(Objects.nonNull(doutor.ativo())) {
                dt.get().setAtivo(doutor.ativo());
            }
        }
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void listar(@PathVariable("id") Long id){
        var dt =  doutorRepository.findById(id);
        if(Objects.nonNull(dt)){
            dt.get().setAtivo(false);
        }
    }
}
