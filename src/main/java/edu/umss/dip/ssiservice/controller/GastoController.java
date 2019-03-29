package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.GastoDto;
import edu.umss.dip.ssiservice.model.Gasto;
import edu.umss.dip.ssiservice.service.GastoService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/gastos")
@Produces(MediaType.APPLICATION_JSON)
public class GastoController  extends GenericController<Gasto, GastoDto> {
    private GastoService service;

    public GastoController(GastoService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<GastoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}


