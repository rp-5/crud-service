package com.unipampa.crudservice.implementService;

import com.unipampa.crudservice.interfaceService.ICaoService;
import com.unipampa.crudservice.model.Cao;
import com.unipampa.crudservice.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaoServiceImp implements ICaoService {

    @Autowired
    CaoRepository repository;

    @Override
    public void salvarCao(Cao cao) {
        repository.save(cao);
    }
}
