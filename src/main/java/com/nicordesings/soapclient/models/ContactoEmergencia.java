package com.nicordesings.soapclient.models;

public class ContactoEmergencia {

    private String nombreContacto;
    private String parentescoContacto;
    private String telefonoContacto;
    private String mailContacto;

    public ContactoEmergencia() {
    }

    public ContactoEmergencia(String nombreContacto, String parentescoContacto, String telefonoContacto, String mailContacto) {
        this.nombreContacto = nombreContacto;
        this.parentescoContacto = parentescoContacto;
        this.telefonoContacto = telefonoContacto;
        this.mailContacto = mailContacto;
    }



    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getParentescoContacto() {
        return parentescoContacto;
    }

    public void setParentescoContacto(String parentescoContacto) {
        this.parentescoContacto = parentescoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getMailContacto() {
        return mailContacto;
    }

    public void setMailContacto(String mailContacto) {
        this.mailContacto = mailContacto;
    }

    @Override
    public String toString() {
        return "ContactoEmergencia{" +
                "nombreContacto='" + nombreContacto + '\'' +
                ", parentescoContacto='" + parentescoContacto + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", mailContacto='" + mailContacto + '\'' +
                '}';
    }


}
