package br.com.controle.estoque.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Cliente implements Serializable {

    @Id
    private Long id;
    private String nome;
    private Date dataCadastro;
    private String email;
    private String nrCpfCnpj;

}
