package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Gasto;
import edu.umss.dip.ssiservice.repositories.GastoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class GastoServiceImpl extends GenericServiceImpl<Gasto> implements GastoService {
    private final GastoRepository repository;

    public GastoServiceImpl(GastoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Gasto> getRepository() {
        return repository;
    }
}
