package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ArticuloDto;
import edu.umss.dip.ssiservice.model.Articulo;
import edu.umss.dip.ssiservice.service.ArticuloService;
import edu.umss.dip.ssiservice.service.CategoriaService;
import edu.umss.dip.ssiservice.service.GastoService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/articulos")
@Produces(MediaType.APPLICATION_JSON)
public class ArticuloController extends GenericController<Articulo, ArticuloDto> {
    private ArticuloService service;
    private CategoriaService categoriaService;
    private GastoService gastoService;

    public ArticuloController(ArticuloService service, CategoriaService categoriaService, GastoService gastoService) {
        this.service = service;
        this.categoriaService = categoriaService;
        this.gastoService = gastoService;
    }

    @Override
    @GET
    public List<ArticuloDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Articulo toModel(ArticuloDto dto){
        Articulo articulo = super.toModel(dto);
        articulo.setCategoria(categoriaService.findById(dto.getCategoria_id()));
        articulo.setGasto(gastoService.findById(dto.getGasto_id()));
        return articulo;
    }
}