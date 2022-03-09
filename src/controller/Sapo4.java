package controller;

public class Sapo4 extends Thread {

	private int pulo;
	private int somap;
	private int chegada;

	public Sapo4(int pulo, int chegada, int somap) {
		this.pulo = pulo;
		this.somap = somap;
		this.chegada = chegada;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		int tempo = 10;
		chegada = 1000;
		
		while (chegada > somap) {
			pulo = (int) (Math.random() * 100) + 1;
			try {
				sleep(tempo*pulo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			somap = somap + pulo;
			if (somap >= chegada) {
				System.out.println("O sapo 4 chegou!");
			} else {
				System.out.println("O sapo 4 pulou " + pulo + " cms." + "\nPercorreu: " + somap + " cms.");
			}
		}
	}

}
