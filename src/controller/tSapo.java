package controller;

public class tSapo extends Thread {

	private int idSapo;
	private static int posicao;
	private int somap;

	public tSapo(int idSapo) {
		this.idSapo = idSapo;
	}

	@Override
	public void run() {
		corrida();
	}

	private void corrida() {
		int chegada = 100;

		while (chegada > somap) {
			try {
				sleep(1000);
				int pulo = (int) (Math.random() * 11);
				somap += pulo;
				System.out.println("O sapo #" + idSapo + " pulou " + pulo + " cm(s), e acumulou " + somap + " cms(s)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		posicao++;
		System.out.println("O sapo #" + idSapo + " chegou em " + posicao + "o lugar");
	}

}
