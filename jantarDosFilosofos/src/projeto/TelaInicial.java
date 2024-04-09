package projeto;

public class TelaInicial extends javax.swing.JFrame {

	public TelaInicial() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		botao_dijkstra = new javax.swing.JButton();
		botao_eu = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(204, 0, 0));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 0));
		jLabel1.setText("Jantar dos filósofos");

		botao_dijkstra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		botao_dijkstra.setText("Dijkstra");
		botao_dijkstra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_dijkstraActionPerformed(evt);
			}
		});

		botao_eu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		botao_eu.setText("Eu");
		botao_eu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_euActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(73, 73, 73)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jLabel1)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(botao_dijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(botao_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(89, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel1)
						.addGap(82, 82, 82)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(botao_dijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(botao_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(138, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	TelaJantar jantar = new TelaJantar();

	private void iniciaComponentesDijkstra() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				jantar.tabela.setValueAt(0, i, j);
			}
		}
		jantar.f01.setVisible(false);
		jantar.f02.setVisible(false);
		jantar.f11.setVisible(false);
		jantar.f12.setVisible(false);
		jantar.f21.setVisible(false);
		jantar.f22.setVisible(false);
		jantar.f31.setVisible(false);
		jantar.f32.setVisible(false);
		jantar.f41.setVisible(false);
		jantar.f42.setVisible(false);
		jantar.af0f1.setVisible(false);
		jantar.af0f4.setVisible(false);
		jantar.af1f0.setVisible(false);
		jantar.af1f2.setVisible(false);
		jantar.af2f1.setVisible(false);
		jantar.af2f3.setVisible(false);
		jantar.af3f2.setVisible(false);
		jantar.af3f4.setVisible(false);
		jantar.af4f0.setVisible(false);
		jantar.af4f3.setVisible(false);
		jantar.setVisible(true);
	}

	private void iniciaComponentesEu() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				jantar.tabela.setValueAt(0, i, j);
			}
		}
		jantar.f01.setVisible(false);
		jantar.f02.setVisible(false);
		jantar.f11.setVisible(false);
		jantar.f12.setVisible(false);
		jantar.f21.setVisible(false);
		jantar.f22.setVisible(false);
		jantar.f31.setVisible(false);
		jantar.f32.setVisible(false);
		jantar.f41.setVisible(false);
		jantar.f42.setVisible(false);
		jantar.f0f1.setVisible(false);
		jantar.f0f4.setVisible(false);
		jantar.f1f2.setVisible(false);
		jantar.f2f3.setVisible(false);
		jantar.f3f4.setVisible(false);
		jantar.af0f1.setVisible(false);
		jantar.af0f4.setVisible(false);
		jantar.af1f0.setVisible(false);
		jantar.af1f2.setVisible(false);
		jantar.af2f1.setVisible(false);
		jantar.af2f3.setVisible(false);
		jantar.af3f2.setVisible(false);
		jantar.af3f4.setVisible(false);
		jantar.af4f0.setVisible(false);
		jantar.af4f3.setVisible(false);
		jantar.setVisible(true);
	}

	private void botao_dijkstraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botao_dijkstraActionPerformed
		iniciaComponentesDijkstra();
		Dijkstra runnable = new Dijkstra(jantar);
		Thread f0 = new Thread(runnable, "0");
		Thread f1 = new Thread(runnable, "1");
		Thread f2 = new Thread(runnable, "2");
		Thread f3 = new Thread(runnable, "3");
		Thread f4 = new Thread(runnable, "4");

		f0.start();
		f1.start();
		f2.start();
		f3.start();
		f4.start();

		this.dispose();
	}// GEN-LAST:event_botao_dijkstraActionPerformed

	private void botao_euActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botao_euActionPerformed
		iniciaComponentesEu();
		Eu runnable = new Eu(jantar);
		Thread f0 = new Thread(runnable, "0");
		Thread f1 = new Thread(runnable, "1");
		Thread f2 = new Thread(runnable, "2");
		Thread f3 = new Thread(runnable, "3");
		Thread f4 = new Thread(runnable, "4");

		f0.start();
		f1.start();
		f2.start();
		f3.start();
		f4.start();

		this.dispose();
	}// GEN-LAST:event_botao_euActionPerformed

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaInicial().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton botao_dijkstra;
	private javax.swing.JButton botao_eu;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
