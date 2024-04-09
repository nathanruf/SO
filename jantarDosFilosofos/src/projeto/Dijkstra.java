package projeto;

import java.util.concurrent.Semaphore;

public class Dijkstra implements Runnable {

	private TelaJantar tela;
	private final int N = 5;
	private long[] espera = new long[N];
	private long[] semComer = new long[N];
	private final int[] ESQUERDA = new int[N];
	private final int[] DIREITA = new int[N];
	private final int PENSANDO = 0;
	private final int FAMINTO = 1;
	private final int COMENDO = 2;
	private int[] estado = new int[N];
	private int[] count = new int[N];
	Semaphore mutex = new Semaphore(1);
	Semaphore[] s = new Semaphore[N];

	public Dijkstra(TelaJantar tela) {
		this.tela = tela;
		inicializarVariaveis();
	}

	private void inicializarVariaveis() {
		for (int i = 0; i < N; i++) {
			ESQUERDA[i] = (i + N - 1) % N;
			DIREITA[i] = (i + 1) % N;
			s[i] = new Semaphore(0);
			count[i] = 0;
		}
	}

	private void down(Semaphore s) {
		try {
			s.acquire();
		} catch (InterruptedException e) {
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

	private void visibilidadeGarfos(int i, boolean b) {
		switch (i) {
		case 0:
			tela.f0f1.setVisible(!b);
			tela.f0f4.setVisible(!b);
			tela.f01.setVisible(b);
			tela.f02.setVisible(b);
			break;
		case 1:
			tela.f0f1.setVisible(!b);
			tela.f1f2.setVisible(!b);
			tela.f11.setVisible(b);
			tela.f12.setVisible(b);
			break;
		case 2:
			tela.f1f2.setVisible(!b);
			tela.f2f3.setVisible(!b);
			tela.f21.setVisible(b);
			tela.f22.setVisible(b);
			break;
		case 3:
			tela.f2f3.setVisible(!b);
			tela.f3f4.setVisible(!b);
			tela.f31.setVisible(b);
			tela.f32.setVisible(b);
			break;
		case 4:
			tela.f0f4.setVisible(!b);
			tela.f3f4.setVisible(!b);
			tela.f41.setVisible(b);
			tela.f42.setVisible(b);
			break;
		}
	}

	private void tempoSemComer(int i) {
		int atual = (int) (System.currentTimeMillis() - semComer[i]);
		tela.tabela.setValueAt(atual, 1, i + 1);
	}

	private void calcularMedia(int i, int tempo) {
		int valorAtual = (int) tela.tabela.getValueAt(2, i + 1);
		int media = ((valorAtual * (count[i] - 1)) + tempo) / count[i];
		tela.tabela.setValueAt(media, 2, i + 1);
	}

	private void maiorEspera(int i, int tempo) {
		int valorAtual = (int) tela.tabela.getValueAt(3, i + 1);
		if (tempo > valorAtual)
			tela.tabela.setValueAt(tempo, 3, i + 1);
	}

	private void pegarGarfos(int i) {
		down(mutex);
		estado[i] = FAMINTO;
		testar(i);
		mutex.release();
		down(s[i]);
	}

	private void devolverGarfos(int i) {
		down(mutex);
		visibilidadeGarfos(i, false);
		estado[i] = PENSANDO;
		testar(ESQUERDA[i]);
		testar(DIREITA[i]);
		mutex.release();
	}

	private void testar(int i) {
		if ((estado[i] == FAMINTO) && (estado[ESQUERDA[i]] != COMENDO) && (estado[DIREITA[i]] != COMENDO)) {
			visibilidadeGarfos(i, true);
			estado[i] = COMENDO;
			tela.tabela.setValueAt(++count[i], 0, i + 1);
			s[i].release();
		}
	}

	public void run() {
		int id = Integer.parseInt(Thread.currentThread().getName());
		semComer[id] = System.currentTimeMillis();
		while (true) {
			pensar();
			espera[id] = System.currentTimeMillis();
			pegarGarfos(id);
			tempoSemComer(id);
			int tempo = (int) (System.currentTimeMillis() - espera[id]);
			calcularMedia(id, tempo);
			maiorEspera(id, tempo);
			comer();
			semComer[id] = System.currentTimeMillis();
			devolverGarfos(id);
		}
	}
}
