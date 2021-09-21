package com.unipampa.crudservice.model;

import javax.persistence.*;

import lombok.*;



@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Localizacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String endereco;
  private String complemento;
  private String bairro;
  private String area;
  private Float latitude;
  private Float longitude;

  @ManyToOne
  private Proprietario proprietario;

}
