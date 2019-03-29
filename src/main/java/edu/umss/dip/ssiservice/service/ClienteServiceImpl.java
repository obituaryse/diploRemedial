package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Cliente;
import edu.umss.dip.ssiservice.repositories.ClienteRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente> implements ClienteService {
    private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Cliente> getRepository() {
        return repository;
    }
}
