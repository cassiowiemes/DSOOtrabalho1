package view;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import utils.ChaveInvalidaException;
import utils.EmprestimoWrapper;
import ctrl.CtrlEmprestimo;

public class TelaEmprestimo extends JFrame {
	private static final long serialVersionUID = 1L;
	CtrlEmprestimo ctrl;
	
	public TelaEmprestimo(CtrlEmprestimo ctrl){
		this.ctrl = ctrl;
		initComponents();
		setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	}

	public void mostraMulta(float multa) {
		JOptionPane.showMessageDialog(null, "Multa calculada: " + multa + " para devolução.");
	}
	
	public void campoInvalido() {
		JOptionPane.showMessageDialog(null, "Código inválido, favor conferir...");
	}

	public void sucessoCriar(Integer id) {
		JOptionPane.showMessageDialog(null, "Criação efetuada com sucesso, código:" + id);
	}
	
	public EmprestimoWrapper getDadosEmprestimo(){
		EmprestimoWrapper emprestimo = new EmprestimoWrapper();
		try{
			emprestimo.codigoExemplar = Integer.parseInt(tfCodigoExemplarEmp.getText());
			emprestimo.codigoUsuario = Integer.parseInt(tfCodigoUsuarioEmp.getText());
			emprestimo.dataEmprestimo = Integer.parseInt(tfDataEmprestimo.getText());
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor inválido, favor conferir...");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return emprestimo;
	}
	
	public EmprestimoWrapper getDadosDevolucao(){
		EmprestimoWrapper emprestimo = new EmprestimoWrapper();
		try{
			emprestimo.id = Integer.parseInt(tfCodigoEmprestimo.getText());
			emprestimo.dataDevolucao = Integer.parseInt(tfDataEmprestimo.getText());
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor inválido, favor conferir...");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return emprestimo;
	}

	                        
	private void btSalvarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {   
    	try {
			ctrl.realizaAcao("Salvar Emprestimo");
		} catch (ChaveInvalidaException e) {
			campoInvalido();
		}
    }  
    
    private void btLimparEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {   
    	tfCodigoExemplarEmp.setText(null);
    	tfCodigoUsuarioEmp.setText(null);
    	tfDataEmprestimo.setText(null);
    }
    
    private void btVoltarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) { 
    	try {
			ctrl.realizaAcao("Voltar");
		} catch (ChaveInvalidaException e) {
			e.printStackTrace();			
		}
    }
	
    private void btSalvarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) { 
		try {
			ctrl.realizaAcao("Salvar Devolucao");
		} catch (ChaveInvalidaException e) {
			campoInvalido();
		}
    } 
    
    private void btLimparDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {
    	tfCodigoEmprestimo.setText(null);
    	tfDataDevolucao.setText(null);
    }  
    
    private void btVoltarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
			ctrl.realizaAcao("Voltar");
		} catch (ChaveInvalidaException e) {
			e.printStackTrace();			
		}
    }                                                 

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
			ctrl.realizaAcao("Gerar Relatorio");
		} catch (ChaveInvalidaException e) {
			e.printStackTrace();			
		}
    }
    
 // Variables declaration - do not modify                     
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JButton btLimparDevolucao;
    private javax.swing.JButton btLimparEmprestimo;
    private javax.swing.JButton btSalvarDevolucao;
    private javax.swing.JButton btSalvarEmprestimo;
    private javax.swing.JButton btVoltarDevolucao;
    private javax.swing.JButton btVoltarEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCodigoExemplarEmp;
    private javax.swing.JTextField tfCodigoEmprestimo;
    private javax.swing.JTextField tfCodigoUsuarioEmp;
    private javax.swing.JTextField tfDataDevolucao;
    private javax.swing.JTextField tfDataEmprestimo;
    // End of variables declaration
	private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btLimparEmprestimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btVoltarEmprestimo = new javax.swing.JButton();
        tfCodigoExemplarEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoUsuarioEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDataEmprestimo = new javax.swing.JTextField();
        btSalvarEmprestimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btSalvarDevolucao = new javax.swing.JButton();
        btLimparDevolucao = new javax.swing.JButton();
        btVoltarDevolucao = new javax.swing.JButton();
        tfCodigoEmprestimo = new javax.swing.JTextField();
        tfDataDevolucao = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        btGerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btLimparEmprestimo.setText("Limpar");
        btLimparEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEmprestimoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo do Usuario:");

        btVoltarEmprestimo.setText("Voltar");
        btVoltarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarEmprestimoActionPerformed(evt);
            }
        });

        tfCodigoExemplarEmp.setText("");

        jLabel2.setText("Codigo do Exemplar:");

        tfCodigoUsuarioEmp.setText("");

        jLabel3.setText("Data do Empréstimo:");

        tfDataEmprestimo.setText("");

        btSalvarEmprestimo.setText("Salvar");
        btSalvarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvarEmprestimo)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparEmprestimo)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarEmprestimo)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfCodigoExemplarEmp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigoUsuarioEmp)
                                    .addComponent(tfDataEmprestimo))))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigoExemplarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoUsuarioEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarEmprestimo)
                    .addComponent(btLimparEmprestimo)
                    .addComponent(btVoltarEmprestimo))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Efetuar Empréstimo", jPanel1);

        jLabel9.setText("Código do Empréstimo:");

        jLabel11.setText("Data da devolução:");

        btSalvarDevolucao.setText("Salvar");
        btSalvarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarDevolucaoActionPerformed(evt);
            }
        });

        btLimparDevolucao.setText("Limpar");
        btLimparDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDevolucaoActionPerformed(evt);
            }
        });

        btVoltarDevolucao.setText("Voltar");
        btVoltarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarDevolucaoActionPerformed(evt);
            }
        });

        tfCodigoEmprestimo.setText("");

        tfDataDevolucao.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigoEmprestimo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSalvarDevolucao)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparDevolucao)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarDevolucao)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(tfDataDevolucao)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfCodigoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarDevolucao)
                    .addComponent(btLimparDevolucao)
                    .addComponent(btVoltarDevolucao))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Efetuar Devolucao", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código do Usuário", "Código do Exemplar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel15.setText("Relatório de Atrasos:");

        btGerarRelatorio.setText("Gerar");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btGerarRelatorio)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGerarRelatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Relatório de Empréstimos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>
}
