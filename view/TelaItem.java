package view;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.ItemWrapper;
import ctrl.CtrlItem;
import ctrl.CtrlUsuario;

public class TelaItem extends JFrame {

	CtrlItem ctrl;
	
	public TelaItem(CtrlItem ctrl)
	{
		this.ctrl = ctrl;
		initComponents();
		setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	}

	                        
    
    public ItemWrapper getDadosLivro(){
    	ItemWrapper item = new ItemWrapper();
    	try{
    		item.titulo = tfTituloLivro.getText();
    		item.editora = tfEditoraLivro.getText();
    		item.ano = Integer.parseInt(tfAnoLivro.getText());
    		item.faixaEtaria = faixaLivro.getSelectedItem().toString();
    		item.genero = generoLivro.getSelectedItem().toString();
    	} catch (Exception e){
    		
    	}    	
    	return item;
    }
    
    public ItemWrapper getDadosRevista(){
		ItemWrapper item = new ItemWrapper();
    	try{
	    	item.titulo = tfTituloRevista.getText();
	    	item.editora = tfEditoraRevista.getText();
	    	item.ano = Integer.parseInt(tfAnoRevista.getText());
	    	item.faixaEtaria = faixaRevista.getSelectedItem().toString();
	    	item.periodicidade = periodRevista.getSelectedItem().toString();
    	} catch (Exception e){
    		
    	}
    	return item;
    }

	private void btSalvarLivroActionPerformed(java.awt.event.ActionEvent evt) { 
		ctrl.realizaAcao("Salvar livro");
	}                                             

    private void btLimparLivroActionPerformed(java.awt.event.ActionEvent evt) { 
    	tfTituloLivro.setText(null);
    	tfEditoraLivro.setText(null);
    	tfAnoLivro.setText(null);
    }
    
	private void btVoltarLivroActionPerformed(java.awt.event.ActionEvent evt) {
		ctrl.realizaAcao("Voltar");
	}
	
    private void btSalvarRevistaActionPerformed(java.awt.event.ActionEvent evt) { 
    	ctrl.realizaAcao("Salvar Revista");
    }                                               

    private void btLimparRevistaActionPerformed(java.awt.event.ActionEvent evt) { 
    	tfTituloRevista.setText(null);
    	tfEditoraRevista.setText(null);
    	tfAnoRevista.setText(null);
    }                                               

    private void btVoltarRevistaActionPerformed(java.awt.event.ActionEvent evt) { 
    	ctrl.realizaAcao("Voltar");
    }                                             

    private void btAddExemplarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btBuscarItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btAddAutorActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btSetEdicaoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

	public void sucesso(Integer id) {
		JOptionPane.showMessageDialog(null, "Registro bem sucedido, código: " + id, "Criar usuário", 1);
	}
	
	// Variables declaration - do not modify                     
    private javax.swing.JToggleButton btAddAutor;
    private javax.swing.JToggleButton btAddExemplar;
    private javax.swing.JTextField btBuscarAddExemplar;
    private javax.swing.JButton btBuscarItem;
    private javax.swing.JButton btLimparLivro;
    private javax.swing.JButton btLimparRevista;
    private javax.swing.JButton btSalvarLivro;
    private javax.swing.JButton btSalvarRevista;
    private javax.swing.JToggleButton btSetEdicao;
    private javax.swing.JButton btVoltarLivro;
    private javax.swing.JButton btVoltarRevista;
    private javax.swing.JComboBox faixaLivro;
    private javax.swing.JComboBox faixaRevista;
    private javax.swing.JComboBox generoLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTítuloItem;
    private javax.swing.JComboBox periodRevista;
    private javax.swing.JTextField tfAnoLivro;
    private javax.swing.JTextField tfAnoRevista;
    private javax.swing.JTextField tfCodigoExemplar;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditoraLivro;
    private javax.swing.JTextField tfEditoraRevista;
    private javax.swing.JTextField tfNomeAutor;
    private javax.swing.JTextField tfTituloLivro;
    private javax.swing.JTextField tfTituloRevista;
    // End of variables declaration
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTituloLivro = new javax.swing.JTextField();
        tfEditoraLivro = new javax.swing.JTextField();
        tfAnoLivro = new javax.swing.JTextField();
        faixaLivro = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        generoLivro = new javax.swing.JComboBox();
        btSalvarLivro = new javax.swing.JButton();
        btLimparLivro = new javax.swing.JButton();
        btVoltarLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfTituloRevista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfEditoraRevista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfAnoRevista = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        faixaRevista = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        periodRevista = new javax.swing.JComboBox();
        btSalvarRevista = new javax.swing.JButton();
        btLimparRevista = new javax.swing.JButton();
        btVoltarRevista = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btBuscarAddExemplar = new javax.swing.JTextField();
        btBuscarItem = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lbTítuloItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        tfNomeAutor = new javax.swing.JTextField();
        btAddAutor = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        btSetEdicao = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        tfCodigoExemplar = new javax.swing.JTextField();
        btAddExemplar = new javax.swing.JToggleButton();

