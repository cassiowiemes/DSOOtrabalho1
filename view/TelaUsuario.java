package view;
import utils.*;
import ctrl.CtrlUsuario;
import javax.swing.*;


public class TelaUsuario extends JFrame {

    CtrlUsuario ctrl;
 // Variables declaration - do not modify                     
    private javax.swing.JButton btLimparAluno;
    private javax.swing.JButton btLimparProfessor;
    private javax.swing.JButton btSalvarAluno;
    private javax.swing.JButton btSalvarProfessor;
    private javax.swing.JButton btVoltarAluno;
    private javax.swing.JButton btVoltarProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfDisciplinaProfessor;
    private javax.swing.JTextField tfEnderecoAluno;
    private javax.swing.JTextField tfEnderecoProfessor;
    private javax.swing.JTextField tfIdadeAluno;
    private javax.swing.JTextField tfIdadeProfessor;
    private javax.swing.JTextField tfMaeAluno;
    private javax.swing.JTextField tfMaeProfessor;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JTextField tfPaiAluno;
    private javax.swing.JTextField tfPaiProfessor;
    private javax.swing.JTextField tfTurmaAluno;
    private javax.swing.JTextField tfTurmaProfessor;
    // End of variables declaration 

    public TelaUsuario(CtrlUsuario ctrl) {
        //sc = new Scanner(System.in);
    	this.ctrl = ctrl;
    	initComponents();
		setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

	public UserWrapper getDadosAluno() {
		UserWrapper user = new UserWrapper();
		try{
			user.nome = tfNomeAluno.getText();
			user.idade = Integer.parseInt(tfIdadeAluno.getText());
			user.endereco = tfEnderecoAluno.getText();
			user.pai = tfPaiAluno.getText();
			user.mae = tfMaeAluno.getText();
			user.turma = Integer.parseInt(tfTurmaAluno.getText());
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor inválido, favor conferir...");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e + " lançada em TelaUsuario:68");
		}
		return user;
	}

	public void sucessoCriar(Integer id) {
		JOptionPane.showMessageDialog(null, "Criação efetuada com sucesso, código:" + id);
	}

	public UserWrapper getDadosProfessor() {
		UserWrapper user = new UserWrapper();
		try{
			user.nome = tfNomeProfessor.getText();
			user.idade = Integer.parseInt(tfIdadeProfessor.getText());
			user.endereco = tfEnderecoProfessor.getText();
			user.pai = tfPaiProfessor.getText();
			user.mae = tfMaeProfessor.getText();
			user.disciplina = Integer.parseInt(tfDisciplinaProfessor.getText());
			user.turma = Integer.parseInt(tfTurmaProfessor.getText());
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor inválido, favor conferir...");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e + " lançada em TelaUsuario:90");
		}
		return user;
	}
	
    private void btSalvarProfessorActionPerformed(java.awt.event.ActionEvent evt) {  
    	ctrl.realizaAcao("Salvar Professor");
    }                                                 

    private void btSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {  
    	ctrl.realizaAcao("Salvar Aluno");
    }                                             

    private void btLimparProfessorActionPerformed(java.awt.event.ActionEvent evt) { 
    	tfNomeProfessor.setText(null);
    	tfIdadeProfessor.setText(null);
    	tfEnderecoProfessor.setText(null);
    	tfDisciplinaProfessor.setText(null);
    	tfMaeProfessor.setText(null);
    	tfPaiProfessor.setText(null);
    	tfTurmaProfessor.setText(null);
    }                                                  

    private void btLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {   
    	tfNomeAluno.setText(null);
    	tfIdadeAluno.setText(null);
    	tfEnderecoAluno.setText(null);
    	tfMaeAluno.setText(null);
    	tfPaiAluno.setText(null);
    	tfTurmaAluno.setText(null);    	
    }                                                    

    private void btVoltarProfessorActionPerformed(java.awt.event.ActionEvent evt) { 
    	ctrl.realizaAcao("Voltar");
    }                                         

    private void btVoltarAlunoActionPerformed(java.awt.event.ActionEvent evt) {
    	ctrl.realizaAcao("Voltar");
    }
	
	private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tfNomeProfessor = new javax.swing.JTextField();
        tfIdadeProfessor = new javax.swing.JTextField();
        tfEnderecoProfessor = new javax.swing.JTextField();
        tfPaiProfessor = new javax.swing.JTextField();
        tfMaeProfessor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDisciplinaProfessor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTurmaProfessor = new javax.swing.JTextField();
        btSalvarProfessor = new javax.swing.JButton();
        btLimparProfessor = new javax.swing.JButton();
        btVoltarProfessor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        tfIdadeAluno = new javax.swing.JTextField();
        tfEnderecoAluno = new javax.swing.JTextField();
        tfPaiAluno = new javax.swing.JTextField();
        tfMaeAluno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTurmaAluno = new javax.swing.JTextField();
        btSalvarAluno = new javax.swing.JButton();
        btLimparAluno = new javax.swing.JButton();
        btVoltarAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNomeProfessor.setText("");

        tfIdadeProfessor.setText("");

        tfEnderecoProfessor.setText("");

        tfPaiProfessor.setText("");

        tfMaeProfessor.setText("");

        jLabel6.setText("Nome:");

        jLabel7.setText("Idade:");

        jLabel8.setText("Endereço:");

        jLabel9.setText("Nome do Pai:");

        jLabel10.setText("Nome da Mãe:");

        jLabel11.setText("Disciplina:");

        tfDisciplinaProfessor.setText("");

        jLabel12.setText("Turma:");

        tfTurmaProfessor.setText("");

        btSalvarProfessor.setText("Salvar");
        btSalvarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProfessorActionPerformed(evt);
            }
        });

        btLimparProfessor.setText("Limpar");
        btLimparProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparProfessorActionPerformed(evt);
            }
        });

        btVoltarProfessor.setText("Voltar");
        btVoltarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTurmaProfessor)
                            .addComponent(tfDisciplinaProfessor)
                            .addComponent(tfNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(tfIdadeProfessor)
                            .addComponent(tfEnderecoProfessor)
                            .addComponent(tfPaiProfessor)
                            .addComponent(tfMaeProfessor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSalvarProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarProfessor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfIdadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEnderecoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPaiProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfMaeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfTurmaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarProfessor)
                    .addComponent(btLimparProfessor)
                    .addComponent(btVoltarProfessor))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar Professor", jPanel2);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Nome do Pai:");

        jLabel5.setText("Nome da Mãe:");

        tfNomeAluno.setText("");

        tfIdadeAluno.setText("");

        tfEnderecoAluno.setText("");

        tfPaiAluno.setText("");

        tfMaeAluno.setText("");

        jLabel13.setText("Turma:");

        tfTurmaAluno.setText("");

        btSalvarAluno.setText("Salvar");
        btSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlunoActionPerformed(evt);
            }
        });

        btLimparAluno.setText("Limpar");
        btLimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAlunoActionPerformed(evt);
            }
        });

        btVoltarAluno.setText("Voltar");
        btVoltarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarAlunoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTurmaAluno)
                            .addComponent(tfNomeAluno)
                            .addComponent(tfIdadeAluno)
                            .addComponent(tfEnderecoAluno)
                            .addComponent(tfPaiAluno)
                            .addComponent(tfMaeAluno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvarAluno)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparAluno)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarAluno)
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIdadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPaiAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfMaeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarAluno)
                    .addComponent(btLimparAluno)
                    .addComponent(btVoltarAluno))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar Aluno", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

}
