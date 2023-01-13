package br.com.estudandoemcasa.clinica.model;

public record Doutor(Long id, String nome, String email, String crm, Especialidade especialidade, Endereco endereco){

}
