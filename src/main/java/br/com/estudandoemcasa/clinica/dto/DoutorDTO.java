package br.com.estudandoemcasa.clinica.dto;

import br.com.estudandoemcasa.clinica.entities.DoutorEntity;
import br.com.estudandoemcasa.clinica.model.Especialidade;

public record DoutorDTO(Long id, String nome, String email, String crm, Especialidade especialidade, Boolean ativo) {

}
