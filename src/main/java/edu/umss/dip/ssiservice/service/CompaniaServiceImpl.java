package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Compania;
import edu.umss.dip.ssiservice.repositories.CompaniaRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CompaniaServiceImpl extends GenericServiceImpl<Compania> implements CompaniaService {
    private final CompaniaRepository repository;

    public CompaniaServiceImpl(CompaniaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Compania> getRepository() {
        return repository;
    }
}

