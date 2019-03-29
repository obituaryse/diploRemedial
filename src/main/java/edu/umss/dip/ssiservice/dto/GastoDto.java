package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Gasto;

public class GastoDto extends DtoBase<Gasto> {
    private float impuesto;
    private float aduana;
    private float importacion;
    private float traslado;
    private float otros;
    private float total_costo;

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getAduana() {
        return aduana;
    }

    public void setAduana(float aduana) {
        this.aduana = aduana;
    }

    public float getImportacion() {
        return importacion;
    }

    public void setImportacion(float importacion) {
        this.importacion = importacion;
    }

    public float getTraslado() {
        return traslado;
    }

    public void setTraslado(float traslado) {
        this.traslado = traslado;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }

    public float getTotal_costo() {
        return total_costo;
    }

    public void setTotal_costo(float total_costo) {
        this.total_costo = total_costo;
    }
}
