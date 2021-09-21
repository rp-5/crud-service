package com.unipampa.crudservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proprietario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @OneToOne
  private Amostra amostra;

  @OneToMany
  private List<Localizacao> localizacoes;

  @OneToMany
  private List<Cao> caes;
}
