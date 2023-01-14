package br.com.estudandoemcasa.clinica.model;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;

public record DoutorDTO(String nome, String email, String crm, Especialidade especialidade) {

}
