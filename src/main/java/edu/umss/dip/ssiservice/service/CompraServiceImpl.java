package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Compra;
import edu.umss.dip.ssiservice.repositories.CompraRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImpl extends GenericServiceImpl<Compra> implements CompraService {
    private final CompraRepository repository;

    public CompraServiceImpl(CompraRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Compra> getRepository() {
        return repository;
    }
}


