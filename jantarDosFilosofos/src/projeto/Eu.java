package projeto;

import java.util.concurrent.Semaphore;

public class Eu implements Runnable {

	private final int N = 5;
	private final int DETENTOR1 = (int) (Math.random() * (N - 1));
	private final int DETENTOR2 = (((DETENTOR1 + 1) % N) + 1) % N;
	private final int SEMELHANTE = (DETENTOR1 + 1) % N;
	private final int ESQUERDA_D1 = (DETENTOR1 + N - 1) % N;
	private final int DIREITA_D2 = (DETENTOR2 + 1) % N;
	private final int FAMINTO = 1;
	private Semaphore[] s = new Semaphore[N];
	private int[] estado = new int[] { 0, 0, 0, 0, 0 };
	private int[] count = new int[] { 0, 0, 0, 0, 0 };
	private long[] semComer = new long[N];
	private long[] espera = new long[N];
	private TelaJantar tela;

	public Eu(TelaJantar tela) {
		this.tela = tela;
		iniciar();
	}

	private void iniciar() {
		for (int i = 0; i < N; i++)
			s[i] = new Semaphore(0);
		mostrarGarfos(DETENTOR1);
		mostrarGarfos(DETENTOR2);
	}

	private void mostrarGarfos(int i) {
		switch (i) {
		case 0:
			tela.f01.setVisible(true);
			tela.f02.setVisible(true);
			break;
		case 1:
			tela.f11.setVisible(true);
			tela.f12.setVisible(true);
			break;
		case 2:
			tela.f21.setVisible(true);
			tela.f22.setVisible(true);
			break;
		case 3:
			tela.f31.setVisible(true);
			tela.f32.setVisible(true);
			break;
		case 4:
			tela.f41.setVisible(true);
			tela.f42.setVisible(true);
			break;
		}
	}

	private void bloquear(int id) {
		try {
			s[id].acquire();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void pensar() {
		try {
			Thread.sleep((int) ((Math.random() * 401) + 100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void comer() {
		try {
			Thread.sleep((int) ((Math.random() * 401) + 100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void tempoSemComer(int i) {
		int atual = (int) (System.currentTimeMillis() - semComer[i]);
		tela.tabela.setValueAt(atual, 1, i + 1);
	}

	private void calcularMedia(int i, int tempo) {
		int valorAtual = (int) tela.tabela.getValueAt(2, i + 1);
		int media = ((valorAtual * count[i]) + tempo) / (count[i] + 1);
		tela.tabela.setValueAt(media, 2, i + 1);
	}

	private void maiorEspera(int i, int tempo) {
		int valorAtual = (int) tela.tabela.getValueAt(3, i + 1);
		if (tempo > valorAtual)
			tela.tabela.setValueAt(tempo, 3, i + 1);
	}

	private void tentarComer(int id) {
		if ((id == DETENTOR1) || (id == DETENTOR2)) {
			tela.tabela.setValueAt(++count[id], 0, id + 1);
			tempoSemComer(id);
			int tempo = (int) (System.currentTimeMillis() - espera[id]);
			calcularMedia(id, tempo);
			maiorEspera(id, tempo);
			comer();
			semComer[id] = System.currentTimeMillis();
			tentaAlimentar(id);
		} else {
			estado[id] = FAMINTO;
			bloquear(id);
			tempoSemComer(id);
			int tempo = (int) (System.currentTimeMillis() - espera[id]);
			calcularMedia(id, tempo);
			maiorEspera(id, tempo);
			comer();
			acordarDetentor(id);
			tela.tabela.setValueAt(++count[id], 0, id + 1);
			semComer[id] = System.currentTimeMillis();
		}
	}

	private void acordarDetentor(int id) {
		int paridade = count[SEMELHANTE] % 2;
		if (id == SEMELHANTE && paridade == 0) {
			s[DETENTOR1].release();
		}

		if (id == SEMELHANTE && paridade == 1) {
			s[DETENTOR2].release();
		}

		if (id == DIREITA_D2) {
			s[DETENTOR2].release();
		}

		if (id == ESQUERDA_D1) {
			s[DETENTOR1].release();
		}
	}

	private void tentaAlimentar(int id) {
		int paridade = count[SEMELHANTE] % 2;
		if (id == DETENTOR1) {
			aviaozinho(ESQUERDA_D1, DETENTOR1);
			if (paridade == 0)
				aviaozinho(SEMELHANTE, DETENTOR1);
		}

		else {
			aviaozinho(DIREITA_D2, DETENTOR2);
			if (paridade == 1)
				aviaozinho(SEMELHANTE, DETENTOR2);
		}
	}

	private void aviaozinho(int id, int detentor) {
		if (estado[id] == FAMINTO) {
			s[id].release();
			visibilidadeAviao(id, detentor, true);
			bloquear(detentor);
			visibilidadeAviao(id, detentor, false);
		}
	}

	private void visibilidadeAviao(int id, int detentor, boolean b) {
		switch (detentor) {
		case 0:
			switch (id) {
			case 1:
				tela.af0f1.setVisible(b);
				break;
			case 4:
				tela.af0f4.setVisible(b);
				break;
			}
			break;
		case 1:
			switch (id) {
			case 2:
				tela.af1f2.setVisible(b);
				break;
			case 0:
				tela.af1f0.setVisible(b);
				break;
			}
			break;
		case 2:
			switch (id) {
			case 1:
				tela.af2f1.setVisible(b);
				break;
			case 3:
				tela.af2f3.setVisible(b);
				break;
			}
			break;
		case 3:
			switch (id) {
			case 2:
				tela.af3f2.setVisible(b);
				break;
			case 4:
				tela.af3f4.setVisible(b);
				break;
			}
			break;
		case 4:
			switch (id) {
			case 0:
				tela.af4f0.setVisible(b);
				break;
			case 3:
				tela.af4f3.setVisible(b);
				break;
			}
			break;
		}
	}

	public void run() {
		int id = Integer.parseInt(Thread.currentThread().getName());
		semComer[id] = System.currentTimeMillis();
		while (true) {
			pensar();
			espera[id] = System.currentTimeMillis();
			tentarComer(id);
		}
	}
}
