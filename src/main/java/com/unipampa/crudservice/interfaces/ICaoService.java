package com.unipampa.crudservice.interfaces;

import com.unipampa.crudservice.model.Cao;
import org.springframework.stereotype.Service;

@Service
public interface ICaoService {

    public void salvarCao(Cao cao);
}
