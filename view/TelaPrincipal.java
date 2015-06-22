package view;
import javax.swing.*;
import ctrl.CtrlPrincipal;

public class TelaPrincipal extends JFrame{
	
	CtrlPrincipal ctrl;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btGerenciarEmprestimos;
    private javax.swing.JButton btGerenciarItens;
    private javax.swing.JButton btGerenciarUsuarios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
	
	public TelaPrincipal(CtrlPrincipal ctrl){
		initComponents();
		this.ctrl = ctrl;
	}
	
	private void initComponents() {

        btGerenciarEmprestimos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btGerenciarUsuarios = new javax.swing.JButton();
        btGerenciarItens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Central");
        setResizable(false);

        btGerenciarEmprestimos.setText("Gerenciar Empréstimos");
        btGerenciarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarEmprestimosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIBLIOTECA CENTRAL!");

        btGerenciarUsuarios.setText("Gerenciar Usuários");
        btGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarUsuariosActionPerformed(evt);
            }
        });

        btGerenciarItens.setText("Gerenciar Acervo");
        btGerenciarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarItensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGerenciarEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(btGerenciarItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGerenciarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btGerenciarEmprestimos)
                .addGap(18, 18, 18)
                .addComponent(btGerenciarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btGerenciarItens)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btGerenciarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {
        ctrl.realizaAcao(1);
    }                                                      

    private void btGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {   
        ctrl.realizaAcao(2);
    }                                                   

    private void btGerenciarItensActionPerformed(java.awt.event.ActionEvent evt) {   
        ctrl.realizaAcao(3);
    }
}
