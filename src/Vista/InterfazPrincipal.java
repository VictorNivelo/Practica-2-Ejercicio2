/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorLista;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author Victor
 */
public class InterfazPrincipal extends javax.swing.JFrame{
    
    List<String[]> lista = new ArrayList<>();
    

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarValor = new javax.swing.JButton();
        btnEliminarValor = new javax.swing.JButton();
        btnImprimirLista = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMarcaVehiculo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAñoVehiculo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtModeloVehiculo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioVehiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtColorVehiculo = new javax.swing.JTextField();
        btnBusquedaLineal = new javax.swing.JButton();
        btnBusquedaBinaria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESTAURANTE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESTAURANTES");

        btnAgregarValor.setText("AGREGAR VALOR");
        btnAgregarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarValorActionPerformed(evt);
            }
        });

        btnEliminarValor.setText("ELIMINAR VALOR");
        btnEliminarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarValorActionPerformed(evt);
            }
        });

        btnImprimirLista.setText("IMPRIMIR LISTA");
        btnImprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirListaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENTRADAS");

        txtMarcaVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SOPAS");

        txtAñoVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PLATOS FUERTES");

        txtModeloVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PLATOS SEGUNDARIOS");

        txtPrecioVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POSTRES");

        txtColorVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBusquedaLineal.setText("BUSQIEDA LINEAL");
        btnBusquedaLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaLinealActionPerformed(evt);
            }
        });

        btnBusquedaBinaria.setText("BUSQUEDA BINARIA");
        btnBusquedaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaBinariaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBusquedaLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBusquedaBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnImprimirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecioVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txtMarcaVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtColorVehiculo)
                                            .addGap(256, 256, 256))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtAñoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnEliminarValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarValor)
                    .addComponent(btnEliminarValor))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirLista)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusquedaBinaria)
                    .addComponent(btnBusquedaLineal))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirListaActionPerformed
        // TODO add your handling code here:
        
        System.out.println("==================== LISTA COMPLETA ======================");
        for (String[] arreglo : lista) {
            System.out.println(Arrays.toString(arreglo));
        }
        System.out.println("==========================================================");
//        System.out.println("Guardando en json...");
//        System.out.println("Guardado");
        
    }//GEN-LAST:event_btnImprimirListaActionPerformed

    private void btnEliminarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarValorActionPerformed
        // TODO add your handling code here:
        
        int indiceArreglo = -1;
        String DatosEliminar = JOptionPane.showInputDialog(null, "Escriba la elemento que desea eliminar", "ELIMINAR", JOptionPane.WARNING_MESSAGE);

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (Arrays.asList(lista.get(i)).contains(DatosEliminar)) {
                    indiceArreglo = i;
                    
//                }else{
//                    JOptionPane.showMessageDialog(null, "El numero no se encuentra en la lista", "NUMERO NO VALIDO", JOptionPane.INFORMATION_MESSAGE);
//                    
                }
                break;
            }
        }
        
//        JOptionPane.showMessageDialog(null, "El numero no se encuentra en la lista", "NUMERO NO VALIDO", JOptionPane.INFORMATION_MESSAGE);
        
//        if (indiceArreglo == 1) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (Arrays.asList(lista.get(i)).contains(DatosEliminar)) {
                    lista.remove(indiceArreglo);
                    int pos = indiceArreglo + 1;
                    ((DefaultTableModel) tblVehiculos.getModel()).removeRow(indiceArreglo);
                    JOptionPane.showMessageDialog(null, "El elemento " + DatosEliminar + " encontrado en la posicion " + pos + " ha sido eliminado", "ELEMENTO ELIMINADO", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                break;
            }
        }
