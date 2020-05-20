
import javax.swing.SpinnerNumberModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukra
 */
public class NewJFrame extends javax.swing.JFrame {
    double couvert = 0;
    double totalPagar = 0;
    String botaoSim ; 
    double quantidadePessoas = 0;
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        SpinnerNumberModel SPNN_QuantidadePessoas = new SpinnerNumberModel();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_TaxaDeServico = new javax.swing.ButtonGroup();
        scrollPane1 = new java.awt.ScrollPane();
        JPL_Informacao_de_Consumo = new javax.swing.JPanel();
        LBL_ConsumoTotal = new javax.swing.JLabel();
        TXT_ConsumoTotal = new javax.swing.JTextField();
        LBL_CouvertPessoa = new javax.swing.JLabel();
        TXT_CouvertPessoa = new javax.swing.JTextField();
        LBL_TaxaServico = new javax.swing.JLabel();
        LBL_QuantidadePessoas = new javax.swing.JLabel();
        javax.swing.JSpinner SPNN_QuantidadePessoas = new javax.swing.JSpinner();
        RDBNT_Sim = new javax.swing.JRadioButton();
        RDBNT_Nao = new javax.swing.JRadioButton();
        JTXT_Gambiarra = new javax.swing.JTextField();
        JPL_Custo_Final = new javax.swing.JPanel();
        LBL_CustoTotal = new javax.swing.JLabel();
        TXT_CustoTotal = new javax.swing.JTextField();
        LBL_CustoPessoa = new javax.swing.JLabel();
        TXT_CustoPessoa = new javax.swing.JTextField();
        BNT_Fechar = new javax.swing.JButton();
        BNT_Limpar = new javax.swing.JButton();
        BNT_Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPL_Informacao_de_Consumo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Consumo"));

        LBL_ConsumoTotal.setText("Consumo Total (R$)");

