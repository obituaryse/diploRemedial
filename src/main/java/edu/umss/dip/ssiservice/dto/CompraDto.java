package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Articulo;
import edu.umss.dip.ssiservice.model.Compra;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompraDto extends DtoBase<Compra> {

    private  String observaciones;
    private  int unidades;
    private float monto;
    private Date fecha;
    private String cliente_nombre;
    private String cliente_ci;
    private Long cliente_id;
    private List<Long> articulos_id;

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente_nombre() {
        return cliente_nombre;
    }

    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    public String getCliente_ci() {
        return cliente_ci;
    }

    public void setCliente_ci(String cliente_ci) {
        this.cliente_ci = cliente_ci;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public List<Long> getArticulos_id() {
        return articulos_id;
    }

    public void setArticulos_id(List<Long> articulos_id) {
        this.articulos_id = articulos_id;
    }

    @Override
    public DtoBase toDto(Compra element, ModelMapper mapper) {
        System.out.println("comenzandoo");
        super.toDto(element, mapper);
        System.out.println("sesrra");
        setCliente_nombre(element.getCliente().getNombres());
        System.out.println("dosoos2");
        setCliente_ci(element.getCliente().getCi());
        System.out.println("3");
        setCliente_id(element.getCliente().getId());
        System.out.println("terminandp");
        List<Long> aux = new ArrayList<Long>();
        for (Iterator<Articulo> it = element.getArticulos().iterator(); it.hasNext(); ) {
            Articulo f = it.next();
            aux.add(f.getId());
        }
        setArticulos_id(aux);
        return this;
    }
}
