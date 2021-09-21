package com.unipampa.crudservice.model;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String raca;
  private String sexo;
  private Long idade;
  private Boolean vacina;
  private Boolean usaColeira;

  @ManyToOne
  private Proprietario proprietario;

}
