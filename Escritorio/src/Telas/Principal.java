package Telas;

import DAO.CONEXAO;
import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Principal extends javax.swing.JFrame {

    Connection conecta = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Principal() {
        initComponents();
        conecta = CONEXAO.con();
         

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCad = new javax.swing.JMenu();
        MenuCadastro = new javax.swing.JMenu();
        UsuarioCad = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuOpcao = new javax.swing.JMenu();
        OpAU = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TELA PRINCIPAL - ESCRITORIO PAULO MAIA");

        Desktop.setAutoscrolls(true);
        Desktop.setMaximumSize(new java.awt.Dimension(0, 0));
        Desktop.setPreferredSize(new java.awt.Dimension(580, 400));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/House.png"))); // NOI18N
        MenuCad.setText("Inicio");

        MenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cli.png"))); // NOI18N
        MenuCadastro.setText("Cadastro");

        UsuarioCad.setText("Usuário");
        UsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioCadActionPerformed(evt);
            }
        });
        MenuCadastro.add(UsuarioCad);

        jMenuItem9.setText("Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        MenuCadastro.add(jMenuItem9);

        jMenuItem10.setText("Processo");
        MenuCadastro.add(jMenuItem10);

        MenuCad.add(MenuCadastro);

        jMenuBar1.add(MenuCad);

        MenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatorio.png"))); // NOI18N
        MenuRelatorio.setText("Relatório");

        jMenu3.setText("Cliente");

        jMenuItem4.setText("Aniversario");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        MenuRelatorio.add(jMenu3);

        jMenuItem5.setText("Funcionário");
        MenuRelatorio.add(jMenuItem5);

        jMenuBar1.add(MenuRelatorio);

        MenuOpcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Configu.png"))); // NOI18N
        MenuOpcao.setText("Opções");

        OpAU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Troca User.png"))); // NOI18N
        OpAU.setText("Alterar Usuário ");
        OpAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpAUActionPerformed(evt);
            }
        });
        MenuOpcao.add(OpAU);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sobre.png"))); // NOI18N
        jMenuItem7.setText("Sobre");
        MenuOpcao.add(jMenuItem7);

        jMenuItem8.setText("Sair");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        MenuOpcao.add(jMenuItem8);

        jMenuBar1.add(MenuOpcao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpAUActionPerformed

        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OpAUActionPerformed
    private void DataPC() {
        Date dataAtual = new Date();
        Calendar dia = Calendar.getInstance();
        dia.setTime(dataAtual);
        
        int diaAtual = dia.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dia.get(Calendar.MONTH);
        
        
        // SimpleDateFormat dataformatada = new SimpleDateFormat("yyyy-MM-dd");
       // String novadata = dataformatada.format(dataAtual);
        
        String sql = "select * from clientes ";
       
        try {
             pst = conecta.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next ()) {
                Date aniversario = rs.getDate("dat_Nasc");
                Calendar diadoaniversario = Calendar.getInstance();
                diadoaniversario.setTime(aniversario);
                
                int aniverDia = diadoaniversario.get(Calendar.DAY_OF_MONTH);
                int aniverMes = diadoaniversario.get(Calendar.MONTH);
                
                if(diaAtual == aniverDia && mesAtual == aniverMes){
  String nome = rs.getString("apelido_Clie");
                JOptionPane.showMessageDialog(null, "O cliente "+ nome +" está aniversariando hoje!!!");
            }
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
    }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void UsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioCadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UsuarioCadActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CadastroCliente CDC = new CadastroCliente();
        CDC.setVisible(true);
        Desktop.add(CDC);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DataPC();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu MenuCad;
    public static javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuOpcao;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem OpAU;
    public static javax.swing.JMenuItem UsuarioCad;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
