package com.boaglio.casadocodigo.springbootproperties.properties.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Propriedade {

    @Id
    private String nome;
    private String valor;
    private String descricao;
    private String categoria;
    private String subcategoria;

}
