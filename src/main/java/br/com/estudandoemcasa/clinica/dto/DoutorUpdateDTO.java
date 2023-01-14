package br.com.estudandoemcasa.clinica.dto;

import br.com.estudandoemcasa.clinica.model.Endereco;
import jakarta.validation.constraints.NotNull;

public record DoutorUpdateDTO(

        @NotNull
        Long id,

        String nome,
        String telefone,
        Endereco endereco) {
}
