package br.com.estudandoemcasa.clinica.entities;


import br.com.estudandoemcasa.clinica.model.Doutor;
import br.com.estudandoemcasa.clinica.model.Especialidade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Table(name = "doutores")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DoutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nome;
    private String email;
    @Setter
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Setter
    @Embedded
    private EnderecoEntity endereco;
    @Setter
    private Boolean ativo;

    public DoutorEntity(Doutor doutor) {
        this.id = doutor.id();;
        this.nome = doutor.nome();
        this.email = doutor.email();
        this.telefone = doutor.telefone();
        this.crm = doutor.crm();
        this.especialidade = doutor.especialidade();
        this.endereco = new EnderecoEntity(doutor.endereco());
        this.ativo = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DoutorEntity that = (DoutorEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
