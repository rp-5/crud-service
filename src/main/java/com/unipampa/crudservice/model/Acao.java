package com.unipampa.crudservice.model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "tb_acao")
public class Acao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true, length = 50)
  private String nome;

  @OneToOne
  private Amostra amostra;
}