package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.CategoriaDto;

import javax.persistence.Entity;

@Entity
public class Categoria  extends ModelBase<CategoriaDto> {
    private String nombre;
    private String descripcion;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
