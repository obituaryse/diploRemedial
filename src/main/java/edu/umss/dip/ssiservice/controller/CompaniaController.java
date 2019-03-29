package edu.umss.dip.ssiservice.controller;


import edu.umss.dip.ssiservice.dto.CompaniaDto;
import edu.umss.dip.ssiservice.model.Compania;
import edu.umss.dip.ssiservice.service.CompaniaService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/companias")
@Produces(MediaType.APPLICATION_JSON)
public class CompaniaController extends GenericController<Compania, CompaniaDto> {
    private CompaniaService service;

    public CompaniaController(CompaniaService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<CompaniaDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
