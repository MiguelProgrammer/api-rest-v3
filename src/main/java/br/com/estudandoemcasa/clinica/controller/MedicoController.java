package br.com.estudandoemcasa.clinica.controller;

import br.com.estudandoemcasa.clinica.model.Doutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    public void cadastraMedico(@RequestBody Doutor doutor){
        log.info("Recebendo novo médido: " + doutor.toString());
    }
}
