package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ClienteDto;
import edu.umss.dip.ssiservice.model.Cliente;
import edu.umss.dip.ssiservice.service.ClienteService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
public class ClienteController extends GenericController<Cliente, ClienteDto> {
    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<ClienteDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
