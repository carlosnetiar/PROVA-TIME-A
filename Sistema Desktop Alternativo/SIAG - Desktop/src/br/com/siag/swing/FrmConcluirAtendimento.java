/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.swing;

import br.com.siag.beans.FeedBackBean;
import br.com.siag.dao.FeedbackDAO;
import br.com.siag.util.DAOFactory;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcus
 */
public class FrmConcluirAtendimento extends javax.swing.JFrame {

    private Connection conexao;

    /**
     * Creates new form FrmConcluirAtendimento
     */
    public FrmConcluirAtendimento() {
        initComponents();
        
        /**
         * SETAR ÍCONE NO FRAME
         */
        URL url = this.getClass().getResource("ICO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTG_FEEDBACK = new javax.swing.ButtonGroup();
        JPN_DADOS_ALUNO_FEEDBACK = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTF_NOME_ALUNO_FEEDBACK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTF_CPF_ALUNO_FEEDBACK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JL_NUMERO_ATENDIMENTO = new javax.swing.JLabel();
        JPN_FEEDBACK = new javax.swing.JPanel();
        JR_FEEDBACK_1 = new javax.swing.JRadioButton();
        JR_FEEDBACK_2 = new javax.swing.JRadioButton();
        JR_FEEDBACK_3 = new javax.swing.JRadioButton();
        JR_FEEDBACK_4 = new javax.swing.JRadioButton();
        JR_FEEDBACK_5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_OBSERVACAO = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Feedback de Atendimento");

        JPN_DADOS_ALUNO_FEEDBACK.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Aluno"));

        jLabel1.setText("Nome:");

        JTF_NOME_ALUNO_FEEDBACK.setEnabled(false);

        jLabel2.setText("CPF:");

        JTF_CPF_ALUNO_FEEDBACK.setEnabled(false);

        jLabel4.setText("Nº do atendimento:");

        javax.swing.GroupLayout JPN_DADOS_ALUNO_FEEDBACKLayout = new javax.swing.GroupLayout(JPN_DADOS_ALUNO_FEEDBACK);
        JPN_DADOS_ALUNO_FEEDBACK.setLayout(JPN_DADOS_ALUNO_FEEDBACKLayout);
        JPN_DADOS_ALUNO_FEEDBACKLayout.setHorizontalGroup(
            JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createSequentialGroup()
                        .addComponent(JTF_CPF_ALUNO_FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_NUMERO_ATENDIMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JTF_NOME_ALUNO_FEEDBACK))
                .addContainerGap())
        );
        JPN_DADOS_ALUNO_FEEDBACKLayout.setVerticalGroup(
            JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_NOME_ALUNO_FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_NUMERO_ATENDIMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPN_DADOS_ALUNO_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(JTF_CPF_ALUNO_FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        JPN_FEEDBACK.setBorder(javax.swing.BorderFactory.createTitledBorder("Feedback"));

        BTG_FEEDBACK.add(JR_FEEDBACK_1);
        JR_FEEDBACK_1.setText("Muito Ruim");

        BTG_FEEDBACK.add(JR_FEEDBACK_2);
        JR_FEEDBACK_2.setText("Ruim");

        BTG_FEEDBACK.add(JR_FEEDBACK_3);
        JR_FEEDBACK_3.setText("Bom");

        BTG_FEEDBACK.add(JR_FEEDBACK_4);
        JR_FEEDBACK_4.setText("Muito Bom");

        BTG_FEEDBACK.add(JR_FEEDBACK_5);
        JR_FEEDBACK_5.setText("Perfeito");

        jLabel3.setText("Informação Adicional (Opcional):");

        JTA_OBSERVACAO.setColumns(20);
        JTA_OBSERVACAO.setRows(5);
        jScrollPane1.setViewportView(JTA_OBSERVACAO);

        javax.swing.GroupLayout JPN_FEEDBACKLayout = new javax.swing.GroupLayout(JPN_FEEDBACK);
        JPN_FEEDBACK.setLayout(JPN_FEEDBACKLayout);
        JPN_FEEDBACKLayout.setHorizontalGroup(
            JPN_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_FEEDBACKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_FEEDBACKLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(JPN_FEEDBACKLayout.createSequentialGroup()
                        .addComponent(JR_FEEDBACK_1)
                        .addGap(12, 12, 12)
                        .addComponent(JR_FEEDBACK_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JR_FEEDBACK_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(JR_FEEDBACK_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JR_FEEDBACK_5)
                        .addGap(18, 18, 18))
                    .addGroup(JPN_FEEDBACKLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPN_FEEDBACKLayout.setVerticalGroup(
            JPN_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_FEEDBACKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_FEEDBACKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JR_FEEDBACK_1)
                    .addComponent(JR_FEEDBACK_2)
                    .addComponent(JR_FEEDBACK_3)
                    .addComponent(JR_FEEDBACK_4)
                    .addComponent(JR_FEEDBACK_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Finalizar Atendimento");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPN_DADOS_ALUNO_FEEDBACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPN_FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_DADOS_ALUNO_FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPN_FEEDBACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //INSTANCIAÇÃO DOS BEANS E FACTORYS RESPONSÁVEL POR CONCLUIR O AGENDAMENTO
            FeedbackDAO feedbackDAO = DAOFactory.criarFeedbackDAO(conexao);
            FeedBackBean feedBackBean = new FeedBackBean();
            FrmFeedbackAluno fbAluno;
            //VARIAVEL QUE RECEBERÁ A NOTA
            int nota = 0;

            /**
             * VALIDAÇÃO RESPONSÁVEL POR CAPTURAR A NOTA DO ATENDIMENTO
             */
            if (JR_FEEDBACK_1.isSelected()) {
                nota = 1;
            } else if (JR_FEEDBACK_2.isSelected()) {
                nota = 2;
            } else if (JR_FEEDBACK_3.isSelected()) {
                nota = 3;
            } else if (JR_FEEDBACK_4.isSelected()) {
                nota = 4;
            } else if (JR_FEEDBACK_5.isSelected()) {
                nota = 5;
            }
            
            /**
             * VERIFICA SE FOI MARCADO ALGUMA OPÇÃO PARA A NOTA
             */
            if (nota != 0) {
                /**
                 * SETAR OS BEANS COM OS VALORES DOS FORMULARIOS
                 */
                feedBackBean.setNota(nota);
                feedBackBean.setOpiniao(JTA_OBSERVACAO.getText());
                feedBackBean.setCod_atendimento(Integer.valueOf(JL_NUMERO_ATENDIMENTO.getText()));
                
                // SE INSERIR COM SUCESSO
                if (feedbackDAO.inserir(feedBackBean)) {
                    fbAluno = new FrmFeedbackAluno();
                    fbAluno.setVisible(true);
                    this.dispose();
                } else {
                    //TRATAMENTO DE ERRO
                    JOptionPane.showMessageDialog(null, "Erro ao inserir FeedBack !");
                }
            } else {
                //TRATAMENTO DE ERRO
                JOptionPane.showMessageDialog(null, "Faça uma avaliação do atendimento !");
            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÕES
            Logger.getLogger(FrmConcluirAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConcluirAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConcluirAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConcluirAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConcluirAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConcluirAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTG_FEEDBACK;
    public static javax.swing.JLabel JL_NUMERO_ATENDIMENTO;
    private javax.swing.JPanel JPN_DADOS_ALUNO_FEEDBACK;
    private javax.swing.JPanel JPN_FEEDBACK;
    private javax.swing.JRadioButton JR_FEEDBACK_1;
    private javax.swing.JRadioButton JR_FEEDBACK_2;
    private javax.swing.JRadioButton JR_FEEDBACK_3;
    private javax.swing.JRadioButton JR_FEEDBACK_4;
    private javax.swing.JRadioButton JR_FEEDBACK_5;
    private javax.swing.JTextArea JTA_OBSERVACAO;
    public static javax.swing.JTextField JTF_CPF_ALUNO_FEEDBACK;
    public static javax.swing.JTextField JTF_NOME_ALUNO_FEEDBACK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
