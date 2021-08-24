package com.unipampa.crudservice.resources;

import com.unipampa.crudservice.dto.ExameDTO;
import com.unipampa.crudservice.interfaceService.IExameService;
import com.unipampa.crudservice.model.Exame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exame")
public class ExameResource {

    @Autowired
    private IExameService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarExame(@RequestBody ExameDTO dto){
        Exame exame = new Exame();
        exame.setNome(dto.getNome());
        service.salvarExame(exame);
        return ResponseEntity.ok(exame);
    }
}
