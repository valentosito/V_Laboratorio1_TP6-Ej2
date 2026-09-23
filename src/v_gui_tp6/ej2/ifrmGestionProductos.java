
package v_gui_tp6.ej2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ifrmGestionProductos extends javax.swing.JInternalFrame {

    
    private GestionDeProductos gestionProductos;
    
    
    // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (gestionProductos):
    public ifrmGestionProductos(GestionDeProductos gestionProductos) {
        
        initComponents();
        
        this.gestionProductos = gestionProductos;
        
        // Combo para filtrar
        cmbCategoria.addItem("Todas");
        cmbCategoria.addItem(Rubro.COMESTIBLE.toString());
        cmbCategoria.addItem(Rubro.LIMPIEZA.toString());
        cmbCategoria.addItem(Rubro.PERFUMERIA.toString());
            
        
        // Combo para asignar rubro al producto
        cmbRubro.addItem("");
        cmbRubro.addItem(Rubro.COMESTIBLE.toString());
        cmbRubro.addItem(Rubro.LIMPIEZA.toString());
        cmbRubro.addItem(Rubro.PERFUMERIA.toString());
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        panelIngresoDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbRubro = new javax.swing.JComboBox<>();
        spnStock = new javax.swing.JSpinner();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("De Todo S.A.: Productos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        cmbCategoria.addActionListener(this::cmbCategoriaActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Filtrar por Categoría:");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        panelIngresoDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Rubro:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Stock:");

        txtCodigo.setEditable(false);

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPrecio)
                            .addComponent(cmbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                                .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v_gui_tp6/lupa.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnNuevo)
                .addGap(70, 70, 70)
                .addComponent(btnGuardar)
                .addGap(70, 70, 70)
                .addComponent(btnActualizar)
                .addGap(70, 70, 70)
                .addComponent(btnEliminar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
        String descripcion = txtDescripcion.getText().trim();
        String precioTexto = txtPrecio.getText().trim();
        String rubroTexto = cmbRubro.getSelectedItem().toString();
        
        // Validación de campos:       
        if (descripcion.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción.");
            txtDescripcion.requestFocus();
            return;
        }
        
        if (precioTexto.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio.");
            txtPrecio.requestFocus();
            return;
        }
        
        double precio;

        try {
            
            precio = Double.parseDouble(precioTexto);
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "El precio debe ser un número.");
            txtPrecio.requestFocus();
            return;
        }

        if (rubroTexto.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rubro.");
            cmbRubro.requestFocus();
            return;
        }

        Rubro rubro = Rubro.valueOf(rubroTexto);
        
        // Obtener stock:
        int stock = (int) spnStock.getValue();
        
        // Obtener id autogenerado:
        int id = gestionProductos.generarCodigo();
            
        // Hacer visible el id autogenerado:
        txtCodigo.setText(String.valueOf(id));

        // Crear producto:
        Producto producto = new Producto(id, descripcion, precio, stock, rubro);
        
        // Agregar producto:
        gestionProductos.agregarProducto(producto);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       
        // Limpieza de campos:
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        cmbRubro.setSelectedItem("");
        spnStock.setValue(0);
        txtDescripcion.requestFocus();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        // Validación: primero tiene que estar una fila de la JTable seleccionada.
        
        // Obtengo el índice de la fila seleccionada en la JTable.
        int filaSeleccionada = tblProductos.getSelectedRow();

        // Si no hay ninguna fila seleccionada, getSelectedRow() devuelve -1.
        if (filaSeleccionada == -1) {
            
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla.");
            return;
        }
        
        // Obtener el código del producto que se está modificando:
        int id = Integer.parseInt(txtCodigo.getText());
        
        // Obtener posibles nuevos cambios hechos por el usuario:
        String descripcion = txtDescripcion.getText().trim();
        String precioTexto = txtPrecio.getText().trim();
        String rubroTexto = cmbRubro.getSelectedItem().toString();
      
        
        // Validar campos vacíos:
        
        if (descripcion.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción.");

            txtDescripcion.requestFocus();
            return;
        }

        if (precioTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un precio.");

            txtPrecio.requestFocus();
            return;
        }

        double precio;

        try {

            precio = Double.parseDouble(precioTexto);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El precio debe ser un número.");
            txtPrecio.requestFocus();
            return;
        }

        if (rubroTexto.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un rubro.");
            cmbRubro.requestFocus();
            return;
        }
        
        // Conversión:
        Rubro rubro = Rubro.valueOf(rubroTexto);
        
        // Obtengo el valor actual del JSpinner:
        int stock = (int) spnStock.getValue();
        
        boolean modificado = gestionProductos.modificarProducto(id, descripcion, precio, stock, rubro);

         // Comprobar si el producto fue encontrado y modificado:
        if (modificado) {

            // Actualizar directamente la fila seleccionada de la JTable.
            tblProductos.setValueAt(descripcion, filaSeleccionada, 1); // 1, 2, 3... son las columnas.
            tblProductos.setValueAt(precio, filaSeleccionada, 2);
            tblProductos.setValueAt(rubro, filaSeleccionada, 3);
            tblProductos.setValueAt(stock, filaSeleccionada, 4);
            // La columna 0 es el id, por eso queda como está.
            
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");

        } else {
            
            JOptionPane.showMessageDialog(this, "No se encontró el producto.");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
         // Validación: primero tiene que estar una fila de la JTable seleccionada.
        
        // Obtengo el índice de la fila seleccionada en la JTable.
        int filaSeleccionada = tblProductos.getSelectedRow();

        // Si no hay ninguna fila seleccionada, getSelectedRow() devuelve -1.
        if (filaSeleccionada == -1) {
            
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla.");
            return;
        }
        
         // Obtener el código del producto en cuestión:
        int id = Integer.parseInt(txtCodigo.getText());
        
        Producto producto = gestionProductos.buscarPorCodigo(id);
        
        if (producto != null) {

            // Eliminar el producto del TreeSet:
            gestionProductos.borrarProducto(producto);

            // Eliminar la fila de la JTable:
            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();

            modelo.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");

        } else {

            JOptionPane.showMessageDialog(this, "No se encontró el producto.");
        }
             
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
