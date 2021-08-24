package com.unipampa.crudservice.resources;

import com.unipampa.crudservice.dto.AmostraDTO;
import com.unipampa.crudservice.interfaceService.IAmostraService;
import com.unipampa.crudservice.model.Amostra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/amostra")
public class AmostraResource {

    @Autowired
    private IAmostraService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarAmostra(@RequestBody AmostraDTO dto){
        Amostra amostra = new Amostra();
        amostra.setAmostra(dto.getAmostra());
        amostra.setData(dto.getData());
        amostra.setNumero(dto.getNumero());
        amostra.setLvc(dto.getLvc());
        amostra.setMorreu(dto.getMorreu());
        service.salvarAmostra(amostra);
        return ResponseEntity.ok(amostra);
    }
}
