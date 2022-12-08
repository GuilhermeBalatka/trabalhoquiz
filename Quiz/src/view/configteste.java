/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Quiz;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.DAO.PartidaDAO;
import model.BO.Pergunta;




public class configteste extends javax.swing.JFrame{
    private String dificuldade = "iniciante";
    private String tema = "conhecimento_gerais";
    private int numPergunta = 1;
    public static PartidaDAO partida;
    
 
    
    

    public configteste() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_dificuldade = new javax.swing.ButtonGroup();
        grupo_tema = new javax.swing.ButtonGroup();
        nome_pessoa = new javax.swing.JTextField();
        radio_iniciante = new javax.swing.JRadioButton();
        radio_intermeduario = new javax.swing.JRadioButton();
        radio_dificil = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero_pergunta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        conhecimentos_gerais = new javax.swing.JRadioButton();
        artes = new javax.swing.JRadioButton();
        historia = new javax.swing.JRadioButton();
        geografia = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome_pessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_pessoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_pessoaFocusLost(evt);
            }
        });
        nome_pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_pessoaActionPerformed(evt);
            }
        });

        grupo_dificuldade.add(radio_iniciante);
        radio_iniciante.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        radio_iniciante.setSelected(true);
        radio_iniciante.setText("Iniciante");
        radio_iniciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_inicianteActionPerformed(evt);
            }
        });

        grupo_dificuldade.add(radio_intermeduario);
        radio_intermeduario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        radio_intermeduario.setText("Intermediário");
        radio_intermeduario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_intermeduarioActionPerformed(evt);
            }
        });

        grupo_dificuldade.add(radio_dificil);
        radio_dificil.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        radio_dificil.setText("Difícil ");
        radio_dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_dificilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nível");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tema");

        numero_pergunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        numero_pergunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de questões - 1", "Número de questões - 2", "Número de questões - 3", "Número de questões - 4", "Número de questões - 5", "Número de questões - 6", "Número de questões - 7", "Número de questões - 8", "Número de questões - 9", "Número de questões - 10" }));
        numero_pergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_perguntaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome");

        grupo_tema.add(conhecimentos_gerais);
        conhecimentos_gerais.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        conhecimentos_gerais.setSelected(true);
        conhecimentos_gerais.setText("Conhecimentos Gerais");
        conhecimentos_gerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conhecimentos_geraisActionPerformed(evt);
            }
        });

        grupo_tema.add(artes);
        artes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        artes.setText("Artes");
        artes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artesActionPerformed(evt);
            }
        });

        grupo_tema.add(historia);
        historia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        historia.setText("História");
        historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaActionPerformed(evt);
            }
        });

        grupo_tema.add(geografia);
        geografia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        geografia.setText("Geografia");
        geografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geografiaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numero_pergunta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(radio_iniciante)
                                    .addGap(18, 18, 18)
                                    .addComponent(radio_intermeduario)
                                    .addGap(18, 18, 18)
                                    .addComponent(radio_dificil)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(conhecimentos_gerais)
                                .addGap(18, 18, 18)
                                .addComponent(artes)
                                .addGap(18, 18, 18)
                                .addComponent(historia)
                                .addGap(18, 18, 18)
                                .addComponent(geografia))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_iniciante)
                    .addComponent(radio_intermeduario)
                    .addComponent(radio_dificil))
                .addGap(18, 18, 18)
                .addComponent(numero_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artes)
                    .addComponent(historia)
                    .addComponent(conhecimentos_gerais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geografia))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_pessoaActionPerformed
       
    
    }//GEN-LAST:event_nome_pessoaActionPerformed

    private void nome_pessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_pessoaFocusLost
        if(nome_pessoa.getText().equals("")){
            nome_pessoa.setText("Nome");
            nome_pessoa.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nome_pessoaFocusLost

    private void nome_pessoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_pessoaFocusGained
         if(nome_pessoa.getText().equals("Nome")){
            nome_pessoa.setText("");
            nome_pessoa.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nome_pessoaFocusGained

    private void conhecimentos_geraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conhecimentos_geraisActionPerformed
        this.tema = "conhecimento_gerais";
    }//GEN-LAST:event_conhecimentos_geraisActionPerformed

    private void artesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artesActionPerformed
       this.tema = "Artes";
    }//GEN-LAST:event_artesActionPerformed

    private void historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaActionPerformed
        this.tema = "historia";
    }//GEN-LAST:event_historiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //PartidaDAO pa = new PartidaDAO(this.nome_pessoa.getText(), grupo_tema.getSelection(), grupo_dificuldade.getSelection(), numero_pergunta.getSelectedItem().toString().substring(21));
        if(this.nome_pessoa.getText().equals("Nome")){
            JOptionPane.showMessageDialog(null, "Erro: Nome faltando", "Erro",  JOptionPane.ERROR_MESSAGE);
        }else{
            this.partida = new PartidaDAO(this.nome_pessoa.getText(), this.tema, this.dificuldade, Integer.parseInt(numero_pergunta.getSelectedItem().toString().substring(21)));
            
            questao frame = new questao();
            frame.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void radio_inicianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_inicianteActionPerformed
        this.dificuldade = "iniciante";

    }//GEN-LAST:event_radio_inicianteActionPerformed

    private void radio_intermeduarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_intermeduarioActionPerformed
        this.dificuldade = "intermediario";
    }//GEN-LAST:event_radio_intermeduarioActionPerformed

    private void numero_perguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_perguntaActionPerformed
      this.numPergunta = Integer.parseInt(this.numero_pergunta.getSelectedItem().toString().substring(21));      
       
    }//GEN-LAST:event_numero_perguntaActionPerformed

    private void radio_dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_dificilActionPerformed
        this.dificuldade = "dificil";
    }//GEN-LAST:event_radio_dificilActionPerformed

    private void geografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geografiaActionPerformed
        this.tema = "geografia";
    }//GEN-LAST:event_geografiaActionPerformed

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
            java.util.logging.Logger.getLogger(configteste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configteste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configteste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configteste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new configteste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton artes;
    private javax.swing.JRadioButton conhecimentos_gerais;
    private javax.swing.JRadioButton geografia;
    private javax.swing.ButtonGroup grupo_dificuldade;
    private javax.swing.ButtonGroup grupo_tema;
    private javax.swing.JRadioButton historia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nome_pessoa;
    private javax.swing.JComboBox<String> numero_pergunta;
    private javax.swing.JRadioButton radio_dificil;
    private javax.swing.JRadioButton radio_iniciante;
    private javax.swing.JRadioButton radio_intermeduario;
    // End of variables declaration//GEN-END:variables
}
