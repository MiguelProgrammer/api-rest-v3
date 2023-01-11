package br.com.estudandoemcasa.clinica.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Doutor {

    private Long id;
    private String nome;
    private String crn;
}
