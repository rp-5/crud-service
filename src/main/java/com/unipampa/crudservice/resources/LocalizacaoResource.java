package com.unipampa.crudservice.resources;

import com.unipampa.crudservice.dto.LocalizacaoDTO;
import com.unipampa.crudservice.interfaceService.IExameService;
import com.unipampa.crudservice.interfaceService.ILocalizacaoService;
import com.unipampa.crudservice.model.Localizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoResource {

    @Autowired
    private ILocalizacaoService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarLocalizacao(@RequestBody LocalizacaoDTO dto){
        Localizacao localizacao = new Localizacao();
        localizacao.setEndereco(dto.getEndereco());
        service.salvarLocalizacao(localizacao);
        return ResponseEntity.ok(localizacao);
    }
}
