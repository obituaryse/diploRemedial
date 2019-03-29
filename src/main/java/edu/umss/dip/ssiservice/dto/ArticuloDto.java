package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Articulo;
import org.modelmapper.ModelMapper;

import java.util.List;

public class ArticuloDto  extends DtoBase<Articulo>{
    private String codigo_categoria;
    private String nombre_categoria;
    private Long categoria_id;

    private String marca;
    private String modelo;
    private String capacidad;

    private float gasto_total;
    private Long gasto_id;

    private int cantidad;
    private String estado;

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public float getGasto_total() {
        return gasto_total;
    }

    public void setGasto_total(float gasto_total) {
        this.gasto_total = gasto_total;
    }

    public Long getGasto_id() {
        return gasto_id;
    }

    public void setGasto_id(Long gasto_id) {
        this.gasto_id = gasto_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public ArticuloDto toDto(Articulo arti, ModelMapper mapper) {
        super.toDto(arti, mapper);
        setCodigo_categoria(arti.getCategoria().getCodigo());
        setNombre_categoria(arti.getCategoria().getNombre());
        setCategoria_id(arti.getCategoria().getId());
        setGasto_total(arti.getGasto().getTotal_costo());
        setGasto_id(arti.getGasto().getId());
        /*List<Long> aux = new ArrayList<Long>();
        for (Iterator<Accidente> it = empl.getAccidentes().iterator(); it.hasNext(); ) {
            Accidente f = it.next();
            aux.add(f.getId());
        }*/
        return this;
    }
}
