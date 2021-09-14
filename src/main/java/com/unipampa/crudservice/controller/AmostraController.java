package com.unipampa.crudservice.controller;

import com.unipampa.crudservice.dto.AmostraDTO;
import com.unipampa.crudservice.interfaces.ICaoService;
import com.unipampa.crudservice.interfaces.ILocalizacaoService;
import com.unipampa.crudservice.interfaces.IProprietarioService;
import com.unipampa.crudservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/salvar")
public class AmostraController {

    @Autowired
    private ICaoService caoService;

    @Autowired
    private IProprietarioService proprietarioService;

    @Autowired
    private ILocalizacaoService localizacaoService;


    @PostMapping("/geral")
    public void salvarGeral(@RequestBody AmostraDTO dto){
//        Localizacao localizacao = caputurarLocalizacao(dto);
//        Proprietario proprietario = caputurarProprietario(dto);
//        Cao cao = caputurarCao(dto);
//        Exame exame = caputurarExame(dto);
//        Acao acao = caputurarAcao(dto);
//        Sintoma sintoma = caputurarSintoma(dto);
        Amostra amostra = caputurarAmostra(dto);

//        proprietario.setLocalizacao(localizacao);
//        amostra.setExame(exame);
//        amostra.setAcao(acao);
//        amostra.setSintoma(sintoma);

//        caoService.salvarCao(cao);
//        proprietarioService.salvarProprietario(proprietario);
//        localizacaoService.salvarLocalizacao(localizacao);
    }

    public Amostra caputurarAmostra(AmostraDTO dto){
        Amostra amostra = new Amostra();
//        amostra.setNumero(dto.getAmostra().getNumero());
        amostra.setLvc(dto.getAmostra().getLvc());
        amostra.setMorreu(dto.getAmostra().getMorreu());
        return amostra;
    }

//    public Sintoma caputurarSintoma(AmostraDTO dto){
//        Sintoma sintoma = new Sintoma();
//        sintoma.setNome(dto.getSintoma().getNome());
//        return sintoma;
//    }

//    public Acao caputurarAcao(AmostraDTO dto){
//        Acao acao = new Acao();
//        acao.setNome(dto.getAcao().getNome());
//        return acao;
//    }

//    public Exame caputurarExame(AmostraDTO dto){
//        Exame exame = new Exame();
//        exame.setNome(dto.getExame().getNome());
//        return exame;
//    }

//    public Cao caputurarCao(AmostraDTO dto){
//        Cao cao = new Cao();
//        cao.setNome(dto.getCao().getNome());
//        cao.setRaca(dto.getCao().getRaca());
//        cao.setSexo(dto.getCao().getSexo());
//        cao.setIdade(dto.getCao().getIdade());
//        cao.setVacina(dto.getCao().getVacina());
//        cao.setUsaColeira(dto.getCao().getUsaColeira());
//        return cao;
//    }



//    public Proprietario caputurarProprietario(AmostraDTO dto){
//        Proprietario proprietario = new Proprietario();
//        proprietario.setNome(dto.getProprietario().getNome());
//        proprietario.setCaes(dto.getProprietario().getCaes());
//        return proprietario;
//    }

//    public Localizacao caputurarLocalizacao(AmostraDTO dto){
//        Localizacao localizacao = new Localizacao();
//        localizacao.setEndereco(dto.getLocalizacao().getEndereco());
//        localizacao.setComplemento(dto.getLocalizacao().getComplemento());
//        localizacao.setBairro(dto.getLocalizacao().getBairro());
//        localizacao.setArea(dto.getLocalizacao().getArea());
//        localizacao.setLatitude(dto.getLocalizacao().getLatitude());
//        localizacao.setLongitude(dto.getLocalizacao().getLongitude());
//        return localizacao;
//    }
}
