/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InterfazPrincipal;

import java.util.List;
import javax.swing.JTable;


/**
 *
 * @author Victor
 */
public class ControladorLista extends InterfazPrincipal{
    
    //busqueda dentro de la lista 
    public static boolean search(List<int[]> list, int item) {
        for (int[] array : list) {
            for (int i : array) {
                for (int j : array) {
                    if (i == item) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //creacion de la lista 
//    List<String[]> ListaVehiculos = new ArrayList<String[]>();
    
    //almacenamineto de la lista
    
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
    
    public static Integer Binario(Integer[] data, Integer valor) {
        int li = 0;
        int ls = data.length;
        while (li <= ls) {
            int lm = (ls - li) / 2 + li;
            if (data[lm] < valor) {
                li = lm + 1;
            } else if (data[lm] > valor) {
                ls = lm - 1;
            } else {
                return lm;
            }
        }
        return null;
    }
    
    //Existe en tabla
    
    public boolean ExisteEnTabla(JTable tabla, String cedula, int col) {
        boolean Existe = false;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            if (tabla.getValueAt(i, col).equals(cedula)) {
                Existe = true;
            }
        }
        return Existe;
    }
}