        TXT_ConsumoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ConsumoTotalActionPerformed(evt);
            }
        });

        LBL_CouvertPessoa.setText("Couvert Por Pessoa (R$)");

        TXT_CouvertPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_CouvertPessoaActionPerformed(evt);
            }
        });

        LBL_TaxaServico.setText("Possui Taxa De Serviço (10%)");

        LBL_QuantidadePessoas.setText("Dividir Em Quantas Pessoas");

        SPNN_QuantidadePessoas.setAutoscrolls(true);
        SPNN_QuantidadePessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SPNN_QuantidadePessoas.setOpaque(false);

        BG_TaxaDeServico.add(RDBNT_Sim);
        RDBNT_Sim.setText("Sim");
        RDBNT_Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBNT_SimActionPerformed(evt);
            }
        });

        BG_TaxaDeServico.add(RDBNT_Nao);
        RDBNT_Nao.setSelected(true);
        RDBNT_Nao.setText("Não");
        RDBNT_Nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBNT_NaoActionPerformed(evt);
            }
        });

        JTXT_Gambiarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXT_GambiarraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPL_Informacao_de_ConsumoLayout = new javax.swing.GroupLayout(JPL_Informacao_de_Consumo);
        JPL_Informacao_de_Consumo.setLayout(JPL_Informacao_de_ConsumoLayout);
        JPL_Informacao_de_ConsumoLayout.setHorizontalGroup(
            JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                        .addComponent(LBL_TaxaServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RDBNT_Sim))
                    .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                        .addComponent(LBL_QuantidadePessoas)
                        .addGap(75, 75, 75)
                        .addComponent(SPNN_QuantidadePessoas))
                    .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                        .addComponent(LBL_ConsumoTotal)
                        .addGap(178, 178, 178))
                    .addComponent(TXT_ConsumoTotal))
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_CouvertPessoa)
                            .addComponent(TXT_CouvertPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RDBNT_Nao))
                        .addContainerGap())
                    .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTXT_Gambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPL_Informacao_de_ConsumoLayout.setVerticalGroup(
            JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_Informacao_de_ConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_ConsumoTotal)
                    .addComponent(LBL_CouvertPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_ConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_CouvertPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_TaxaServico)
                    .addComponent(RDBNT_Sim)
                    .addComponent(RDBNT_Nao))
                .addGap(18, 18, 18)
                .addGroup(JPL_Informacao_de_ConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_QuantidadePessoas)
                    .addComponent(SPNN_QuantidadePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTXT_Gambiarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPL_Custo_Final.setBorder(javax.swing.BorderFactory.createTitledBorder("Custo Total"));

        LBL_CustoTotal.setText("Custo Total (R$)");

        TXT_CustoTotal.setEditable(false);
        TXT_CustoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_CustoTotalActionPerformed(evt);
            }
        });

        LBL_CustoPessoa.setText("Custo Total Por Pessoa (R$)");

        TXT_CustoPessoa.setEditable(false);
        TXT_CustoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_CustoPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPL_Custo_FinalLayout = new javax.swing.GroupLayout(JPL_Custo_Final);
        JPL_Custo_Final.setLayout(JPL_Custo_FinalLayout);
        JPL_Custo_FinalLayout.setHorizontalGroup(
            JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_Custo_FinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_CustoTotal)
                    .addComponent(TXT_CustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPL_Custo_FinalLayout.createSequentialGroup()
                        .addComponent(LBL_CustoPessoa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TXT_CustoPessoa))
                .addContainerGap())
        );
        JPL_Custo_FinalLayout.setVerticalGroup(
            JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_Custo_FinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_CustoTotal)
                    .addComponent(LBL_CustoPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPL_Custo_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_CustoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        BNT_Fechar.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Fechar.setText("Fechar");
        BNT_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_FecharActionPerformed(evt);
            }
        });

        BNT_Limpar.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Limpar.setText("Limpar");
        BNT_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_LimparActionPerformed(evt);
            }
        });

        BNT_Calcular.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Calcular.setText("Calcular");
        BNT_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPL_Custo_Final, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPL_Informacao_de_Consumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BNT_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(BNT_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BNT_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPL_Informacao_de_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPL_Custo_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BNT_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BNT_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BNT_Fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_ConsumoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ConsumoTotalActionPerformed
        
    }//GEN-LAST:event_TXT_ConsumoTotalActionPerformed

    private void TXT_CouvertPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_CouvertPessoaActionPerformed
       
    }//GEN-LAST:event_TXT_CouvertPessoaActionPerformed

    private void RDBNT_SimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBNT_SimActionPerformed
        botaoSim = "Sim";
    }//GEN-LAST:event_RDBNT_SimActionPerformed

    private void TXT_CustoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_CustoPessoaActionPerformed
       
    }//GEN-LAST:event_TXT_CustoPessoaActionPerformed

    private void TXT_CustoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_CustoTotalActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TXT_CustoTotalActionPerformed

    private void RDBNT_NaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBNT_NaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RDBNT_NaoActionPerformed

    private void BNT_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_FecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BNT_FecharActionPerformed

    private void BNT_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_LimparActionPerformed
        // TODO add your handling code here:
        totalPagar = 0;
        couvert = 0;
        quantidadePessoas = 0;
        TXT_ConsumoTotal.setText("");
        TXT_CustoTotal.setText("");
        TXT_CustoPessoa.setText("");
        TXT_CouvertPessoa.setText("");
        JTXT_Gambiarra.setText("");
        
    }//GEN-LAST:event_BNT_LimparActionPerformed

    private void BNT_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_CalcularActionPerformed
        // TODO add your handling code here:
        if(botaoSim == "Sim"){
            quantidadePessoas = Double.parseDouble(JTXT_Gambiarra.getText());
            totalPagar = Double.parseDouble(TXT_ConsumoTotal.getText());
            couvert = Double.parseDouble(TXT_CouvertPessoa.getText());
            TXT_CustoTotal.setText(String.valueOf(((quantidadePessoas * couvert) + totalPagar)*1.1));
            TXT_CustoPessoa.setText(String.valueOf(((((quantidadePessoas * couvert) + totalPagar)*1.1)/quantidadePessoas)));
        }else{
            quantidadePessoas = Double.parseDouble(JTXT_Gambiarra.getText());
            totalPagar = Double.parseDouble(TXT_ConsumoTotal.getText());
            couvert = Double.parseDouble(TXT_CouvertPessoa.getText());
            TXT_CustoTotal.setText(String.valueOf((quantidadePessoas * couvert) + totalPagar));
            TXT_CustoPessoa.setText(String.valueOf((((quantidadePessoas * couvert) + totalPagar)/quantidadePessoas)));
        }
    }//GEN-LAST:event_BNT_CalcularActionPerformed

    private void JTXT_GambiarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXT_GambiarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXT_GambiarraActionPerformed

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
             javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_TaxaDeServico;
    private javax.swing.JButton BNT_Calcular;
    private javax.swing.JButton BNT_Fechar;
    private javax.swing.JButton BNT_Limpar;
    private javax.swing.JPanel JPL_Custo_Final;
    private javax.swing.JPanel JPL_Informacao_de_Consumo;
    private javax.swing.JTextField JTXT_Gambiarra;
    private javax.swing.JLabel LBL_ConsumoTotal;
    private javax.swing.JLabel LBL_CouvertPessoa;
    private javax.swing.JLabel LBL_CustoPessoa;
    private javax.swing.JLabel LBL_CustoTotal;
    private javax.swing.JLabel LBL_QuantidadePessoas;
    private javax.swing.JLabel LBL_TaxaServico;
    private javax.swing.JRadioButton RDBNT_Nao;
    private javax.swing.JRadioButton RDBNT_Sim;
    private javax.swing.JTextField TXT_ConsumoTotal;
    private javax.swing.JTextField TXT_CouvertPessoa;
    private javax.swing.JTextField TXT_CustoPessoa;
    private javax.swing.JTextField TXT_CustoTotal;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
