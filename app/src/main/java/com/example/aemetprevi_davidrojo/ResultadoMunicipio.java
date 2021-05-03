package com.example.aemetprevi_davidrojo;

/**
 * Clase POJO ResultadoMunicipio, para deserializar la primera respuesta del servidor
 * cuando solicitamos la predicción de un municipio
 */

public class ResultadoMunicipio {

    //ESTADO
    protected String descripcion;
    protected String estado;
    protected String datos;
    protected String metadatos;


    //COMPORTAMIENTO
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(String metadatos) {
        this.metadatos = metadatos;
    }
}
