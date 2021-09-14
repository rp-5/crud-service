package com.unipampa.crudservice.dto;

import com.unipampa.crudservice.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AmostraDTO {


    private Long numero;
    private Boolean lvc;
    private Boolean morreu;
    private Cao cao;
    private Proprietario proprietario;
    private Localizacao localizacao;
    private Sintoma sintoma;
    private Exame exame;
    private Acao acao;
    private Amostra amostra;
}
