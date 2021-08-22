package com.unipampa.crudservice.implement;

import com.unipampa.crudservice.interfaces.ICaoService;
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
