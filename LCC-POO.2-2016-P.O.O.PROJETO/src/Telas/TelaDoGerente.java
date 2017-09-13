/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.CardLayout;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Programa.Acesso;
import Programa.Cliente;
import Programa.Contato;
import Programa.Data;
import Programa.Endereco;
import Programa.Ficha;
import Programa.Gerente;
import Programa.Telefone;
import Programa.Treinador;
import Programa.Treino;

public class TelaDoGerente extends javax.swing.JDialog {

	Cliente cliente = new Cliente();
	Treinador treinador = new Treinador();
	Gerente gerente = new Gerente();

	List<Cliente> listaC = treinador.getListaDeClientes();
	List<Treinador> listaT = gerente.getListaDeTreinadores();

	public String nome;
	public String cpf;
	public String rg;
	public String nacimento;
	public String inicio;

	public TelaDoGerente(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();

		String nomeDoGerente = TelaDeLogin.nome;
		bemVindo.setText("Bem vindo Gerente(a): " + nomeDoGerente.toUpperCase());

		DefaultTableModel modelo01 = (DefaultTableModel) TabelaAtividadeC.getModel();
		TabelaAtividadeC.setRowSorter(new TableRowSorter(modelo01));
		DefaultTableModel modelo02 = (DefaultTableModel) TabelaAtividadeF.getModel();
		TabelaAtividadeF.setRowSorter(new TableRowSorter(modelo02));

		DefaultTableModel modelo03 = (DefaultTableModel) TabelaDoCliente.getModel();
		TabelaDoCliente.setRowSorter(new TableRowSorter(modelo03));
		DefaultTableModel modelo04 = (DefaultTableModel) TabelaDoFuncionario.getModel();
		TabelaDoFuncionario.setRowSorter(new TableRowSorter(modelo04));
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jToggleButton1 = new javax.swing.JToggleButton();
		jButton4 = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		jScrollPane5 = new javax.swing.JScrollPane();
		TabelaAtividadeC = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		bemVindo = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel14 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel15 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jPanel16 = new javax.swing.JPanel();
		jScrollPane6 = new javax.swing.JScrollPane();
		TabelaAtividadeF = new javax.swing.JTable();
		jPanel4 = new javax.swing.JPanel();
		jLabel37 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel72 = new javax.swing.JLabel();
		txtNomeF = new javax.swing.JTextField();
		jLabel73 = new javax.swing.JLabel();
		txtDataNacimentoF = new javax.swing.JFormattedTextField();
		jLabel74 = new javax.swing.JLabel();
		txtCPFF = new javax.swing.JFormattedTextField();
		txtRGF = new javax.swing.JFormattedTextField();
		jLabel75 = new javax.swing.JLabel();
		escolharSexoF = new javax.swing.JComboBox<>();
		jLabel76 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		txtCidadeF = new javax.swing.JTextField();
		txtRuaF = new javax.swing.JTextField();
		jLabel43 = new javax.swing.JLabel();
		txtBairroF = new javax.swing.JTextField();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		txtNumeroCasaF = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		txtNumeroF = new javax.swing.JTextField();
		jLabel47 = new javax.swing.JLabel();
		txtDDF = new javax.swing.JTextField();
		jLabel48 = new javax.swing.JLabel();
		txtEmailF = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jLabel49 = new javax.swing.JLabel();
		txtLoginF = new javax.swing.JTextField();
		jLabel58 = new javax.swing.JLabel();
		txtPassworF = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jLabel59 = new javax.swing.JLabel();
		escolarTurnoF = new javax.swing.JComboBox<>();
		jLabel62 = new javax.swing.JLabel();
		escolhaFuncaoF = new javax.swing.JComboBox<>();
		jLabel63 = new javax.swing.JLabel();
		escolharDDPF = new javax.swing.JComboBox<>();
		jLabel64 = new javax.swing.JLabel();
		txtSalarioF = new javax.swing.JTextField();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jPanel11 = new javax.swing.JPanel();
		jLabel61 = new javax.swing.JLabel();
		jPanel12 = new javax.swing.JPanel();
		jLabel25 = new javax.swing.JLabel();
		jPanel18 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		TabelaDoFuncionario = new javax.swing.JTable();
		jPanel13 = new javax.swing.JPanel();
		jLabel33 = new javax.swing.JLabel();
		botaoDeDeletar = new javax.swing.JButton();
		botaoDeAtualizar = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel66 = new javax.swing.JLabel();
		txtNomeC = new javax.swing.JTextField();
		jLabel67 = new javax.swing.JLabel();
		jLabel68 = new javax.swing.JLabel();
		txtCPFC = new javax.swing.JFormattedTextField();
		jLabel69 = new javax.swing.JLabel();
		jLabel70 = new javax.swing.JLabel();
		escolharSexoC = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		txtRuaC = new javax.swing.JTextField();
		jLabel29 = new javax.swing.JLabel();
		txtBairroC = new javax.swing.JTextField();
		jLabel30 = new javax.swing.JLabel();
		txtCidadeC = new javax.swing.JTextField();
		jLabel28 = new javax.swing.JLabel();
		txtNumeroCasaC = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		txtNumeroC = new javax.swing.JTextField();
		jLabel32 = new javax.swing.JLabel();
		txtDDC = new javax.swing.JTextField();
		jLabel35 = new javax.swing.JLabel();
		txtEmailC = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		escolarTurnoC = new javax.swing.JComboBox<>();
		jLabel41 = new javax.swing.JLabel();
		escolharAtividadeC = new javax.swing.JComboBox<>();
		jLabel40 = new javax.swing.JLabel();
		escolharDDPC = new javax.swing.JComboBox<>();
		jLabel71 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		txtResponsavelC = new javax.swing.JTextField();
		txtDataNacimentoC = new javax.swing.JFormattedTextField();
		txtDataDeInicioC = new javax.swing.JFormattedTextField();
		txtRGC = new javax.swing.JFormattedTextField();
		txtLoginC = new javax.swing.JTextField();
		txtPassworC = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jPanel9 = new javax.swing.JPanel();
		jLabel60 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jPanel17 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		TabelaDoCliente = new javax.swing.JTable();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(830, 730));

		jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
		jScrollPane1.setMinimumSize(new java.awt.Dimension(25, 25));
		jScrollPane1.setPreferredSize(new java.awt.Dimension(32746, 760));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setLayout(new java.awt.CardLayout());

		jPanel2.setBackground(new java.awt.Color(0, 153, 153));

		jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
		jToggleButton1.setText("Deletar.");
		jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButton1ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
		jButton4.setText("Deletar.");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jPanel7.setBackground(new java.awt.Color(204, 204, 204));
		jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		TabelaAtividadeC.setBackground(new java.awt.Color(204, 204, 204));
		TabelaAtividadeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
		TabelaAtividadeC.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Nome.", "Ativo ou Nao Ativo.", "CPF." }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane5.setViewportView(TabelaAtividadeC);

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane5,
						javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));

		bemVindo.setBackground(new java.awt.Color(0, 0, 0));
		bemVindo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		bemVindo.setText("Menu Inicial.");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(bemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bemVindo));

		jPanel8.setBackground(new java.awt.Color(204, 204, 204));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Clientes.");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addComponent(jLabel1).addGap(0, 494, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING));

		jPanel14.setBackground(new java.awt.Color(204, 204, 204));

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel2.setText("Funcionarios.");

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup().addComponent(jLabel2).addGap(0, 0, Short.MAX_VALUE)));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING));

		jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Academia.png"))); // NOI18N

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(
				jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.PREFERRED_SIZE, 191, Short.MAX_VALUE));

		jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		TabelaAtividadeF.setBackground(new java.awt.Color(204, 204, 204));
		TabelaAtividadeF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
		TabelaAtividadeF.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Nome.", "Função.", "CPF." }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane6.setViewportView(TabelaAtividadeF);

		javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
		jPanel16.setLayout(jPanel16Layout);
		jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane6));
		jPanel16Layout.setVerticalGroup(
				jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane6,
						javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jToggleButton1).addComponent(jButton4)
								.addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(150, 150, 150).addComponent(jPanel15,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(2809, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(23, 23, 23)
						.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jToggleButton1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4)
						.addContainerGap(1105, Short.MAX_VALUE)));

		jPanel1.add(jPanel2, "TelaMenu");

		jPanel4.setBackground(new java.awt.Color(0, 153, 153));

		jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel37.setText("Painel do Funcionario.");

		jButton5.setBackground(new java.awt.Color(204, 204, 204));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
		jButton5.setText("Deletar.");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(204, 204, 204));
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
		jButton6.setText("Atualizar.");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));
		jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel5.setText("Dados Pessoais.");

		jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel72.setText("Nome do Cliente.");

		txtNomeF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeFActionPerformed(evt);
			}
		});

		jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel73.setText("Data de nacimento.");

		try {
			txtDataNacimentoF.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel74.setText("CPF.");

		try {
			txtCPFF.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		try {
			txtRGF.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel75.setText("RG.");

		escolharSexoF.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Masculino.", "Feminino." }));

		jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel76.setText("Sexo.");

		jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel14.setText("Endereço.");

		jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel38.setText("Cidade.");

		txtCidadeF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCidadeFActionPerformed(evt);
			}
		});

		txtRuaF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtRuaFActionPerformed(evt);
			}
		});

		jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel43.setText("Rua.");

		txtBairroF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtBairroFActionPerformed(evt);
			}
		});

		jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel44.setText("Bairro.");

		jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel45.setText("Numero.");

		txtNumeroCasaF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNumeroCasaFActionPerformed(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel15.setText("Contato.");

		jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel46.setText("Numero.");

		txtNumeroF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNumeroFActionPerformed(evt);
			}
		});

		jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel47.setText("DD.");

		txtDDF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDDFActionPerformed(evt);
			}
		});

		jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel48.setText("Email.");

		txtEmailF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEmailFActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel16.setText("Login e Password.");

		jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel49.setText("Login.");

		txtLoginF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtLoginFActionPerformed(evt);
			}
		});

		jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel58.setText("Password.");

		txtPassworF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPassworFActionPerformed(evt);
			}
		});

		jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel20.setText("Dados Academia.");

		jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel59.setText("Turno.");

		escolarTurnoF.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Manham.", "Tarde.", "Noite." }));

		jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel62.setText("Função.");

		escolhaFuncaoF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Treinador." }));

		jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel63.setText("Dia de Pagamento.");

		escolharDDPF.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Dia 10.", "Dia 20.", "Dia 30." }));

		jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel64.setText("Salario.");

		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
		jButton10.setText("Verificar.");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
		jButton11.setText("Verificar.");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout
								.createSequentialGroup()
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel5)
										.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel72))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel6Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE,
																143, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(txtDataNacimentoF,
																javax.swing.GroupLayout.PREFERRED_SIZE, 151,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(escolharSexoF, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel6Layout.createSequentialGroup()
								.addGroup(jPanel6Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 265,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(jPanel6Layout.createSequentialGroup()
																.addComponent(jLabel14,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 100,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(205, 205, 205))
														.addGroup(jPanel6Layout.createSequentialGroup()
																.addComponent(jLabel38)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel43,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 82,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
														.addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE,
																100, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel16).addComponent(jLabel20)
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(txtNumeroF, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtDDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtEmailF, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtCPFF, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel74))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel6Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE,
																59, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(txtRGF, javax.swing.GroupLayout.PREFERRED_SIZE,
																151, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel6Layout.createSequentialGroup()
														.addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE,
																163, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(99, 99, 99))
												.addGroup(jPanel6Layout.createSequentialGroup()
														.addComponent(txtLoginF, javax.swing.GroupLayout.PREFERRED_SIZE,
																163, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton10).addGap(7, 7, 7)))
												.addGroup(jPanel6Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE,
																163, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel6Layout.createSequentialGroup()
																.addComponent(txtPassworF,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 163,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jButton11))))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(txtCidadeF, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtRuaF, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtBairroF, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtNumeroCasaF, javax.swing.GroupLayout.PREFERRED_SIZE,
														100, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel63)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(escolarTurnoF, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(escolhaFuncaoF, javax.swing.GroupLayout.PREFERRED_SIZE,
														110, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(escolharDDPF, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtSalarioF, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 21, Short.MAX_VALUE)))));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel72).addComponent(jLabel76).addComponent(jLabel73))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtNomeF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escolharSexoF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDataNacimentoF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel74).addComponent(jLabel75))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCPFF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRGF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel14)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel38).addComponent(jLabel44).addComponent(jLabel43)
								.addComponent(jLabel45))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCidadeF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRuaF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBairroF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumeroCasaF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel15)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtNumeroF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDDF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmailF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel16)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel49).addComponent(jLabel58))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtLoginF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPassworF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton10).addComponent(jButton11))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel20)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel59).addComponent(jLabel62).addComponent(jLabel63)
								.addComponent(jLabel64))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(escolarTurnoF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escolhaFuncaoF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escolharDDPF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSalarioF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jButton9.setBackground(new java.awt.Color(204, 204, 204));
		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
		jButton9.setText("Cadastra.");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jPanel11.setBackground(new java.awt.Color(204, 204, 204));

		jLabel61.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel61.setText("Cadastrar um Funcionario.");

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addComponent(jLabel61,
						javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0,
								0, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(
				jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel61));

		jPanel12.setBackground(new java.awt.Color(204, 204, 204));

		jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel25.setText("Pesquisar Funcionario.");

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addComponent(jLabel25,
						javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0,
								0, Short.MAX_VALUE)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING));

		jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		TabelaDoFuncionario.setBackground(new java.awt.Color(204, 204, 204));
		TabelaDoFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
		TabelaDoFuncionario.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Nome.", "Turno", "Função.", "CPF." }));
		TabelaDoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				TabelaDoFuncionarioMouseClicked(evt);
			}
		});
		TabelaDoFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				TabelaDoFuncionarioKeyReleased(evt);
			}
		});
		jScrollPane3.setViewportView(TabelaDoFuncionario);

		javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
		jPanel18.setLayout(jPanel18Layout);
		jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
		jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel18Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jScrollPane3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(
						jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout
										.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jPanel18,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jButton5)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jButton6))
														.addComponent(jButton9)
														.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel37)))
										.addContainerGap(2805, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel37)
						.addGap(1, 1, 1)
						.addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton6).addComponent(jButton5,
										javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton9)
						.addContainerGap(956, Short.MAX_VALUE)));

		jPanel1.add(jPanel4, "TelaCadastroFuncionario");

		jPanel13.setBackground(new java.awt.Color(0, 153, 153));
		jPanel13.setMaximumSize(new java.awt.Dimension(800, 700));
		jPanel13.setMinimumSize(new java.awt.Dimension(800, 700));
		jPanel13.setRequestFocusEnabled(false);

		jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel33.setText("Painel do Cliente.");

		botaoDeDeletar.setBackground(new java.awt.Color(204, 204, 204));
		botaoDeDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
		botaoDeDeletar.setText("Deletar.");
		botaoDeDeletar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoDeDeletarActionPerformed(evt);
			}
		});

		botaoDeAtualizar.setBackground(new java.awt.Color(204, 204, 204));
		botaoDeAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
		botaoDeAtualizar.setText("Atualizar.");
		botaoDeAtualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoDeAtualizarActionPerformed(evt);
			}
		});

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));
		jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
		jPanel5.setForeground(new java.awt.Color(153, 153, 153));
		jPanel5.setMaximumSize(new java.awt.Dimension(600, 600));
		jPanel5.setPreferredSize(new java.awt.Dimension(600, 600));

		jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel66.setText("Nome do Cliente.");

		txtNomeC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeCActionPerformed(evt);
			}
		});

		jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel67.setText("Data de nacimento.");

		jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel68.setText("CPF.");

		try {
			txtCPFC.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel69.setText("RG.");

		jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel70.setText("Sexo.");

		escolharSexoC.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Masculino.", "Feminino." }));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel4.setText("Dados Pessoais.");

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel10.setText("Endereço.");

		jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel27.setText("Rua.");

		txtRuaC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtRuaCActionPerformed(evt);
			}
		});

		jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel29.setText("Bairro.");

		txtBairroC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtBairroCActionPerformed(evt);
			}
		});

		jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel30.setText("Cidade.");

		txtCidadeC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCidadeCActionPerformed(evt);
			}
		});

		jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel28.setText("Numero.");

		txtNumeroCasaC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNumeroCasaCActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel11.setText("Contato.");

		jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel31.setText("Numero.");

		txtNumeroC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNumeroCActionPerformed(evt);
			}
		});

		jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel32.setText("DD.");

		txtDDC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDDCActionPerformed(evt);
			}
		});

		jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel35.setText("Email.");

		txtEmailC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEmailCActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel12.setText("Login e Password.");

		jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel34.setText("Login.");

		jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel36.setText("Password.");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
		jButton1.setText("Verificar.");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
		jButton2.setText("Verificar.");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel13.setText("Dados Academia.");

		jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel39.setText("Turno.");

		escolarTurnoC.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Manham.", "Tarde.", "Noite." }));

		jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel41.setText("Status.");

		escolharAtividadeC
				.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Ativo.", "Nao Ativo." }));

		jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel40.setText("Dia de Pagamento.");

		escolharDDPC.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha.", "Dia 10.", "Dia 20.", "Dia 30." }));

		jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel71.setText("Data de inicio.");

		jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel42.setText("Responsavel.");

		txtResponsavelC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtResponsavelCActionPerformed(evt);
			}
		});

		try {
			txtDataNacimentoC.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		try {
			txtDataDeInicioC.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		try {
			txtRGC.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		txtLoginC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtLoginCActionPerformed(evt);
			}
		});

		txtPassworC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPassworCActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
										.addGroup(jPanel5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE,
																88, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel40))
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addComponent(escolarTurnoC,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(escolharAtividadeC,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(escolharDDPC,
																javax.swing.GroupLayout.PREFERRED_SIZE, 129,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addComponent(txtDataDeInicioC,
																javax.swing.GroupLayout.PREFERRED_SIZE, 122,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(txtResponsavelC,
																javax.swing.GroupLayout.PREFERRED_SIZE, 100,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE,
																122, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE,
																100, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(180, 180, 180))
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(txtNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtDDC, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)
												.addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(txtCidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtRuaC, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtBairroC, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtNumeroCasaC, javax.swing.GroupLayout.PREFERRED_SIZE,
														100, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(8, 8, 8)
												.addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel28,
														javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														jPanel5Layout.createSequentialGroup().addComponent(jLabel66)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabel67))
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE,
																118, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(txtDataNacimentoC)))
												.addGap(17, 17, 17)
												.addGroup(jPanel5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(escolharSexoC,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE,
																87, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addGroup(jPanel5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE,
																59, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(txtCPFC, javax.swing.GroupLayout.PREFERRED_SIZE,
																151, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE,
																59, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(txtRGC, javax.swing.GroupLayout.PREFERRED_SIZE,
																151, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addComponent(jLabel10).addComponent(jLabel11).addComponent(jLabel12)
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(100, 100, 100).addComponent(jLabel36,
														javax.swing.GroupLayout.PREFERRED_SIZE, 163,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(txtLoginC, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtPassworC, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton2))
										.addComponent(jLabel13).addComponent(jLabel4))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel66).addComponent(jLabel67).addComponent(jLabel70))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(escolharSexoC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDataNacimentoC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel68).addComponent(jLabel69))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtRGC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCPFC, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10)
						.addGap(13, 13, 13)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel30).addComponent(jLabel27).addComponent(jLabel29)
								.addComponent(jLabel28))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCidadeC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRuaC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBairroC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumeroCasaC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel31).addComponent(jLabel32).addComponent(jLabel35))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDDC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel34).addComponent(jLabel36))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtLoginC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1)
								.addComponent(txtPassworC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel5Layout.createSequentialGroup().addComponent(jLabel13)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel41).addComponent(jLabel40)
														.addComponent(jLabel71).addComponent(jLabel42)))
								.addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(escolharAtividadeC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escolharDDPC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDataDeInicioC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtResponsavelC, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(escolarTurnoC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(120, 120, 120)));

		jButton3.setBackground(new java.awt.Color(204, 204, 204));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
		jButton3.setText("Cadastro.");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jPanel9.setBackground(new java.awt.Color(204, 204, 204));

		jLabel60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel60.setText("Cadastrar um Cliente.");

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jLabel60).addGap(0, 0, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING));

		jPanel10.setBackground(new java.awt.Color(204, 204, 204));

		jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel24.setText("Pesquisar Cliente.");

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addComponent(jLabel24,
						javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0,
								0, Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(
				jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel24));

		jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		TabelaDoCliente.setBackground(new java.awt.Color(0, 0, 0));
		TabelaDoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		TabelaDoCliente.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Nome.", "Turno.", "Status.", "CPF." }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		TabelaDoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				TabelaDoClienteMouseClicked(evt);
			}
		});
		TabelaDoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				TabelaDoClienteKeyReleased(evt);
			}
		});
		jScrollPane2.setViewportView(TabelaDoCliente);

		javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE));
		jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton3).addComponent(jLabel33)
								.addGroup(jPanel13Layout.createSequentialGroup().addComponent(botaoDeDeletar)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(botaoDeAtualizar))
								.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addContainerGap(2809, Short.MAX_VALUE)));
		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel33)
						.addGap(2, 2, 2)
						.addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(botaoDeAtualizar).addComponent(botaoDeDeletar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 501,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3)
						.addContainerGap(949, Short.MAX_VALUE)));

		jPanel1.add(jPanel13, "TelaCadastroCliente");

		jScrollPane1.setViewportView(jPanel1);

		jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

		jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrench_orange.png"))); // NOI18N
		jMenu1.setText("Academia.");

		jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
		jMenuItem5.setText("Sobre.");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem5);

		jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
		jMenuItem4.setText("Sair.");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);

		jMenuBar1.add(jMenu1);

		jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_add.png"))); // NOI18N
		jMenu2.setText("Cadastro.");

		jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
		jMenuItem1.setText("Cliente.");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem1);

		jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
		jMenuItem2.setText("Funcionario.");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem2);

		jMenuBar1.add(jMenu2);

		jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
		jMenu3.setText("Retorno.");

		jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
		jMenuItem3.setText("Menu.");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem3);

		jMenuBar1.add(jMenu3);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		CardLayout cl = (CardLayout) jPanel1.getLayout();
		cl.show(jPanel1, "TelaCadastroCliente");
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
		CardLayout cl = (CardLayout) jPanel1.getLayout();
		cl.show(jPanel1, "TelaMenu");
	}// GEN-LAST:event_jMenuItem3ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
		if (TabelaAtividadeC.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			String cpf = TabelaAtividadeC.getValueAt(TabelaAtividadeC.getSelectedRow(), 2).toString();
			boolean verdade = treinador.removerCliente(cpf);
			if (verdade == true) {
				for (int i = 0; i <= this.listaC.size(); i++) {
					if (TabelaDoCliente.getValueAt(i, 3).toString().equals(cpf)) {
						DefaultTableModel T = (DefaultTableModel) TabelaDoCliente.getModel();
						T.removeRow(i);
						DefaultTableModel t1 = (DefaultTableModel) TabelaAtividadeC.getModel();
						t1.removeRow(TabelaAtividadeC.getSelectedRow());
					}

				}

			}
		}

	}// GEN-LAST:event_jToggleButton1ActionPerformed

	private void txtNomeFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeFActionPerformed

	private void txtCidadeFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCidadeFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCidadeFActionPerformed

	private void txtRuaFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtRuaFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtRuaFActionPerformed

	private void txtBairroFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBairroFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtBairroFActionPerformed

	private void txtNumeroCasaFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNumeroCasaFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNumeroCasaFActionPerformed

	private void txtNumeroFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNumeroFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNumeroFActionPerformed

	private void txtDDFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDDFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDDFActionPerformed

	private void txtEmailFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEmailFActionPerformed

	private void txtLoginFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtLoginFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtLoginFActionPerformed

	private void txtPassworFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPassworFActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtPassworFActionPerformed

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed

		if (txtNomeF.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o nome !!");

		} else if (txtCPFF.getText().equals("  .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite o CPF !!");

		} else if (txtRGF.getText().equals("  .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite o RG !!!");
		} else if (txtDataNacimentoF.getText().equals("   .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite a data de nacimento !!!");

		} else if (txtLoginF.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o login !!!");

		} else if (txtPassworF.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o passowor !!!");

		} else if (txtSalarioF.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o salario !!!");

		} else if (escolhaFuncaoF.getSelectedItem().equals("Escolha")) {
			JOptionPane.showMessageDialog(null, "Digite a Função !!!");

		} else {
			String[] d1 = txtDataNacimentoF.getText().split("/");
			Data nacimento = new Data(d1[0], d1[1], d1[2]);
			Telefone tel = new Telefone(txtNumeroF.getText(), txtDDF.getText());
			Endereco end = new Endereco(txtRuaF.getText(), txtCidadeF.getText(), txtBairroF.getText(),
					txtNumeroCasaF.getText());
			Contato cont = new Contato(tel, end, txtEmailF.getText());
			Acesso aces = new Acesso(txtLoginF.getText(), txtPassworF.getText());
			Treinador t = new Treinador(txtNomeF.getText(), txtCPFF.getText(), txtRGF.getText(),
					escolharSexoF.getSelectedItem() + "", cont, nacimento, Double.parseDouble(txtSalarioF.getText()),
					escolarTurnoF.getSelectedItem() + "", escolhaFuncaoF.getSelectedItem() + "", aces, null,
					escolharDDPF.getSelectedItem() + "");

			boolean verdade = gerente.cadastraFuncionario(t);
			if (treinador.existeLogin(txtLoginF.getText()) == true
					&& treinador.existeSenha(txtPassworF.getText()) == true) {
				JOptionPane.showMessageDialog(null, "Digite outro login e Senha !!!");
			} else {
				if (verdade == true) {
					DefaultTableModel Tabela1 = (DefaultTableModel) TabelaDoFuncionario.getModel();
					DefaultTableModel Tabela2 = (DefaultTableModel) TabelaAtividadeF.getModel();
					String turno = escolarTurnoF.getSelectedItem() + "";
					String status = escolhaFuncaoF.getSelectedItem() + "";
					String nome = txtNomeF.getText();
					String cpf = txtCPFF.getText();
					String[] dados1 = { nome, turno, status, cpf };
					String[] dados2 = { nome, status, cpf };
					Tabela1.addRow(dados1);
					Tabela2.addRow(dados2);
				}
			}
		}

	}// GEN-LAST:event_jButton9ActionPerformed

	private void TabelaDoFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TabelaDoFuncionarioMouseClicked
		if (TabelaDoFuncionario.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			txtNomeF.setText(TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 0).toString());
			escolarTurnoF.setSelectedItem(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 1).toString());
			escolhaFuncaoF.setSelectedItem(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			txtCPFF.setText(TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());

			Treinador t = gerente.pesquisarFuncionario(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			txtNomeF.setText(t.getNome());
			txtDataNacimentoF.setText(
					t.getNacimento().getDia() + "/" + t.getNacimento().getMes() + "/" + t.getNacimento().getAno());
			txtCPFF.setText(t.getCpf());
			txtRGF.setText(t.getRg());
			escolharSexoF.setSelectedItem(t.getSexo());
			txtCidadeF.setText(t.getContato().getEndereco().getCidade());
			txtRuaF.setText(t.getContato().getEndereco().getRua());
			txtBairroF.setText(t.getContato().getEndereco().getBairro());
			txtNumeroCasaF.setText(t.getContato().getEndereco().getNumeroDaCasa());
			txtNumeroF.setText(t.getContato().getTelefone().getNumero());
			txtDDF.setText(t.getContato().getTelefone().getDd());
			txtEmailF.setText(t.getContato().getEmail());
			txtLoginF.setText(t.getAcesso().getLogin());
			txtPassworF.setText(t.getAcesso().getSenha());
			escolarTurnoF.setSelectedItem(t.getTurno());
			escolhaFuncaoF.setSelectedItem(t.getFuncao());
			escolharDDPF.setSelectedItem(t.getDiaDePagamento());
			txtSalarioF.setText(t.getSalario() + "");

		}

	}// GEN-LAST:event_TabelaDoFuncionarioMouseClicked

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		CardLayout cl = (CardLayout) jPanel1.getLayout();
		cl.show(jPanel1, "TelaCadastroFuncionario");

	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void TabelaDoFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_TabelaDoFuncionarioKeyReleased
		if (TabelaDoFuncionario.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			txtNomeF.setText(TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 0).toString());
			escolarTurnoF.setSelectedItem(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 1).toString());
			escolhaFuncaoF.setSelectedItem(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			txtCPFF.setText(TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());

			Treinador t = gerente.pesquisarFuncionario(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			txtNomeF.setText(t.getNome());
			txtDataNacimentoF.setText(
					t.getNacimento().getDia() + "/" + t.getNacimento().getMes() + "/" + t.getNacimento().getAno());
			txtCPFF.setText(t.getCpf());
			txtRGF.setText(t.getRg());
			escolharSexoF.setSelectedItem(t.getSexo());
			txtCidadeF.setText(t.getContato().getEndereco().getCidade());
			txtRuaF.setText(t.getContato().getEndereco().getRua());
			txtBairroF.setText(t.getContato().getEndereco().getBairro());
			txtNumeroCasaF.setText(t.getContato().getEndereco().getNumeroDaCasa());
			txtNumeroF.setText(t.getContato().getTelefone().getNumero());
			txtDDF.setText(t.getContato().getTelefone().getDd());
			txtEmailF.setText(t.getContato().getEmail());
			txtLoginF.setText(t.getAcesso().getLogin());
			txtPassworF.setText(t.getAcesso().getSenha());
			escolarTurnoF.setSelectedItem(t.getTurno());
			escolhaFuncaoF.setSelectedItem(t.getFuncao());
			escolharDDPF.setSelectedItem(t.getDiaDePagamento());
			txtSalarioF.setText(t.getSalario() + "");

		}

	}// GEN-LAST:event_TabelaDoFuncionarioKeyReleased

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed

		if (TabelaDoFuncionario.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			String cpf = txtCPFF.getText();
			boolean verdade = gerente.removerFuncionario(cpf);
			if (verdade == true) {
				for (int i = 0; i <= this.listaT.size(); i++) {
					if (TabelaAtividadeF.getValueAt(i, 2).equals(cpf)) {
						DefaultTableModel T = (DefaultTableModel) TabelaAtividadeF.getModel();
						T.removeRow(i);

					}
				}

				DefaultTableModel Tabela = (DefaultTableModel) TabelaDoFuncionario.getModel();
				Tabela.removeRow(TabelaDoFuncionario.getSelectedRow());
			}

		}

	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		if (TabelaDoFuncionario.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");

		} else {
			Treinador recuperaFuncionario = gerente.pesquisarFuncionario(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			TabelaDoFuncionario.setValueAt(txtNomeF.getText(), TabelaDoFuncionario.getSelectedRow(), 0);
			TabelaDoFuncionario.setValueAt(escolarTurnoF.getSelectedItem(), TabelaDoFuncionario.getSelectedRow(), 1);
			TabelaDoFuncionario.setValueAt(escolhaFuncaoF.getSelectedItem(), TabelaDoFuncionario.getSelectedRow(), 2);
			TabelaDoFuncionario.setValueAt(txtCPFF.getText(), TabelaDoFuncionario.getSelectedRow(), 3);

			TabelaAtividadeF.setValueAt(txtNomeF.getText(), TabelaDoFuncionario.getSelectedRow(), 0);
			TabelaAtividadeF.setValueAt(escolhaFuncaoF.getSelectedItem(), TabelaDoFuncionario.getSelectedRow(), 1);
			TabelaAtividadeF.setValueAt(txtCPFF.getText(), TabelaDoFuncionario.getSelectedRow(), 2);

			boolean removerFuncionario = (boolean) gerente.removerFuncionario(
					TabelaDoFuncionario.getValueAt(TabelaDoFuncionario.getSelectedRow(), 3).toString());
			if (removerFuncionario = true) {
				String[] d1 = txtDataNacimentoF.getText().split("/");
				Data nacimento = new Data(d1[0], d1[1], d1[2]);
				Telefone tel = new Telefone(txtNumeroF.getText(), txtDDF.getText());
				Endereco end = new Endereco(txtRuaF.getText(), txtCidadeF.getText(), txtBairroF.getText(),
						txtNumeroCasaF.getText());
				Contato cont = new Contato(tel, end, txtEmailF.getText());
				Acesso aces = new Acesso(txtLoginF.getText(), txtPassworF.getText());
				Treinador t = new Treinador(txtNomeF.getText(), txtCPFF.getText(), txtRGF.getText(),
						escolharSexoF.getSelectedItem() + "", cont, nacimento,
						Double.parseDouble(txtSalarioF.getText()), escolarTurnoF.getSelectedItem() + "",
						escolhaFuncaoF.getSelectedItem() + "", aces, null, escolharDDPF.getSelectedItem() + "");
				boolean cadastrarFuncionario = gerente.cadastraFuncionario(t);
				if (cadastrarFuncionario == true) {

				}
			}

		}

	}// GEN-LAST:event_jButton6ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
		boolean a1 = gerente.existeLogin(txtLoginF.getText());
		if (a1 == true) {
			JOptionPane.showMessageDialog(null, "Login ja existe !!!");
		} else {
			JOptionPane.showMessageDialog(null, "Login pronto para cadastro !!!");

		}

	}// GEN-LAST:event_jButton10ActionPerformed

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
		boolean a1 = gerente.existeSenha(txtPassworF.getText());
		if (a1 == true) {
			JOptionPane.showMessageDialog(null, "Passowr ja existe !!!");
		} else {
			JOptionPane.showMessageDialog(null, "Passowr pronto para cadastro !!!");

		}
	}// GEN-LAST:event_jButton11ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		if (TabelaAtividadeF.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			String cpf = TabelaAtividadeF.getValueAt(TabelaAtividadeF.getSelectedRow(), 2).toString();
			boolean verdade = gerente.removerFuncionario(cpf);
			if (verdade == true) {
				for (int i = 0; i <= this.listaT.size(); i++) {
					if (TabelaDoFuncionario.getValueAt(i, 3).toString().equals(cpf)) {
						DefaultTableModel T = (DefaultTableModel) TabelaDoFuncionario.getModel();
						T.removeRow(i);
						DefaultTableModel t1 = (DefaultTableModel) TabelaAtividadeF.getModel();
						t1.removeRow(TabelaAtividadeF.getSelectedRow());
					}

				}

			}
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private void TabelaDoClienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TabelaDoClienteMouseClicked
		if (TabelaDoCliente.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			txtNomeC.setText(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 0).toString());
			escolarTurnoC.setSelectedItem(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 1).toString());
			escolharAtividadeC
					.setSelectedItem(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			txtCPFC.setText(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			Cliente c = treinador
					.pesquisaClienet(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			txtRGC.setText(c.getRg());
			txtDataNacimentoC.setText(
					c.getNacimento().getDia() + "/" + c.getNacimento().getMes() + "/" + c.getNacimento().getAno());
			escolharSexoC.setSelectedItem(c.getSexo());
			txtCidadeC.setText(c.getContato().getEndereco().getCidade());
			txtBairroC.setText(c.getContato().getEndereco().getBairro());
			txtRuaC.setText(c.getContato().getEndereco().getRua());
			txtNumeroCasaC.setText(c.getContato().getEndereco().getNumeroDaCasa());
			txtNumeroC.setText(c.getContato().getTelefone().getNumero());
			txtDDC.setText(c.getContato().getTelefone().getDd());
			txtEmailC.setText(c.getContato().getEmail());
			txtLoginC.setText(c.getAcesso().getLogin());
			txtPassworC.setText(c.getAcesso().getSenha());
			escolharDDPC.setSelectedItem(c.getDiaDePagamento());
			txtDataDeInicioC
					.setText(c.getInicio().getDia() + "/" + c.getInicio().getMes() + "/" + c.getInicio().getAno());
			txtResponsavelC.setText(c.getProfRes());

		}
	}// GEN-LAST:event_TabelaDoClienteMouseClicked

	private void TabelaDoClienteKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_TabelaDoClienteKeyReleased
		if (TabelaDoCliente.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			txtNomeC.setText(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 0).toString());
			escolarTurnoC.setSelectedItem(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 1).toString());
			escolharAtividadeC
					.setSelectedItem(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			txtCPFC.setText(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());

			Cliente c = treinador
					.pesquisaClienet(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			txtRGC.setText(c.getRg());
			txtDataNacimentoC.setText(
					c.getNacimento().getDia() + "/" + c.getNacimento().getMes() + "/" + c.getNacimento().getAno());
			escolharSexoC.setSelectedItem(c.getSexo());
			txtCidadeC.setText(c.getContato().getEndereco().getCidade());
			txtBairroC.setText(c.getContato().getEndereco().getBairro());
			txtRuaC.setText(c.getContato().getEndereco().getRua());
			txtNumeroCasaC.setText(c.getContato().getEndereco().getNumeroDaCasa());
			txtNumeroC.setText(c.getContato().getTelefone().getNumero());
			txtDDC.setText(c.getContato().getTelefone().getDd());
			txtEmailC.setText(c.getContato().getEmail());
			txtLoginC.setText(c.getAcesso().getLogin());
			txtPassworC.setText(c.getAcesso().getSenha());
			escolharDDPC.setSelectedItem(c.getDiaDePagamento());
			txtDataDeInicioC
					.setText(c.getInicio().getDia() + "/" + c.getInicio().getMes() + "/" + c.getInicio().getAno());
			txtResponsavelC.setText(c.getProfRes());

		}
	}// GEN-LAST:event_TabelaDoClienteKeyReleased

	private void botaoDeDeletarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoDeDeletarActionPerformed
		if (TabelaDoCliente.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");
		} else {
			String cpf = txtCPFC.getText();
			boolean verdade = treinador.removerCliente(cpf);
			if (verdade == true) {
				for (int i = 0; i <= this.listaC.size(); i++) {
					if (TabelaAtividadeC.getValueAt(i, 2).equals(cpf)) {
						DefaultTableModel T = (DefaultTableModel) TabelaAtividadeC.getModel();
						T.removeRow(i);

					}
				}

				DefaultTableModel Tabela = (DefaultTableModel) TabelaDoCliente.getModel();
				Tabela.removeRow(TabelaDoCliente.getSelectedRow());
			}

		}
	}// GEN-LAST:event_botaoDeDeletarActionPerformed

	private void botaoDeAtualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoDeAtualizarActionPerformed
		if (TabelaDoCliente.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um elemento !!!");

		} else {
			Cliente recuperaCliente = treinador
					.pesquisaClienet(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			TabelaDoCliente.setValueAt(txtNomeC.getText(), TabelaDoCliente.getSelectedRow(), 0);
			TabelaDoCliente.setValueAt(escolarTurnoC.getSelectedItem(), TabelaDoCliente.getSelectedRow(), 1);
			TabelaDoCliente.setValueAt(escolharAtividadeC.getSelectedItem(), TabelaDoCliente.getSelectedRow(), 2);
			TabelaDoCliente.setValueAt(txtCPFC.getText(), TabelaDoCliente.getSelectedRow(), 3);

			TabelaAtividadeC.setValueAt(txtNomeC.getText(), TabelaDoCliente.getSelectedRow(), 0);
			TabelaAtividadeC.setValueAt(escolharAtividadeC.getSelectedItem(), TabelaDoCliente.getSelectedRow(), 1);
			TabelaAtividadeC.setValueAt(txtCPFC.getText(), TabelaDoCliente.getSelectedRow(), 2);

			boolean removerCliente = (boolean) treinador
					.removerCliente(TabelaDoCliente.getValueAt(TabelaDoCliente.getSelectedRow(), 3).toString());
			if (removerCliente = true) {
				String[] d = txtDataNacimentoC.getText().split("/");
				String[] dd = txtDataDeInicioC.getText().split("/");
				Data dataI = new Data(dd[0], dd[1], dd[2]);
				Data data = new Data(d[0], d[1], d[2]);
				Telefone telefone = new Telefone(txtNumeroC.getText(), txtDDC.getText());
				Endereco endereco = new Endereco(txtBairroC.getText(), txtCidadeC.getText(), txtRuaC.getText(),
						txtNumeroCasaC.getText());
				Contato contato = new Contato(telefone, endereco, txtEmailC.getText());
				Acesso acesso = new Acesso(txtLoginC.getText(), txtPassworC.getText());
				Treino t = new Treino();
				Ficha ficha = new Ficha();
				Cliente c = new Cliente(txtNomeC.getText(), txtCPFC.getText(), txtRGC.getText(),
						escolharSexoC.getSelectedItem() + "", contato, data, dataI,
						escolarTurnoC.getSelectedItem() + "", t, escolharAtividadeC.getSelectedItem() + "",
						txtResponsavelC.getText(), acesso, escolharDDPC.getSelectedItem() + "", ficha);
				boolean cadastrarCliente = treinador.cadastrarCliente(c);
				if (cadastrarCliente == true) {
				}
			}

		}
	}// GEN-LAST:event_botaoDeAtualizarActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed

		if (txtNomeC.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o nome !!!");

		} else if (txtCPFC.getText().equals("  .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite o CPF !!!");

		} else if (txtRGC.getText().equals("  .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite o RG ");
		} else if (txtDataNacimentoC.getText().equals("   .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Digite a data de nacimento !!!");

		} else if (txtLoginC.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o login !!!");

		} else if (txtPassworC.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o passowor !!!");

		} else {

			String[] d = txtDataNacimentoC.getText().split("/");
			String[] dd = txtDataDeInicioC.getText().split("/");
			Data dataI = new Data(dd[0], dd[1], dd[2]);
			Data data = new Data(d[0], d[1], d[2]);
			Telefone telefone = new Telefone(txtNumeroC.getText(), txtDDC.getText());
			Endereco endereco = new Endereco(txtBairroC.getText(), txtCidadeC.getText(), txtRuaC.getText(),
					txtNumeroCasaC.getText());
			Contato contato = new Contato(telefone, endereco, txtEmailC.getText());
			Acesso acesso = new Acesso(txtLoginC.getText(), txtPassworC.getText());
			Treino t = new Treino();
			Ficha ficha = new Ficha();
			if (treinador.existeLogin(txtLoginC.getText()) == true
					&& treinador.existeSenha(txtPassworC.getText()) == true) {
				JOptionPane.showMessageDialog(null, "Digite outro login e Senha !!!");
			}
			Cliente c = new Cliente(txtNomeC.getText(), txtCPFC.getText(), txtRGC.getText(),
					escolharSexoC.getSelectedItem() + "", contato, data, dataI, escolarTurnoC.getSelectedItem() + "", t,
					escolharAtividadeC.getSelectedItem() + "", txtResponsavelC.getText(), acesso,
					escolharDDPC.getSelectedItem() + "", ficha);
			boolean verdade = treinador.cadastrarCliente(c);

			if (verdade == true) {
				DefaultTableModel Tabela1 = (DefaultTableModel) TabelaDoCliente.getModel();
				DefaultTableModel Tabela2 = (DefaultTableModel) TabelaAtividadeC.getModel();

				String turno = escolarTurnoC.getSelectedItem() + "";
				String status = escolharAtividadeC.getSelectedItem() + "";
				String nome = txtNomeC.getText();
				String cpf = txtCPFC.getText();

				String[] dados1 = { nome, turno, status, cpf };
				String[] dados2 = { nome, status, cpf };

				Tabela1.addRow(dados1);
				Tabela2.addRow(dados2);

			}
		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void txtPassworCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPassworCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtPassworCActionPerformed

	private void txtLoginCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtLoginCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtLoginCActionPerformed

	private void txtResponsavelCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtResponsavelCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtResponsavelCActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		boolean verdade2 = treinador.existeSenha(txtPassworC.getText());
		if (verdade2 == true) {
			JOptionPane.showMessageDialog(null, "Passwor ja cadastrado !!!");

		} else {
			JOptionPane.showMessageDialog(null, "Passwor pronto para cadastro !!!");
		}
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		boolean verdade1 = treinador.existeLogin(txtLoginC.getText());
		if (verdade1 == true) {
			JOptionPane.showMessageDialog(null, "Login ja cadastrado !!!");

		} else {
			JOptionPane.showMessageDialog(null, "Login pronto para cadastro !!!");
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void txtEmailCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEmailCActionPerformed

	private void txtDDCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDDCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDDCActionPerformed

	private void txtNumeroCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNumeroCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNumeroCActionPerformed

	private void txtNumeroCasaCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNumeroCasaCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNumeroCasaCActionPerformed

	private void txtCidadeCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCidadeCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCidadeCActionPerformed

	private void txtBairroCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBairroCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtBairroCActionPerformed

	private void txtRuaCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtRuaCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtRuaCActionPerformed

	private void txtNomeCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeCActionPerformed

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
		JOptionPane.showMessageDialog(null,
				"Projeto de POO.\n\n Alunos:\n1: Marcelo Souza.\n2: Roberto Junior.\n3: Ivonildo Neto.\n4: Jose Neto Falcão.\n\nOrientador:\nProfessor Eduardo Falcão. ");
	}// GEN-LAST:event_jMenuItem5ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaDoGerente.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaDoGerente.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaDoGerente.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaDoGerente.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				TelaDoGerente dialog = new TelaDoGerente(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTable TabelaAtividadeC;
	private javax.swing.JTable TabelaAtividadeF;
	private javax.swing.JTable TabelaDoCliente;
	private javax.swing.JTable TabelaDoFuncionario;
	private javax.swing.JLabel bemVindo;
	private javax.swing.JButton botaoDeAtualizar;
	private javax.swing.JButton botaoDeDeletar;
	private javax.swing.JComboBox<String> escolarTurnoC;
	private javax.swing.JComboBox<String> escolarTurnoF;
	private javax.swing.JComboBox<String> escolhaFuncaoF;
	private javax.swing.JComboBox<String> escolharAtividadeC;
	private javax.swing.JComboBox<String> escolharDDPC;
	private javax.swing.JComboBox<String> escolharDDPF;
	private javax.swing.JComboBox<String> escolharSexoC;
	private javax.swing.JComboBox<String> escolharSexoF;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel63;
	private javax.swing.JLabel jLabel64;
	private javax.swing.JLabel jLabel66;
	private javax.swing.JLabel jLabel67;
	private javax.swing.JLabel jLabel68;
	private javax.swing.JLabel jLabel69;
	private javax.swing.JLabel jLabel70;
	private javax.swing.JLabel jLabel71;
	private javax.swing.JLabel jLabel72;
	private javax.swing.JLabel jLabel73;
	private javax.swing.JLabel jLabel74;
	private javax.swing.JLabel jLabel75;
	private javax.swing.JLabel jLabel76;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel16;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JToggleButton jToggleButton1;
	private javax.swing.JTextField txtBairroC;
	private javax.swing.JTextField txtBairroF;
	private javax.swing.JFormattedTextField txtCPFC;
	private javax.swing.JFormattedTextField txtCPFF;
	private javax.swing.JTextField txtCidadeC;
	private javax.swing.JTextField txtCidadeF;
	private javax.swing.JTextField txtDDC;
	private javax.swing.JTextField txtDDF;
	private javax.swing.JFormattedTextField txtDataDeInicioC;
	private javax.swing.JFormattedTextField txtDataNacimentoC;
	private javax.swing.JFormattedTextField txtDataNacimentoF;
	private javax.swing.JTextField txtEmailC;
	private javax.swing.JTextField txtEmailF;
	private javax.swing.JTextField txtLoginC;
	private javax.swing.JTextField txtLoginF;
	private javax.swing.JTextField txtNomeC;
	private javax.swing.JTextField txtNomeF;
	private javax.swing.JTextField txtNumeroC;
	private javax.swing.JTextField txtNumeroCasaC;
	private javax.swing.JTextField txtNumeroCasaF;
	private javax.swing.JTextField txtNumeroF;
	private javax.swing.JTextField txtPassworC;
	private javax.swing.JTextField txtPassworF;
	private javax.swing.JFormattedTextField txtRGC;
	private javax.swing.JFormattedTextField txtRGF;
	private javax.swing.JTextField txtResponsavelC;
	private javax.swing.JTextField txtRuaC;
	private javax.swing.JTextField txtRuaF;
	private javax.swing.JTextField txtSalarioF;
	// End of variables declaration//GEN-END:variables
}
