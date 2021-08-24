package com.unipampa.crudservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalizacaoDTO {
    private String endereco;
    private String complemento;
    private String bairro;
    private String area;
    private Float latitude;
    private Float longitude;
}
