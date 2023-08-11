package com.vinte2.backend.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name= "Estado")
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DataAtualizacao;

    
}
