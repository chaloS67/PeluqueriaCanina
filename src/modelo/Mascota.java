/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author gonza
 */
public class Mascota {
    
    private String num_Cliente;
    private String nom_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String nom_dueño;
    private String cel_dueño;
    private String observacion;
    
    
    public Mascota(){
    
        num_Cliente = "";
        nom_perro = "";
        raza = "";
        color = "";
        alergico = "";
        atencion_especial = "";
        nom_dueño = "";
        cel_dueño = "";
        observacion = "";
    
    
    
    }

    public void setNumCliente(String numCliente) {
        this.num_Cliente = numCliente;
    }

    public void setNom_perro(String nom_perro) {
        this.nom_perro = nom_perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setNom_dueño(String nom_dueño) {
        this.nom_dueño = nom_dueño;
    }

    public void setCel_dueño(String cel_dueño) {
        this.cel_dueño = cel_dueño;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNumCliente() {
        return num_Cliente;
    }

    public String getNom_perro() {
        return nom_perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public String getNom_dueño() {
        return nom_dueño;
    }

    public String getCel_dueño() {
        return cel_dueño;
    }

    public String getObservacion() {
        return observacion;
    }
   
    
    
    
}