//        } else {
//            JOptionPane.showMessageDialog(null, "El elemento que desea eliminar no esta dentro de las marcas", "NO EXISTE MARCA", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_btnEliminarValorActionPerformed

    private void btnAgregarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarValorActionPerformed
        // TODO add your handling code here://
        
        if(txtMarcaVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El cuadro de texto de la entrada del restaurante esta vacia", "ELEMENTO VACIO", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtAñoVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El cuadro de texto del las sopas del restaurante esta vacia", "ELEMENTO VACIO", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtModeloVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El cuadro de texto del plato principal del restaurante esta vacia", "ELEMENTO VACIO", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtPrecioVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El cuadro de texto del plato segundario del restaurante esta vacia", "ELEMENTO VACIO", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtColorVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El cuadro de texto del postre del restaurante esta vacia", "ELEMENTO VACIO", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String Marca = txtMarcaVehiculo.getText();
            String Año = txtAñoVehiculo.getText();
            String Modelo = txtModeloVehiculo.getText();
            String Precio = txtPrecioVehiculo.getText();
            String Color = txtColorVehiculo.getText();

            String[] DatosAutos = new String[5];

            DatosAutos[0] = Marca;
            DatosAutos[1] = Año;
            DatosAutos[2] = Modelo;
            DatosAutos[3] = Precio;
            DatosAutos[4] = Color;

            if (lista.size() < 20) {
                lista.add(DatosAutos);
            } else {
                JOptionPane.showMessageDialog(null, "El numero de pedidos maximos es de 20", "NUMERO MAXIMO ALCANZADO", JOptionPane.INFORMATION_MESSAGE);
            }
            TableModel modelo = new DefaultTableModel(lista.toArray(new String[lista.size()][]), new String[]{"Entrada", "Sopa", "Plato principal", "Plato segundario", "Postre"});
            tblVehiculos.setModel(modelo);
        }

    }//GEN-LAST:event_btnAgregarValorActionPerformed

    private void btnBusquedaLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaLinealActionPerformed
        // TODO add your handling code here:
        
        String DatosBuscar = JOptionPane.showInputDialog(null, "Escriba la elemento que desea buscar", "BUSCAR PLATO", JOptionPane.INFORMATION_MESSAGE);
        
        int index = -1;

        for (int i = 0; i < lista.size(); i++) {
            String[] arreglo = lista.get(i);
            if (Arrays.asList(arreglo).contains(DatosBuscar)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
//            String[] elementoEncontrado = lista.get(index);
            String Seleccionado = (Arrays.toString(lista.get(index)));
//            System.out.println("Elemento " + DatosBuscar + " encontrado en el índice " + index + ": " + Arrays.toString(elementoEncontrado));
            JOptionPane.showMessageDialog(null, "Elemento " + DatosBuscar + " encontrado en el la lista numero " + (index+1) + " el elemento completo es " + Seleccionado, "ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
//            System.out.println("Elemento " + DatosBuscar + " no encontrado en la lista");
            JOptionPane.showMessageDialog(null, "Elemento no encontrado", "NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
        }
        
//        Integer index = ControladorLista.Secuencial(lista, DatosBuscar)+1;
//        boolean encontrado = false;
//        
//        for (int i = 0; i < lista.size(); i++) {
//            for (int j = 0; j < lista.size(); j++) {
//                if (index != null) {
//                    String Seleccionado = (Arrays.toString(lista.get(index - 1)));
//
//                    JOptionPane.showMessageDialog(null, "Elemento " + DatosBuscar + " encontrado en el la lista numero " + index + " el elemento completo es " + Seleccionado, "ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println("Encontrado en el elemento numero " + index);
//                    encontrado = true;
//                }break;
//                
////                else {
////                    JOptionPane.showMessageDialog(null, "Elemento no encontrado", "NO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
////                    System.out.println("Elemento no encontrado");
//            }break;
//        }
//        if(index!=-1){
//            JOptionPane.showMessageDialog(null, "Elemento no encontrado", "NO ENCONTRADO", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnBusquedaLinealActionPerformed

    private void btnBusquedaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaBinariaActionPerformed

        String BuscarElemento = JOptionPane.showInputDialog(null, "Ingrese el valor a buscar", "BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
        
        int indiceArreglo = -1;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (Arrays.asList(lista.get(i)).contains(BuscarElemento)) {
                    indiceArreglo = i;
                }
                break;
            }
        }
        
        int izquierda = 0;
        int derecha = lista.size()-1;
//        int mitad = -1;

        lista.sort((a, b) -> a[0].compareTo(b[0]));
        
        while (izquierda <= derecha) {
            
            int mitad = ((izquierda + derecha) / 2);

            String[] mitadElemento = lista.get(mitad);
            
            if (mitadElemento[0].equals(BuscarElemento)) {
                indiceArreglo = mitad;
                break;
            } else if (mitadElemento[0].compareTo(BuscarElemento) < 0) {
                izquierda = mitad + 1;
            } else {
                derecha = mitad - 1;
            }
        }
        
        if (indiceArreglo != -1) {
            JOptionPane.showMessageDialog(null, "El elemento "+BuscarElemento+" se ha encontrado en la pocicion " + (indiceArreglo+1) + " en el conjunto " + Arrays.toString(lista.get(indiceArreglo)), "ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Arreglo encontrado en " + (indiceArreglo + 1) + ": " + Arrays.toString(lista.get(indiceArreglo)));
        } else {
            JOptionPane.showMessageDialog(null, "Arreglo no encontrado", "NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            System.out.println("Arreglo no encontrado");
        }


//        for (int i = 0; i < lista.size(); i++) {
//            for (int j = 0; j < lista.size(); j++) {
//
//                String elementToFind = JOptionPane.showInputDialog(null, "Valor a buscar", null);
////            String ArregloLista[] = lista.get(i);
////                String arreglo = Arrays.toString(lista.get(i));
//
////            System.out.println(Arrays.asList(firstArray));
////            System.out.println(""+arreglo);
////                String firstElement = list.get(i);
//                Collections.sort(lista);
//                System.out.println("" + lista);
//                System.out.println("" + arreglo);
////                System.out.println(""+firstElement);
//
//                int izquierda = 0;
//                int derecha = lista.size();
//                int mitad = -1;
//
//                while (izquierda <= derecha) {
//                    mitad = ((izquierda + derecha) / 2);
//
//                    String mitadElemento = lista.get(mitad);
//
//                    if (mitadElemento.equals(elementToFind)) {
//                        break;
//                    } else if (mitadElemento.compareTo(elementToFind) < 0) {
//                        izquierda = mitad + 1;
//                    } else {
//                        derecha = mitad - 1;
//                    }
//                }
//                if (mitad != -1) {
//                    JOptionPane.showMessageDialog(null, "Valor encontrado en " + (mitad + 1) + " " + arreglo, "ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println("Elemento encontrado en " + (mitad + 1) + " " + list);
//                } else {
//                    System.out.println("Elemento no encontrado");
//                }
//            }
//        }
    }//GEN-LAST:event_btnBusquedaBinariaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarValor;
    private javax.swing.JButton btnBusquedaBinaria;
    private javax.swing.JButton btnBusquedaLineal;
    private javax.swing.JButton btnEliminarValor;
    private javax.swing.JButton btnImprimirLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblVehiculos;
    public static javax.swing.JTextField txtAñoVehiculo;
    public static javax.swing.JTextField txtColorVehiculo;
    public static javax.swing.JTextField txtMarcaVehiculo;
    public static javax.swing.JTextField txtModeloVehiculo;
    public static javax.swing.JTextField txtPrecioVehiculo;
    // End of variables declaration//GEN-END:variables
}
