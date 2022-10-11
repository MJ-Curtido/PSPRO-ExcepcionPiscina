/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dam.excepcionPiscina.vista;

import dam.excepcionPiscina.clases.Excepcion;
import dam.excepcionPiscina.clases.Piscina;

/**
 *
 * @author manu1
 */
public class PanelPrincipal extends javax.swing.JPanel {

    private VentanaPiscina miVentana;
    private Piscina piscina;

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal(VentanaPiscina miVentana) {
        initComponents();

        this.miVentana = miVentana;
        
        txtArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProbar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barraLimite = new javax.swing.JSlider();
        btnLlenar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(750, 750));

        btnProbar.setText("Probar Piscina");
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Capacidad de la piscina en metros cúbicos:");

        barraLimite.setEnabled(false);

        btnLlenar.setText("Llenar");
        btnLlenar.setEnabled(false);
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar");
        btnVaciar.setEnabled(false);
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLlenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVaciar)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnVaciar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLlenar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed
        if (lista.getSelectedIndex()!= -1) {
            btnProbar.setEnabled(false);
            lista.setEnabled(false);
            btnLlenar.setEnabled(true);
            btnVaciar.setEnabled(true);
            
            Integer litrosPiscina = (int)(1000 * Double.parseDouble(lista.getSelectedValue()));
            piscina = new Piscina(litrosPiscina);
            
            barraLimite.setMinimum(0); //Valor Mínimo
            barraLimite.setMaximum(litrosPiscina); //Valor Máximo
            barraLimite.setMajorTickSpacing(100); //Definir marcas mayores cada 100 unidades
            barraLimite.setMinorTickSpacing(10); //Definir marcas menores cada 10 unidades
            barraLimite.setValue(0); //Asignación del valor inicial
            barraLimite.setPaintTicks(true); //Mostrar marcas mayores y menores
            barraLimite.setPaintLabels(true); //Mostrar numeración de marcas mayores
            barraLimite.setEnabled(false); //desactivar jSlider
            
            txtArea.append("Se va a realizar la prueba de la piscina con " + litrosPiscina + "L:");
        }
        
    }//GEN-LAST:event_btnProbarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        try {
            int num = (int)(Math.random() * 1000 + 1);
            piscina.vaciar(num);
        
            txtArea.append("\n\n-------\n\nSe ha vaciado " + num + "L\nEn total hay " + piscina.getNivel() + "L");
        } catch (Excepcion e) {
            txtArea.append("\n\n-------\n\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed
        try {
            int num = (int)(Math.random() * 1000 + 1);
            piscina.llenar(num);
        
            txtArea.append("\n\n-------\n\nSe ha llenado " + num + "L\nEn total hay " + piscina.getNivel() + "L");
        } catch (Excepcion e) {
            txtArea.append("\n\n-------\n\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnLlenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraLimite;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JButton btnProbar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
