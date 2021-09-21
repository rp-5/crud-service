package com.unipampa.crudservice.model;

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
public class Exame {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @ManyToOne
  private Amostra amostra;
}