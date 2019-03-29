package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.CompraDto;
import edu.umss.dip.ssiservice.model.Articulo;
import edu.umss.dip.ssiservice.model.Compra;
import edu.umss.dip.ssiservice.service.ArticuloService;
import edu.umss.dip.ssiservice.service.ClienteService;
import edu.umss.dip.ssiservice.service.CompraService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@Path("/compras")
@Produces(MediaType.APPLICATION_JSON)
public class CompraController extends GenericController<Compra, CompraDto> {
    private CompraService service;
    private ClienteService clienteService;
    private ArticuloService articuloService;

    public CompraController(CompraService service, ClienteService clienteService, ArticuloService articuloService) {
        this.service = service;
        this.clienteService = clienteService;
        this.articuloService = articuloService;
    }

    @Override
    @GET
    public List<CompraDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Compra toModel(CompraDto dto) {
        Compra compra = super.toModel(dto);
        compra.setCliente(clienteService.findById(dto.getCliente_id()));
        Set<Articulo> articulos = new HashSet<>();
        System.out.println("antes de entrar");
        for (int i = 0; i < dto.getArticulos_id().size(); i++) {
            Long ss = dto.getArticulos_id().get(i);
            System.out.println(ss);
            articulos.add(articuloService.findById(dto.getArticulos_id().get(i)));
        }
        compra.setArticulos(articulos);
        return compra;
    }
}