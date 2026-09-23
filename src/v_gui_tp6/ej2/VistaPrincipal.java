
package v_gui_tp6.ej2;


public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    
    // Creo variable sin static para un diseño con menos acoplamiento:
    // ventanas internas no conocen a VistaPrincipal ni dependen de que exista la variable estática.
    private GestionDeProductos gestionProductos;
    
    
    // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (gestionProductos):
    public VistaPrincipal() {
        
        initComponents();
        
        gestionProductos = new GestionDeProductos();
        // VistaPrincipal crea el objeto;
        //  el resto de las ventanas reciben instancia existente por constructor (en vez de crearla y trabajar con static).
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdministracion = new javax.swing.JMenu();
        mnuiGestion = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuiConsultaNombre = new javax.swing.JMenuItem();
        mnuiConsultaPrecio = new javax.swing.JMenuItem();
        mnuiConsultaRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("De todo S.A.");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );

        mnuAdministracion.setText("Administración");

        mnuiGestion.setText("Gestionar Productos");
        mnuiGestion.addActionListener(this::mnuiGestionActionPerformed);
        mnuAdministracion.add(mnuiGestion);

        jMenuBar1.add(mnuAdministracion);

        mnuConsultas.setText("Consultas");

        mnuiConsultaNombre.setText("Consultar por Nombre");
        mnuiConsultaNombre.addActionListener(this::mnuiConsultaNombreActionPerformed);
        mnuConsultas.add(mnuiConsultaNombre);

        mnuiConsultaPrecio.setText("Consultar por Precio");
        mnuiConsultaPrecio.addActionListener(this::mnuiConsultaPrecioActionPerformed);
        mnuConsultas.add(mnuiConsultaPrecio);

        mnuiConsultaRubro.setText("Consultar por Rubro");
        mnuiConsultaRubro.addActionListener(this::mnuiConsultaRubroActionPerformed);
        mnuConsultas.add(mnuiConsultaRubro);

        jMenuBar1.add(mnuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaPrecioActionPerformed
        
        ifrmConsultaPrecio ventana = new ifrmConsultaPrecio();

        jDesktopPane1.add(ventana);

        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnuiConsultaPrecioActionPerformed

    private void mnuiGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiGestionActionPerformed
        
        // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (gestionProductos):
        ifrmGestionProductos ventana = new ifrmGestionProductos(gestionProductos);

        jDesktopPane1.add(ventana);

        ventana.setVisible(true);
               
    }//GEN-LAST:event_mnuiGestionActionPerformed

    private void mnuiConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaNombreActionPerformed
        
        // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (gestionProductos):
        ifrmConsultaNombre ventana = new ifrmConsultaNombre(gestionProductos);

        jDesktopPane1.add(ventana);

        ventana.setVisible(true);
        
        
    }//GEN-LAST:event_mnuiConsultaNombreActionPerformed

    private void mnuiConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultaRubroActionPerformed
        
        // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (gestionProductos):
        ifrmConsultaRubro ventana = new ifrmConsultaRubro(gestionProductos);

        jDesktopPane1.add(ventana);

        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnuiConsultaRubroActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAdministracion;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuItem mnuiConsultaNombre;
    private javax.swing.JMenuItem mnuiConsultaPrecio;
    private javax.swing.JMenuItem mnuiConsultaRubro;
    private javax.swing.JMenuItem mnuiGestion;
    // End of variables declaration//GEN-END:variables
}
