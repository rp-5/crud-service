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

//  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//  @OneToOne(cascade = CascadeType.PERSIST)
//  @JoinColumn(name = "proprietario_id")
//  private Proprietario proprietario;
}
