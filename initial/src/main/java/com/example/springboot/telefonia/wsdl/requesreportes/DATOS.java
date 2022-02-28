package com.example.springboot.telefonia.wsdl.requesreportes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.example.springboot.telefonia.wsdl.requesreportes.CONSULTAINVENTARIOREFERENCIA;
import com.example.springboot.telefonia.wsdl.requesreportes.CONSULTADETALLEPROCESO;


@JacksonXmlRootElement(localName = "DATOS")
public class DATOS {
    @JacksonXmlProperty(localName = "USUARIO")
    public String USUARIO;
    @JacksonXmlProperty(localName = "CLAVE")
    public String CLAVE;
    @JacksonXmlProperty(localName = "NOMBRE")
    public String NOMBRE;
    @JacksonXmlProperty(localName = "IDEMP")
    public String IDEMP;
    @JacksonXmlProperty(localName = "CONSULTAINVENTARIOREFERENCIA")
    public CONSULTAINVENTARIOREFERENCIA CONSULTAINVENTARIOREFERENCIA;
    @JacksonXmlProperty(localName = "CONSULTADETALLEPROCESO")
    public CONSULTADETALLEPROCESO CONSULTADETALLEPROCESO;

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getIDEMP() {
        return IDEMP;
    }

    public void setIDEMP(String IDEMP) {
        this.IDEMP = IDEMP;
    }

    public CONSULTAINVENTARIOREFERENCIA getCONSULTAINVENTARIOREFERENCIA() {
        return CONSULTAINVENTARIOREFERENCIA;
    }

    public void setCONSULTAINVENTARIOREFERENCIA(CONSULTAINVENTARIOREFERENCIA CONSULTAINVENTARIOREFERENCIA) {
        this.CONSULTAINVENTARIOREFERENCIA = CONSULTAINVENTARIOREFERENCIA;
    }

    public CONSULTADETALLEPROCESO getCONSULTADETALLEPROCESO() {
        return CONSULTADETALLEPROCESO;
    }

    public void setCONSULTADETALLEPROCESO(CONSULTADETALLEPROCESO CONSULTADETALLEPROCESO) {
        this.CONSULTADETALLEPROCESO = CONSULTADETALLEPROCESO;
    }
}
