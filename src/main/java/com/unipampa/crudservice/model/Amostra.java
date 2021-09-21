package com.unipampa.crudservice.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Amostra {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long numAmostra;
  private Date data;
  private Boolean lvc;
  private Boolean morreu;

  @OneToOne
  private Proprietario proprietario;

  @OneToOne
  private Acao acao;

  @OneToMany
  private List<Sintoma> sintomas;

  @OneToMany
  private List<Exame> exames;

}