package br.com.controle.estoque.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
public class Venda implements Serializable {

    @Id
    private String nome;
    private Date dataCadastro;

}
