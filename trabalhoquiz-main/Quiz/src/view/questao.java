/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.Color;
import model.DAO.PartidaDAO;
import model.BO.Pergunta;


/**
 *
 * @author Guilherme
 */
public class questao extends javax.swing.JFrame {

    private PartidaDAO partida = configteste.partida;
    private Pergunta pergunta = partida.RetornarPergunta();
    private String altenativaEscolhida = pergunta.getAlternativa_a();
    private int acao = 0;
    
    
    
    public questao() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setResizable(false);
       
        //Pergunta pergunta = new Pergunta();
        String tituloCompleto = this.pergunta.getTitulo();
        titulo.setText(this.pergunta.getTitulo());
        idAlternativaA.setText(this.pergunta.getAlternativa_a());
        idAlternativaB.setText(this.pergunta.getAlternativa_b());
        idAlternativaC.setText(this.pergunta.getAlternativa_c());
        idAlternativaD.setText(this.pergunta.getAlternativa_d());
        
        
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        altenativas = new javax.swing.ButtonGroup();
        idAlternativaA = new javax.swing.JRadioButton();
        idAlternativaB = new javax.swing.JRadioButton();
        idAlternativaC = new javax.swing.JRadioButton();
        idAlternativaD = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        titulo = new javax.swing.JTextArea();
        correcao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        altenativas.add(idAlternativaA);
        idAlternativaA.setFont(new java.awt.Font("Hashed Browns", 0, 14)); // NOI18N
        idAlternativaA.setSelected(true);
        idAlternativaA.setText("A");
        idAlternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlternativaAActionPerformed(evt);
            }
        });

        altenativas.add(idAlternativaB);
        idAlternativaB.setFont(new java.awt.Font("Hashed Browns", 0, 14)); // NOI18N
        idAlternativaB.setText("B");
        idAlternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlternativaBActionPerformed(evt);
            }
        });

        altenativas.add(idAlternativaC);
        idAlternativaC.setFont(new java.awt.Font("Hashed Browns", 0, 14)); // NOI18N
        idAlternativaC.setText("C");
        idAlternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlternativaCActionPerformed(evt);
            }
        });

        altenativas.add(idAlternativaD);
        idAlternativaD.setFont(new java.awt.Font("Hashed Browns", 0, 14)); // NOI18N
        idAlternativaD.setText("D");
        idAlternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlternativaDActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 204, 204));
        jToggleButton1.setFont(new java.awt.Font("Hashed Browns", 0, 14)); // NOI18N
        jToggleButton1.setText("Proxima");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        titulo.setEditable(false);
        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setColumns(20);
        titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        titulo.setLineWrap(true);
        titulo.setRows(5);
        jScrollPane1.setViewportView(titulo);

        correcao.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        correcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correcao.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(correcao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idAlternativaB)
                            .addComponent(idAlternativaA)
                            .addComponent(idAlternativaC)
                            .addComponent(idAlternativaD))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(idAlternativaA)
                        .addGap(18, 18, 18)
                        .addComponent(idAlternativaB)
                        .addGap(18, 18, 18)
                        .addComponent(idAlternativaC)
                        .addGap(18, 18, 18)
                        .addComponent(idAlternativaD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correcao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idAlternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlternativaAActionPerformed
        this.altenativaEscolhida = pergunta.getAlternativa_a();
    }//GEN-LAST:event_idAlternativaAActionPerformed

    private void idAlternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlternativaBActionPerformed
        this.altenativaEscolhida = pergunta.getAlternativa_b();
    }//GEN-LAST:event_idAlternativaBActionPerformed

    private void idAlternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlternativaCActionPerformed
        this.altenativaEscolhida = pergunta.getAlternativa_c();
    }//GEN-LAST:event_idAlternativaCActionPerformed

    private void idAlternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlternativaDActionPerformed
        this.altenativaEscolhida = pergunta.getAlternativa_d();
    }//GEN-LAST:event_idAlternativaDActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(this.acao==0){
            System.out.println(this.pergunta.getResposta_certa());
            if(partida.PreVerificar(this.altenativaEscolhida, this.pergunta.getResposta_certa())){
                this.correcao.setText("Acertou!");
                this.correcao.setBackground(Color.green);
            }else{
                this.correcao.setText("Errou!");
                this.correcao.setBackground(Color.red);
            }
            this.idAlternativaA.setEnabled(false);
            this.idAlternativaB.setEnabled(false);
            this.idAlternativaC.setEnabled(false);
            this.idAlternativaD.setEnabled(false);
            this.acao = 1;
        }else if(this.acao==1){
            if(this.partida.VereficarPergunta(this.altenativaEscolhida, this.pergunta.getResposta_certa())< partida.getTotal_perguntas_requesicoes()){
                questao frame = new questao();
                frame.setVisible(true);
            }else{
                this.partida.SalvarPartida();
                finalQuiz frame = new finalQuiz();
                frame.setVisible(true);
            }
            this.dispose();           
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup altenativas;
    private javax.swing.JLabel correcao;
    private javax.swing.JRadioButton idAlternativaA;
    private javax.swing.JRadioButton idAlternativaB;
    private javax.swing.JRadioButton idAlternativaC;
    private javax.swing.JRadioButton idAlternativaD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea titulo;
    // End of variables declaration//GEN-END:variables
}
