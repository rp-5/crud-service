package com.unipampa.crudservice.resources;

import com.unipampa.crudservice.dto.CaoDTO;
import com.unipampa.crudservice.model.Cao;
import com.unipampa.crudservice.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cao")
public class CaoResource {

    @Autowired
    private CaoRepository repository;

    @GetMapping
    public ResponseEntity<List<Cao>> findAll(){
        List<Cao> caes = repository.findAll();
        return ResponseEntity.ok(caes);
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> salvarCao(@RequestBody CaoDTO dto){
        Cao cao = new Cao();
        cao.setNome(dto.getNome());
        cao.setRaca(dto.getRaca());
        cao.setSexo(dto.getSexo());
        repository.save(cao);
        return ResponseEntity.ok(cao);
    }
}
