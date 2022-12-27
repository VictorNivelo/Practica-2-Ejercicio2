/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InterfazPrincipal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author Victor
 */
public class ControladorLista extends InterfazPrincipal{ 
    
//    public static void Guardar() throws IOException{
//        
//        Gson gson = new Gson();
//
//        JsonArray jsonArray = gson.toJsonTree("").getAsJsonArray();
//
//        try (FileWriter writer = new FileWriter("lista.json")) {
//            writer.write(jsonArray.toString());
//        }
//    }
    
    //busqueda dentro de la lista 
    public static boolean search(List<String[]> list, String item) {
        for (String[] array : list) {
            for (String i : array) {
                for (String j : array) {
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
    
    public static Integer Binario(List<String[]> data, String valor) {
        for(int i = 0; i < data.size(); i++){
            String[] Arreglo = data.get(i);
        }
        
        int izquierda = 0;
        int derecha = data.size();
        while (izquierda <= derecha) {
            int Busqueda = (derecha - izquierda)/ 2 + izquierda;
            if (data.get(Busqueda).equals(izquierda)) {
                izquierda = Busqueda + 1;
            } else if (data.get(Busqueda).equals(valor)) {
                derecha = Busqueda - 1;
            } else {
                return Busqueda;
            }
        }
        return null;
        
    }
    
    public void binaria(List<String[]> data, int valor){
        for (int i = 0; i < data.size(); i++) {
            String[] firstArray = data.get(i);
            String arreglo = Arrays.asList(firstArray).toString();

//            System.out.println(Arrays.asList(firstArray));
//            System.out.println(""+arreglo);
            List<String> list = Arrays.asList(arreglo);

            Collections.sort(list);

            System.out.println("" + list);

            String elementToFind = JOptionPane.showInputDialog(null, "verga");

            int izquierda = 0;
            int derecha = data.size();
            int mitad = -1;

            while (izquierda <= derecha) {
                mitad = ((izquierda + derecha) / 2);

                String mitadElemento = list.get(mitad);

                if (mitadElemento.equals(elementToFind)) {
                    break;
                } else if (mitadElemento.compareTo(elementToFind) < 0) {
                    izquierda = mitad + 1;
                } else {
                    derecha = mitad - 1;
                }
            }
            if (mitad != -1) {
                System.out.println("Elemento encontrado en " + (mitad + 1));
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
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
