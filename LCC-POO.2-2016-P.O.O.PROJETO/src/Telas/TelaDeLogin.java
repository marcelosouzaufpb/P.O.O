/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Programa.Cliente;
import Programa.Gerente;
import Programa.Treinador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */

public class TelaDeLogin extends javax.swing.JFrame {

	public static String nome;
	public static String senha;

	Cliente cliente = new Cliente();
	Treinador treinador = new Treinador();
	Gerente gerente = new Gerente();

	List<Cliente> listaC = treinador.getListaDeClientes();
	List<Treinador> listaT = gerente.getListaDeTreinadores();

	public TelaDeLogin() {
		initComponents();

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		txtNome = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		txtSenha = new javax.swing.JPasswordField();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(1000, 1000));

		jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
		jScrollPane1.setMaximumSize(new java.awt.Dimension(32767, 850));
		jScrollPane1.setMinimumSize(new java.awt.Dimension(25, 25));

		jPanel1.setBackground(new java.awt.Color(0, 153, 153));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel1.setText("Nome:");

		jLabel2.setText("Senha:");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
		jButton1.setText("Entrar.");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setMaximumSize(new java.awt.Dimension(1000, 100));
		jPanel2.setPreferredSize(new java.awt.Dimension(1000, 100));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Academia.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4,
						javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0,
								503, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(27, 27, 27)));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel3.setText("Tela De Login.");

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
		jButton2.setText("Sair.");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		txtSenha.setText("jPasswordField1");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel1)
						.addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
						.addComponent(jLabel2).addComponent(jLabel3)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButton2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1))
						.addComponent(txtSenha)).addGap(42, 42, 42).addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(jLabel3)
						.addGap(33, 33, 33).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2).addComponent(jButton1))
						.addContainerGap(476, Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE));

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

		jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
		jMenuItem1.setText("Sair.");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Digite o login !!!");
		} else {

			if (txtNome.getText().equals("a")) {
				nome = txtNome.getText();
				TelaDoGerente tg = new TelaDoGerente(this, true);
				tg.setVisible(true);

			} else if (txtNome.getText().equals("b")) {
				senha = txtSenha.getText();
				nome = txtNome.getText();
				TelaDoTreinador tr = new TelaDoTreinador(this, true);
				tr.setVisible(true);

			} else if (txtNome.getText().equals("c")) {
				nome = txtNome.getText();
				senha = txtSenha.getText();
				TelaDoCliente tc = new TelaDoCliente(this, true);
				tc.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(null, "Noa a cliente cadastrado !!!");
			}
			/*
			 * for (Cliente cli : this.listaC) { if
			 * (cli.getAcesso().getLogin().equals(txtNome.getText()) &&
			 * cli.getAcesso().getSenha().equals(txtSenha.getText())) { nome =
			 * txtNome.getText(); senha = txtSenha.getText(); TelaDoCliente tc =
			 * new TelaDoCliente(this, true); tc.setVisible(true); } } for
			 * (Treinador tre : this.listaT) { if
			 * (tre.getAcesso().getLogin().equals(txtNome.getText()) &&
			 * tre.getAcesso().getSenha().equals(txtSenha.getText())) { senha =
			 * txtSenha.getText(); nome = txtNome.getText(); TelaDoTreinador tr
			 * = new TelaDoTreinador(this, true); tr.setVisible(true); } } }
			 */

		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jButton2ActionPerformed

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
			java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaDeLogin().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtNome;
	private javax.swing.JPasswordField txtSenha;
	// End of variables declaration//GEN-END:variables
}
