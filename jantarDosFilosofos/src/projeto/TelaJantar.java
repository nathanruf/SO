/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto;

/**
 *
 * @author natha
 */
public class TelaJantar extends javax.swing.JFrame {

	/**
	 * Creates new form TelaJantar
	 */
	public TelaJantar() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabela = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		f2 = new javax.swing.JLabel();
		f4 = new javax.swing.JLabel();
		f1 = new javax.swing.JLabel();
		f3 = new javax.swing.JLabel();
		f0f4 = new javax.swing.JLabel();
		f3f4 = new javax.swing.JLabel();
		f0f1 = new javax.swing.JLabel();
		f2f3 = new javax.swing.JLabel();
		tagf0 = new javax.swing.JLabel();
		tagf1 = new javax.swing.JLabel();
		tagf2 = new javax.swing.JLabel();
		tagf3 = new javax.swing.JLabel();
		tagf4 = new javax.swing.JLabel();
		f0 = new javax.swing.JLabel();
		f42 = new javax.swing.JLabel();
		f41 = new javax.swing.JLabel();
		f12 = new javax.swing.JLabel();
		f11 = new javax.swing.JLabel();
		f22 = new javax.swing.JLabel();
		f02 = new javax.swing.JLabel();
		f01 = new javax.swing.JLabel();
		f32 = new javax.swing.JLabel();
		f31 = new javax.swing.JLabel();
		f21 = new javax.swing.JLabel();
		f1f2 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		af4f0 = new javax.swing.JLabel();
		af0f4 = new javax.swing.JLabel();
		af3f4 = new javax.swing.JLabel();
		af4f3 = new javax.swing.JLabel();
		af3f2 = new javax.swing.JLabel();
		af2f3 = new javax.swing.JLabel();
		af2f1 = new javax.swing.JLabel();
		af1f2 = new javax.swing.JLabel();
		af1f0 = new javax.swing.JLabel();
		af0f1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(204, 0, 0));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jScrollPane1.setBorder(null);

		tabela.setBackground(new java.awt.Color(153, 153, 153));
		tabela.setForeground(new java.awt.Color(0, 0, 0));
		tabela.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
				{ "Quantas vezes comeu", new Integer(0), new Integer(0), new Integer(0), new Integer(0),
						new Integer(0) },
				{ "Não come a (ms)", new Integer(0), new Integer(0), new Integer(0), new Integer(0), new Integer(0) },
				{ "Média de espera (ms)", new Integer(0), new Integer(0), new Integer(0), new Integer(0),
						new Integer(0) },
				{ "Maior espera (ms)", new Integer(0), new Integer(0), new Integer(0), new Integer(0),
						new Integer(0) } },
				new String[] { "", "F0", "F1", "F2", "F3", "F4" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		tabela.setAlignmentX(0.0F);
		tabela.setAlignmentY(0.0F);
		tabela.setGridColor(new java.awt.Color(0, 0, 0));
		tabela.setSelectionBackground(new java.awt.Color(255, 0, 0));
		tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
		tabela.setShowGrid(true);
		jScrollPane1.setViewportView(tabela);
		if (tabela.getColumnModel().getColumnCount() > 0) {
			tabela.getColumnModel().getColumn(0).setResizable(false);
			tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
			tabela.getColumnModel().getColumn(1).setResizable(false);
			tabela.getColumnModel().getColumn(2).setResizable(false);
			tabela.getColumnModel().getColumn(3).setResizable(false);
			tabela.getColumnModel().getColumn(4).setResizable(false);
			tabela.getColumnModel().getColumn(5).setResizable(false);
		}

		jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 736, 107));

		jLabel2.setIcon(
				new javax.swing.ImageIcon("img/mesa.png")); // NOI18N
		jLabel2.setText("jLabel2");
		jLabel2.setName(""); // NOI18N
		jLabel2.setPreferredSize(new java.awt.Dimension(483, 198));
		jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 439, -1));

		f2.setIcon(new javax.swing.ImageIcon("img/F2.png")); // NOI18N
		f2.setText("jLabel1");
		jPanel1.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 121, -1));
		f2.getAccessibleContext().setAccessibleName("f2");

		f4.setIcon(new javax.swing.ImageIcon("img/F3.png")); // NOI18N
		f4.setText("jLabel3");
		jPanel1.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 110, -1));

		f1.setIcon(new javax.swing.ImageIcon("img/F1.png")); // NOI18N
		f1.setText("jLabel5");
		jPanel1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 129, -1));

		f3.setIcon(new javax.swing.ImageIcon("img/F4.png")); // NOI18N
		f3.setText("jLabel6");
		jPanel1.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 140, -1));

		f0f4.setIcon(new javax.swing.ImageIcon(
				"img/garfo_cima_direita.png")); // NOI18N
		f0f4.setText("jLabel7");
		jPanel1.add(f0f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 49, -1));

		f3f4.setIcon(new javax.swing.ImageIcon(
				"img/garfo_cima_esquerda.png")); // NOI18N
		f3f4.setText("jLabel7");
		jPanel1.add(f3f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 49, -1));

		f0f1.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo_direita.png")); // NOI18N
		f0f1.setText("jLabel7");
		jPanel1.add(f0f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 53, -1));

		f2f3.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo_esquerda.png")); // NOI18N
		f2f3.setText("jLabel11");
		jPanel1.add(f2f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 53, -1));

		tagf0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		tagf0.setForeground(new java.awt.Color(0, 0, 0));
		tagf0.setText("F0");
		jPanel1.add(tagf0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

		tagf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		tagf1.setForeground(new java.awt.Color(0, 0, 0));
		tagf1.setText("F1");
		jPanel1.add(tagf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

		tagf2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		tagf2.setForeground(new java.awt.Color(0, 0, 0));
		tagf2.setText("F2");
		jPanel1.add(tagf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 20, -1));

		tagf3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		tagf3.setForeground(new java.awt.Color(0, 0, 0));
		tagf3.setText("F3");
		jPanel1.add(tagf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

		tagf4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		tagf4.setForeground(new java.awt.Color(0, 0, 0));
		tagf4.setText("F4");
		jPanel1.add(tagf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

		f0.setIcon(new javax.swing.ImageIcon("img/F0.png")); // NOI18N
		f0.setText("jLabel10");
		jPanel1.add(f0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 299, 93, 137));

		f42.setIcon(new javax.swing.ImageIcon(
				"img/garfo_cima.png")); // NOI18N
		f42.setText("jLabel18");
		jPanel1.add(f42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 14, -1));

		f41.setIcon(new javax.swing.ImageIcon(
				"img/garfo_cima.png")); // NOI18N
		f41.setText("jLabel18");
		jPanel1.add(f41, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 14, -1));

		f12.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo.png")); // NOI18N
		f12.setText("jLabel4");
		jPanel1.add(f12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 10, -1));

		f11.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo.png")); // NOI18N
		f11.setText("jLabel4");
		jPanel1.add(f11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 10, -1));

		f22.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo.png")); // NOI18N
		f22.setText("jLabel4");
		jPanel1.add(f22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 10, -1));

		f02.setIcon(new javax.swing.ImageIcon(
				"img/garfo_direita.png")); // NOI18N
		f02.setText("jLabel25");
		jPanel1.add(f02, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 53, -1));

		f01.setIcon(new javax.swing.ImageIcon(
				"img/garfo_direita.png")); // NOI18N
		f01.setText("jLabel25");
		jPanel1.add(f01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 53, -1));

		f32.setIcon(new javax.swing.ImageIcon(
				"img/garfo_esquerda.png")); // NOI18N
		f32.setText("jLabel18");
		jPanel1.add(f32, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 50, 20));

		f31.setIcon(new javax.swing.ImageIcon(
				"img/garfo_esquerda.png")); // NOI18N
		f31.setText("jLabel18");
		jPanel1.add(f31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 50, 20));

		f21.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo.png")); // NOI18N
		f21.setText("jLabel4");
		jPanel1.add(f21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 10, -1));

		f1f2.setIcon(new javax.swing.ImageIcon(
				"img/garfo_baixo.png")); // NOI18N
		f1f2.setText("jLabel4");
		jPanel1.add(f1f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 10, -1));

		jLabel11.setIcon(
				new javax.swing.ImageIcon("img/F1.png")); // NOI18N
		jLabel11.setText("jLabel5");
		jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 129, -1));

		jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jLabel21.setForeground(new java.awt.Color(0, 0, 0));
		jLabel21.setText("F1");
		jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

		af4f0.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_esquerda.png")); // NOI18N
		af4f0.setText("jLabel1");
		jPanel1.add(af4f0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 150, -1));

		af0f4.setIcon(new javax.swing.ImageIcon(
				"img/aviao_baixo_direita.png")); // NOI18N
		af0f4.setText("jLabel1");
		jPanel1.add(af0f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 150, -1));

		af3f4.setIcon(new javax.swing.ImageIcon(
				"img/aviao_baixo_esquerda.png")); // NOI18N
		af3f4.setText("jLabel1");
		jPanel1.add(af3f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 140, -1));

		af4f3.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_direita.png")); // NOI18N
		af4f3.setText("jLabel1");
		jPanel1.add(af4f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 140, -1));

		af3f2.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_esquerda.png")); // NOI18N
		af3f2.setText("jLabel1");
		jPanel1.add(af3f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 140, -1));

		af2f3.setIcon(new javax.swing.ImageIcon(
				"img/aviao_baixo_direita.png")); // NOI18N
		af2f3.setText("jLabel1");
		jPanel1.add(af2f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 140, -1));

		af2f1.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_esquerda.png")); // NOI18N
		af2f1.setText("jLabel1");
		jPanel1.add(af2f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 140, -1));

		af1f2.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_direita.png")); // NOI18N
		af1f2.setText("jLabel1");
		jPanel1.add(af1f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 140, -1));

		af1f0.setIcon(new javax.swing.ImageIcon(
				"img/aviao_baixo_esquerda.png")); // NOI18N
		af1f0.setText("jLabel1");
		jPanel1.add(af1f0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, -1));

		af0f1.setIcon(new javax.swing.ImageIcon(
				"img/aviao_cima_direita.png")); // NOI18N
		af0f1.setText("jLabel1");
		jPanel1.add(af0f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, -1));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JLabel af0f1;
	public javax.swing.JLabel af0f4;
	public javax.swing.JLabel af1f0;
	public javax.swing.JLabel af1f2;
	public javax.swing.JLabel af2f1;
	public javax.swing.JLabel af2f3;
	public javax.swing.JLabel af3f2;
	public javax.swing.JLabel af3f4;
	public javax.swing.JLabel af4f0;
	public javax.swing.JLabel af4f3;
	private javax.swing.JLabel f0;
	public javax.swing.JLabel f01;
	public javax.swing.JLabel f02;
	public javax.swing.JLabel f0f1;
	public javax.swing.JLabel f0f4;
	private javax.swing.JLabel f1;
	public javax.swing.JLabel f11;
	public javax.swing.JLabel f12;
	public javax.swing.JLabel f1f2;
	private javax.swing.JLabel f2;
	public javax.swing.JLabel f21;
	public javax.swing.JLabel f22;
	public javax.swing.JLabel f2f3;
	private javax.swing.JLabel f3;
	public javax.swing.JLabel f31;
	public javax.swing.JLabel f32;
	public javax.swing.JLabel f3f4;
	private javax.swing.JLabel f4;
	public javax.swing.JLabel f41;
	public javax.swing.JLabel f42;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTable tabela;
	private javax.swing.JLabel tagf0;
	private javax.swing.JLabel tagf1;
	private javax.swing.JLabel tagf2;
	private javax.swing.JLabel tagf3;
	private javax.swing.JLabel tagf4;
	// End of variables declaration//GEN-END:variables
}
