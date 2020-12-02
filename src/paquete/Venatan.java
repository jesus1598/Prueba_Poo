package paquete;

import java.util.Arrays;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Venatan extends javax.swing.JFrame {


    public Venatan()
    {
        initComponents();
    }

    public JPasswordField getCaja_cont_admi() {
        return caja_cont_admi;
    }

    public JPasswordField getCaja_cont_usuario() {
        return caja_cont_usuario;
    }

    public JTextField getCaja_usuario() {
        return caja_usuario;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiqueta_imagen_1 = new javax.swing.JLabel();
        etiqueta_usuario = new javax.swing.JLabel();
        etiqueta_contrasena_usuario = new javax.swing.JLabel();
        etiqueta_contrasena_admi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_empleado = new javax.swing.JButton();
        boton_admi = new javax.swing.JButton();
        boton_verificar = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        caja_cont_admi = new javax.swing.JPasswordField();
        caja_usuario = new javax.swing.JTextField();
        caja_cont_usuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta_imagen_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        panel.add(etiqueta_imagen_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        etiqueta_usuario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        etiqueta_usuario.setText("Usuario : ");
        panel.add(etiqueta_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 30));

        etiqueta_contrasena_usuario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        etiqueta_contrasena_usuario.setText("Contraseña usuario :");
        panel.add(etiqueta_contrasena_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        etiqueta_contrasena_admi.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        etiqueta_contrasena_admi.setText("Contraseña administrador :");
        panel.add(etiqueta_contrasena_admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        boton_empleado.setText("Empleado");
        boton_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_empleadoActionPerformed(evt);
            }
        });
        panel.add(boton_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, -1));

        boton_admi.setText("Administrador");
        boton_admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_admiActionPerformed(evt);
            }
        });
        panel.add(boton_admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 130, -1));

        boton_verificar.setText("Verificar !");
        panel.add(boton_verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 130, -1));

        boton_salir.setText("Salir ");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });
        panel.add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 460, 420, -1));

        caja_cont_admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_cont_admiActionPerformed(evt);
            }
        });
        panel.add(caja_cont_admi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 336, 150, 40));

        caja_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_usuarioActionPerformed(evt);
            }
        });
        panel.add(caja_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 150, 40));

        caja_cont_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_cont_usuarioActionPerformed(evt);
            }
        });
        panel.add(caja_cont_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_usuarioActionPerformed
      
    }//GEN-LAST:event_caja_usuarioActionPerformed

    private void boton_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_empleadoActionPerformed

        Empleado empleado1 = new Empleado();        
        String password ="";
        for (int i = 0; i <caja_cont_usuario.getPassword().length; i++) {
            password+=caja_cont_usuario.getPassword()[i]; 
        }
        System.out.println(empleado1.loginEmpleado(caja_usuario.getText(), password));
    }//GEN-LAST:event_boton_empleadoActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_boton_salirActionPerformed

    private void caja_cont_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_cont_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_cont_usuarioActionPerformed

    private void caja_cont_admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_cont_admiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_cont_admiActionPerformed

    private void boton_admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_admiActionPerformed
        Empleado adm = new Administrador();
        String password_usuario = "";
        String password_admin = "0";
        for (int i = 0; i <caja_cont_usuario.getPassword().length; i++) {
            password_usuario+=caja_cont_usuario.getPassword()[i]; 
        }
        for (int i = 0; i <caja_cont_admi.getPassword().length; i++) {
            password_admin+=caja_cont_admi.getPassword()[i]; 
        }        
        System.out.println(adm.loginAdministrador(caja_usuario.getText(),password_usuario,Integer.parseInt(password_admin)));
    }//GEN-LAST:event_boton_admiActionPerformed

    public static void main(String args[]) {
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_admi;
    private javax.swing.JButton boton_empleado;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton boton_verificar;
    private javax.swing.JPasswordField caja_cont_admi;
    private javax.swing.JPasswordField caja_cont_usuario;
    private javax.swing.JTextField caja_usuario;
    private javax.swing.JLabel etiqueta_contrasena_admi;
    private javax.swing.JLabel etiqueta_contrasena_usuario;
    private javax.swing.JLabel etiqueta_imagen_1;
    private javax.swing.JLabel etiqueta_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
