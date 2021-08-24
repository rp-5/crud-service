package com.unipampa.crudservice.implementService;

import com.unipampa.crudservice.interfaceService.IAmostraService;
import com.unipampa.crudservice.model.Amostra;
import com.unipampa.crudservice.repository.AmostraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmostraServiceImp implements IAmostraService {

    @Autowired
    private AmostraRepository repository;

    @Override
    public void salvarAmostra(Amostra amostra) {
        repository.save(amostra);
    }
}
