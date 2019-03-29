package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.CompraDto;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Compra  extends ModelBase<CompraDto>  {
    private  String observaciones;
    private  int unidades;
    private  float monto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @ManyToOne(optional = false)
    private Cliente cliente;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "compra_articulo",
            joinColumns = @JoinColumn(name = "compra_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_id", referencedColumnName = "id"))
    private Set<Articulo> articulos = new HashSet<>();

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
}