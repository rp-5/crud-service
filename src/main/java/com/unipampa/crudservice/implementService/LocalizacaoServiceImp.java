package com.unipampa.crudservice.implementService;

import com.unipampa.crudservice.interfaceService.ILocalizacaoService;
import com.unipampa.crudservice.model.Localizacao;
import com.unipampa.crudservice.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoServiceImp implements ILocalizacaoService {

    @Autowired
    private LocalizacaoRepository repository;

    @Override
    public void salvarLocalizacao(Localizacao localizacao) {
        repository.save(localizacao);
    }
}
