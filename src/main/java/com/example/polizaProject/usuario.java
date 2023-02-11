package com.example.polizaProject;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "DatosPoliza")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idpoliza;
    private Long numDocumento;
    private String nombre;
    private Date fechaNacimiento;
    private String ciudadResidencia;
    private String direccion;

    private Date fechaPoliza;
    private String coberturaPoliza;
    private Integer valorMaximoPoliza;
    private String nombrePoliza;
    private String placaAuto;
    private Integer modeloAuto;
    private Boolean inspeccion;

    public usuario(Long idpoliza, Long numDocumento, String nombre, Date fechaNacimiento, String ciudadResidencia, String direccion, Date fechaPoliza, String coberturaPoliza, Integer valorMaximoPoliza, String nombrePoliza, String placaAuto, Integer modeloAuto, Boolean inspeccion) {
        this.idpoliza = idpoliza;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadResidencia = ciudadResidencia;
        this.direccion = direccion;
        this.fechaPoliza = fechaPoliza;
        this.coberturaPoliza = coberturaPoliza;
        this.valorMaximoPoliza = valorMaximoPoliza;
        this.nombrePoliza = nombrePoliza;
        this.placaAuto = placaAuto;
        this.modeloAuto = modeloAuto;
        this.inspeccion = inspeccion;
    }

    public usuario(){

    }

    public Long getIdpoliza() {
        return idpoliza;
    }

    public void setIdpoliza(Long idpoliza) {
        this.idpoliza = idpoliza;
    }

    public Long getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Long numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaPoliza() {
        return fechaPoliza;
    }

    public void setFechaPoliza(Date fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public String getCoberturaPoliza() {
        return coberturaPoliza;
    }

    public void setCoberturaPoliza(String coberturaPoliza) {
        this.coberturaPoliza = coberturaPoliza;
    }

    public Integer getValorMaximoPoliza() {
        return valorMaximoPoliza;
    }

    public void setValorMaximoPoliza(Integer valorMaximoPoliza) {
        this.valorMaximoPoliza = valorMaximoPoliza;
    }

    public String getNombrePoliza() {
        return nombrePoliza;
    }

    public void setNombrePoliza(String nombrePoliza) {
        this.nombrePoliza = nombrePoliza;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }

    public Integer getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(Integer modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public Boolean getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Boolean inspeccion) {
        this.inspeccion = inspeccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return idpoliza.equals(usuario.idpoliza) && numDocumento.equals(usuario.numDocumento) && nombre.equals(usuario.nombre) && fechaNacimiento.equals(usuario.fechaNacimiento) && ciudadResidencia.equals(usuario.ciudadResidencia) && direccion.equals(usuario.direccion) && fechaPoliza.equals(usuario.fechaPoliza) && coberturaPoliza.equals(usuario.coberturaPoliza) && valorMaximoPoliza.equals(usuario.valorMaximoPoliza) && nombrePoliza.equals(usuario.nombrePoliza) && placaAuto.equals(usuario.placaAuto) && modeloAuto.equals(usuario.modeloAuto) && inspeccion.equals(usuario.inspeccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpoliza, numDocumento, nombre, fechaNacimiento, ciudadResidencia, direccion, fechaPoliza, coberturaPoliza, valorMaximoPoliza, nombrePoliza, placaAuto, modeloAuto, inspeccion);
    }

    @Override
    public String toString() {
        return "usuario{" +
                "idpoliza=" + idpoliza +
                ", numDocumento=" + numDocumento +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ciudadResidencia='" + ciudadResidencia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaPoliza=" + fechaPoliza +
                ", coberturaPoliza='" + coberturaPoliza + '\'' +
                ", valorMaximoPoliza=" + valorMaximoPoliza +
                ", nombrePoliza='" + nombrePoliza + '\'' +
                ", placaAuto='" + placaAuto + '\'' +
                ", modeloAuto=" + modeloAuto +
                ", inspeccion=" + inspeccion +
                '}';
    }
}
