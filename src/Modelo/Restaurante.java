/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author Victor
 */
public class Restaurante {
    
    private String Entrada;
    private String Sopas;
    private String PlatoFuerte;
    private String PlatoSegundario;
    private String Postres;
    
    public Restaurante(String Entrada, String Sopas, String PlatoFuerte, String PlatoSegundario, String Postres) {
        this.Entrada = Entrada;
        this.Sopas = Sopas;
        this.PlatoFuerte = PlatoFuerte;
        this.PlatoSegundario = PlatoSegundario;
        this.Postres = Postres;
    }

    public String getEntradas() {
        return Entrada;
    }

    public void setEntradas(String Entradas) {
        this.Entrada = Entradas;
    }

    public String getSopas() {
        return Sopas;
    }

    public void setSopas(String Sopas) {
        this.Sopas = Sopas;
    }

    public String getPlatoFuerte() {
        return PlatoFuerte;
    }

    public void setPlatoFuerte(String PlatoFuerte) {
        this.PlatoFuerte = PlatoFuerte;
    }

    public String getPlatoSegundario() {
        return PlatoSegundario;
    }

    public void setPlatoSegundario(String PlatoSegundario) {
        this.PlatoSegundario = PlatoSegundario;
    }

    public String getPostres() {
        return Postres;
    }

    public void setPostres(String Postres) {
        this.Postres = Postres;
    } 
}
