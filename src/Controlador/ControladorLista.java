/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InterfazPrincipal;
import java.util.List;


/**
 *
 * @author Victor
 */
public class ControladorLista extends InterfazPrincipal{
    
    //Algoritmo de busqueda lienal o secuencial
    public static Integer Secuencial(List<String[]> data, String valor) {
         Integer pos = null;
        for (int i = 0; i < data.size(); i++) {
            String[] arr = data.get(i);
            for (int j = 0; j < arr.length; j++) {
                if (valor.equals(arr[j])) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }
    
    //algoritmo de busqueda binaria

}
