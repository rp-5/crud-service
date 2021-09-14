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
  @JoinColumn(name = "num_amostra")
  private Amostra amostra;

//  @OneToOne (cascade = CascadeType.PERSIST)
//  private Localizacao localizacao;
//  @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
//  private Set<Localizacao> localizacao;

//  @OneToMany
//  private List<Cao> caes;
}
