package com.unipampa.crudservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmostraDTO {

    private Long amostra;
    private Date data;
    private Long numero;
    private Boolean lvc;
    private Boolean morreu;
}
