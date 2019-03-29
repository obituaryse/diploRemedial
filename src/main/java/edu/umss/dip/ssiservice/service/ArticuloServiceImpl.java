package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Articulo;
import edu.umss.dip.ssiservice.repositories.ArticuloRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl extends GenericServiceImpl<Articulo> implements ArticuloService {
    private final ArticuloRepository repository;

    public ArticuloServiceImpl(ArticuloRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Articulo> getRepository() {
        return repository;
    }
}
