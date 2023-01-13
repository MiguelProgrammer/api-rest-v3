package br.com.estudandoemcasa.clinica.entities;


import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.model.Endereco;
import br.com.estudandoemcasa.clinica.model.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doutores")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DoutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private EnderecoEntity endereco;

    public DoutorEntity(Doutor doutor) {
        this.id = doutor.id();;
        this.nome = doutor.nome();
        this.email = doutor.email();
        this.crm = doutor.crm();
        this.especialidade = doutor.especialidade();
        this.endereco = new EnderecoEntity(doutor.endereco());
    }
}