        jLabel4.setText("jLabel4");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Título:");

        jLabel2.setText("Editora:");

        jLabel5.setText("Ano de lançamento:");

        jLabel6.setText("Faixa etária:");

        tfTituloLivro.setText("jTextField1");

        tfEditoraLivro.setText("jTextField2");

        tfAnoLivro.setText("jTextField3");

        faixaLivro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Gênero:");

        generoLivro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btSalvarLivro.setText("Salvar");
        btSalvarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarLivroActionPerformed(evt);
            }
        });

        btLimparLivro.setText("Limpar");
        btLimparLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparLivroActionPerformed(evt);
            }
        });

        btVoltarLivro.setText("Voltar");
        btVoltarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEditoraLivro)
                            .addComponent(tfTituloLivro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generoLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faixaLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfAnoLivro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvarLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarLivro)
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(faixaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(generoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarLivro)
                    .addComponent(btLimparLivro)
                    .addComponent(btVoltarLivro))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar Livro", jPanel1);

        jLabel7.setText("Título:");

        tfTituloRevista.setText("jTextField1");

        jLabel8.setText("Editora:");

        tfEditoraRevista.setText("jTextField2");

        jLabel9.setText("Ano de lançamento:");

        tfAnoRevista.setText("jTextField3");

        jLabel10.setText("Faixa etária:");

        faixaRevista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Periodicidade:");

        periodRevista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btSalvarRevista.setText("Salvar");
        btSalvarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarRevistaActionPerformed(evt);
            }
        });

        btLimparRevista.setText("Limpar");
        btLimparRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparRevistaActionPerformed(evt);
            }
        });

        btVoltarRevista.setText("Voltar");
        btVoltarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarRevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEditoraRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(tfTituloRevista)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(periodRevista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faixaRevista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfAnoRevista)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSalvarRevista)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparRevista)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltarRevista)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTituloRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEditoraRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfAnoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(faixaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(periodRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarRevista)
                    .addComponent(btLimparRevista)
                    .addComponent(btVoltarRevista))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar Revista", jPanel2);

        jLabel13.setText("Código do item:");

        btBuscarAddExemplar.setText("jTextField7");

        btBuscarItem.setText("Buscar");
        btBuscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarItemActionPerformed(evt);
            }
        });

        jLabel14.setText("Título do Item:");

        lbTítuloItem.setText("---");

        jLabel16.setText("Autor:");

        tfNomeAutor.setText("jTextField8");

        btAddAutor.setText("Adicionar autor");
        btAddAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAutorActionPerformed(evt);
            }
        });

        jLabel17.setText("Edição:");

        tfEdicao.setText("jTextField9");

        btSetEdicao.setText("Definir edição");
        btSetEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetEdicaoActionPerformed(evt);
            }
        });

        jLabel15.setText("Exemplar:");

        tfCodigoExemplar.setText("jTextField7");

        btAddExemplar.setText("jToggleButton1");
        btAddExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddExemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(59, 59, 59)
                        .addComponent(tfEdicao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(63, 63, 63)
                        .addComponent(tfNomeAutor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAddAutor)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(btBuscarAddExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btBuscarItem))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTítuloItem)
                                    .addComponent(jLabel14)))
                            .addComponent(btSetEdicao)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(tfCodigoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAddExemplar)))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btBuscarAddExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscarItem)
                    .addComponent(lbTítuloItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSetEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfCodigoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddExemplar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Adicionar Exemplar", jPanel3);

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
