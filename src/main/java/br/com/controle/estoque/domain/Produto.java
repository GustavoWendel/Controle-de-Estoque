package br.com.controle.estoque.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Produto implements Serializable {

    @Id
    private Long id;
    private String descricao;
    private BigDecimal precoDeCompra;
    private BigDecimal precoDeVenda;
    private Integer quantidade;

}
