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

    public Restaurante(String showInputDialog, String showInputDialog1) {
    }
    private String Entradas;
    private String Sopas;
    private String PlatoFuerte;
    private String PlatoSegundario;
    private String Postres;

    public String getMarca() {
        return Entradas;
    }

    public void setMarca(String Marca) {
        this.Entradas = Marca;
    }

    public String getModelo() {
        return Sopas;
    }

    public void setModelo(String Modelo) {
        this.Sopas = Modelo;
    }

    public String getColor() {
        return PlatoFuerte;
    }

    public void setColor(String Color) {
        this.PlatoFuerte = Color;
    }

    public String getPrecio() {
        return PlatoSegundario;
    }

    public void setPrecio(String Precio) {
        this.PlatoSegundario = Precio;
    }

    public String getAño() {
        return Postres;
    }

    public void setAño(String año) {
        this.Postres = año;
    }
       
}
