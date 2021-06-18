package com.nicordesings.soapclient.models;

public class Request {

    private String numeroIdentificacion;

    public Request() {
    }

    public Request(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "Request{" +
                "numeroIdentificacion='" + numeroIdentificacion + '\'' +
                '}';
    }
}
