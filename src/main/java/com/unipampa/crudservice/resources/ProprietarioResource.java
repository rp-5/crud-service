package com.unipampa.crudservice.resources;

import com.unipampa.crudservice.dto.ProprietarioDTO;
import com.unipampa.crudservice.interfaceService.IProprietarioService;
import com.unipampa.crudservice.model.Proprietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proprietario")
public class ProprietarioResource {

    @Autowired
    private IProprietarioService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarProprietario(@RequestBody ProprietarioDTO dto) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(dto.getNome());
        return ResponseEntity.ok(proprietario);
    }
}
