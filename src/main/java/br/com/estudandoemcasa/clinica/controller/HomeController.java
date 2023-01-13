package br.com.estudandoemcasa.clinica.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello World.";
    }
    @GetMapping("/developer")
    public String developer(){
        return "MiguelProgrammer";
    }
}