/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigha.view;

import br.com.sigha.Beans.OperadorLogadoBeans;
import br.com.sigha.Beans.UnidadeLogadoBeans;
import br.com.sigha.Util.ButtonTabComponent;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Vinicius
 */
public class viewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form viewPrincipal
     */
    //estanciacao dos obejetos das frames view


    public viewPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);//COLOCA TELA EM MAXIMIZADA
        jLrodapeusuario.setText(new OperadorLogadoBeans().getLogadonome());
        jLrodapeunidade.setText(new UnidadeLogadoBeans().getRazao());
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLrodapeusuario = new javax.swing.JLabel();
        jLrodapeunidade = new javax.swing.JLabel();
        jTAPabasjanelas = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERADOR DE HORARIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("USUARIO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLrodapeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLrodapeunidade, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLrodapeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLrodapeunidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTAPabasjanelas.setForeground(new java.awt.Color(240, 240, 240));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(163, 35));

        jMenu1.setText("Configuração");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/CONFIG32X32.png"))); // NOI18N
        jMenuItem3.setText("Configuração De Horarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/OPERADOR32X32.png"))); // NOI18N
        jMenuItem2.setText("Cadastro De Operador");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/CURSOS32X32.png"))); // NOI18N
        jMenuItem5.setText("Cadastro De Cursos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/MATERIA32X32.png"))); // NOI18N
        jMenuItem6.setText("Cadastro De Materias");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PESSOAS.png"))); // NOI18N
        jMenuItem1.setText("Cadastro De Professor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/UNIDADE32X32.png"))); // NOI18N
        jMenuItem7.setText("Cadastro De Unidade");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Horario");
        jMenu4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/HORARIO32X32.png"))); // NOI18N
        jMenuItem8.setText("Gerar Horario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Sair");
        jMenu3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/SAIR32X32.png"))); // NOI18N
        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTAPabasjanelas)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTAPabasjanelas, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (!getJanelaAberta("Cadastro de Professores")) {
            Component component = new Component() {};
            ViewPCadProfessor viewcadprofessor = new ViewPCadProfessor();
           
            jTAPabasjanelas.addTab("Cadastro de Professores", null, viewcadprofessor);
            jTAPabasjanelas.setSelectedComponent(viewcadprofessor);
            int j = jTAPabasjanelas.getSelectedIndex();
            jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));
        } else {
            JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
//        if (!viewconfiguracao.isVisible()) {
//            viewconfiguracao.setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        if (!getJanelaAberta("Cadastro de Cursos")) {
            Component component = new Component() {};
            ViewPCadCursos viewcadcursos = new ViewPCadCursos();
            jTAPabasjanelas.addTab("Cadastro de Cursos", null, viewcadcursos);
            jTAPabasjanelas.setSelectedComponent(viewcadcursos);
            int j = jTAPabasjanelas.getSelectedIndex();
            jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));
        } else {
            JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (!getJanelaAberta("Cadastro de Operadores")) {
            Component component = new Component() {
            };
            ViewPCadOperador viewcadoperador = new ViewPCadOperador();
            jTAPabasjanelas.addTab("Cadastro de Operadores", null, viewcadoperador);
            jTAPabasjanelas.setSelectedComponent(viewcadoperador);
            int j = jTAPabasjanelas.getSelectedIndex();
            jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));
        } else {
            JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

            if (!getJanelaAberta("Cadastro de Materias")) {
                Component component = new Component() {};
                ViewPCadMaterias viewcadmaterias = new ViewPCadMaterias();
                jTAPabasjanelas.addTab("Cadastro de Materias", null, viewcadmaterias);
                jTAPabasjanelas.setSelectedComponent(viewcadmaterias);
                int j = jTAPabasjanelas.getSelectedIndex();
                jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));

            } else {
                JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
            if (!getJanelaAberta("Cadastro de Unidade")){
                Component component = new Component() {};
                ViewPCadUnidade viewcadunidade = new ViewPCadUnidade();
                jTAPabasjanelas.addTab("Cadastro de Unidade", null, viewcadunidade);
                jTAPabasjanelas.setSelectedComponent(viewcadunidade);
                int j = jTAPabasjanelas.getSelectedIndex();
                jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));
            } else {
                JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
         if (!getJanelaAberta("Horario de Aula")){
                Component component = new Component() {};
                ViewPHorarioAula viewhorarioaula = new ViewPHorarioAula();
                jTAPabasjanelas.addTab("Horario de Aula", null, viewhorarioaula);
                jTAPabasjanelas.setSelectedComponent(viewhorarioaula);
                int j = jTAPabasjanelas.getSelectedIndex();
                jTAPabasjanelas.setTabComponentAt(j, new ButtonTabComponent(jTAPabasjanelas));
            } else {
                JOptionPane.showMessageDialog(null, "Janela ja Aberta", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        //try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//               if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                   // javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        //javax.swing.UIManager.setLookAndFeel("net.sf.tinylaf.TinyLookAndFeel");
        // UIManager.setLookAndFeel(new com.jtattoo.plaf.texture.TextureLookAndFeel());

//                    break;
//                }
//            }
        //} catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(viewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        // }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLrodapeunidade;
    private javax.swing.JLabel jLrodapeusuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTAPabasjanelas;
    // End of variables declaration//GEN-END:variables
private Boolean getJanelaAberta(String titulo) {
        Boolean verifica = false;
        for (int i = 0; i < jTAPabasjanelas.getTabCount(); i++) {
            if (titulo.equals(jTAPabasjanelas.getTitleAt(i))) {
                verifica = true;
            }
        }
        return verifica;
    }
}
