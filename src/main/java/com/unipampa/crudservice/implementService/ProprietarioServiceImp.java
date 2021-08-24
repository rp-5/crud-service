package com.unipampa.crudservice.implementService;

import com.unipampa.crudservice.interfaceService.IProprietarioService;
import com.unipampa.crudservice.model.Proprietario;
import com.unipampa.crudservice.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioServiceImp implements IProprietarioService {

    @Autowired
    private PropietarioRepository repository;

    @Override
    public void salvarProprietario(Proprietario proprietario) {
        repository.save(proprietario);
    }
}
