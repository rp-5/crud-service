package com.unipampa.crudservice.dto;

import com.unipampa.crudservice.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AmostraDTO {


    private Long numero;
    private Boolean lvc;
    private Boolean morreu;
    private List<Cao> caes;
    private Proprietario proprietario;
    private List<Localizacao> localizacoes;
    private List<Sintoma> sintomas;
    private List<Exame> exames;
    private Acao acao;
    private Amostra amostra;
}
