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

//  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//  @OneToOne (cascade = CascadeType.PERSIST)
//  @JoinColumn(name = "proprietario_id")
//  private Proprietario proprietario;
}
