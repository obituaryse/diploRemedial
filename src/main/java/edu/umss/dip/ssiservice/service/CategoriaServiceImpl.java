package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Categoria;
import edu.umss.dip.ssiservice.repositories.CategoriaRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends GenericServiceImpl<Categoria> implements CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaServiceImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Categoria> getRepository() {
        return repository;
    }
}

